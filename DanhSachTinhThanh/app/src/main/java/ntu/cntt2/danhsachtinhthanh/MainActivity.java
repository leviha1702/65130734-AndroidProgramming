package ntu.cntt2.danhsachtinhthanh;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> dsTenTinhThanhVN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dsTenTinhThanhVN = new ArrayList<String>();

        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đà Nẵng");
        dsTenTinhThanhVN.add("Cần Thơ");
        dsTenTinhThanhVN.add("An Giang");
        dsTenTinhThanhVN.add("Bà Rịa - Vũng Tàu");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsTenTinhThanhVN);

        ListView lvDanhSachTT = (ListView) findViewById(R.id.lvDanhSachTT);
        lvDanhSachTT.setAdapter(adapter);

        lvDanhSachTT.setOnItemClickListener(BoLangNghevaXL);
    }
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
            String strTenTinhChon=dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, strTenTinhChon, Toast.LENGTH_SHORT).show();
        }
    };
}