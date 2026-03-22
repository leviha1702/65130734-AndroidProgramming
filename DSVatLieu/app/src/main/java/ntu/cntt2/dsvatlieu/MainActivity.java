package ntu.cntt2.dsvatlieu;

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


        ArrayList<String> dsVatLieu;
        dsVatLieu = new ArrayList<>();
        dsVatLieu.add("Xi măng");
        dsVatLieu.add("Gạch");
        dsVatLieu.add("Đá ốp lát");
        dsVatLieu.add("Ống nhựa");
        dsVatLieu.add("Sơn chống thấm");
        dsVatLieu.add("...");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dsVatLieu);
        ListView lvDSVatLieu = (ListView) findViewById(R.id.lvDSVatLieu);
        lvDSVatLieu.setAdapter(adapter);

    }
}