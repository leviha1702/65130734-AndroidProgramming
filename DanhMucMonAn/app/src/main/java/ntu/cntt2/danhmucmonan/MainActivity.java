package ntu.cntt2.danhmucmonan;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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

        ArrayList<String> danhMucMonAn = new ArrayList<String>();
        danhMucMonAn.add("Trứng ốp la");
        danhMucMonAn.add("Gà xaò sả ớt");
        danhMucMonAn.add("Xôi hấp nước cốt dừa");
        danhMucMonAn.add("Cơm cháy kho quẹt");
        danhMucMonAn.add("Bánh mì xí mại");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, danhMucMonAn);
        ListView lvDanhMucMA = findViewById(R.id.lvDanhMucMA);
        lvDanhMucMA.setAdapter(adapter);

    }
}