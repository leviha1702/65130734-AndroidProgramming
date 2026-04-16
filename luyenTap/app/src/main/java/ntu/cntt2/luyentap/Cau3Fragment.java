package ntu.cntt2.luyentap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Cau3Fragment extends Fragment {
    LandScapeAdapter adapter;
    ArrayList<LandScape> arrayList;
    RecyclerView recyclerViewLandScape;



    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        arrayList = new ArrayList<>();
        LandScape landScape1 = new LandScape("ny", "Thành phố New York.");
        arrayList.add(landScape1);
        arrayList.add(new LandScape("efel", "Tháp Eiffel"));
        arrayList.add(new LandScape("hn", "Hồ Gươm"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        recyclerViewLandScape = viewCau3.findViewById(R.id.rcyCau3);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        adapter = new LandScapeAdapter(viewCau3.getContext(), arrayList);
        recyclerViewLandScape.setAdapter(adapter);
        return viewCau3;
    }
}