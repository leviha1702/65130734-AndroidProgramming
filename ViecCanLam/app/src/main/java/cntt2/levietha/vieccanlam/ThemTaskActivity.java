package cntt2.levietha.vieccanlam;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class ThemTaskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_them_task);

        FloatingActionButton floatingActionButton = findViewById(R.id.floatingActionButton2);
        floatingActionButton.setOnClickListener(v -> {

            EditText editTextName = findViewById(R.id.editTextTenCV);
            EditText editTextMessage = findViewById(R.id.editTextMessage);
            EditText editTextDate = findViewById(R.id.editTextDate);
            EditText editTextPrio = findViewById(R.id.editTextPriority);

            String tenCV = editTextName.getText().toString();
            String message = editTextMessage.getText().toString();
            String date = editTextDate.getText().toString();
            String prio = editTextPrio.getText().toString();

            if (tenCV.isEmpty() || date.isEmpty()) {
                editTextName.setError("Không được để trống");
                return;
            }

            TASKS task = new TASKS(tenCV, date, prio, message);

            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference databaseReference = database.getReference("TASKS");

            String key = databaseReference.push().getKey();

            databaseReference.child(key).setValue(task)
                    .addOnCompleteListener(t -> {
                        if (t.isSuccessful()) {
                            finish(); // quay lại Main
                        } else {
                            System.out.println("Lỗi: " + t.getException());
                        }
                    });
        });
    }
}
