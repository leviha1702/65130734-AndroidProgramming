package ntu.cntt2.tuychinhlv;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvDSMonAn = (ListView) findViewById(R.id.lvDSMonAn);

        ArrayList<MonAn> dsMonAn = new ArrayList<>();
        dsMonAn.add( new MonAn("Cơm tấm sườn", 25000, "Nội dung mô tả", R.drawable.cs));
        dsMonAn.add( new MonAn("Cơm tấm sườn trứng", 30000, "Nội dung mô tả", R.drawable.cst));
        dsMonAn.add(new MonAn("Cơm tấm sườn đặc biệt", 35000, "Nội dung mô tả", R.drawable.db));
        dsMonAn.add(new MonAn("Cơm tấm sà bì", 25000, "Nội dung mô tả", R.drawable.sb));
        dsMonAn.add(new MonAn("Cơm gà chiên", 35000, "Nội dung mô tả", R.drawable.cg));

        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);

        lvDSMonAn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MonAn monAnChon = dsMonAn.get(i);
                Toast.makeText(MainActivity.this, monAnChon.getTenMonAn(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}