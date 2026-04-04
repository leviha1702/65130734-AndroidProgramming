package ntu.cntt2.usingrecyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas ;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewDatas = getDataForRecyclerView();
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutManager);
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        recyclerViewLandScape.setAdapter(landScapeAdapter);

    }
    ArrayList<LandScape> getDataForRecyclerView() {
        ArrayList<LandScape> lsDuLieu= new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("ny", "Thành phố New York.");
        lsDuLieu.add(landScape1);
        lsDuLieu.add(new LandScape("efel", "Tháp Eiffel"));
        lsDuLieu.add(new LandScape("hn", "Hồ Gươm"));
        return lsDuLieu;
    }
}