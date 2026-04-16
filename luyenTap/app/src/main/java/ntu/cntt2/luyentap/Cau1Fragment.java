package ntu.cntt2.luyentap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cau1Fragment extends Fragment {
    EditText editText_SoMet, editText_SoKiLoM;
    Button btnDoi;

    public static Cau1Fragment newInstance(String param1, String param2) {
        Cau1Fragment fragment = new Cau1Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        editText_SoMet=viewCau1.findViewById(R.id.editSoMet);
        editText_SoKiLoM=viewCau1.findViewById(R.id.editSoKiLoM);
        btnDoi=viewCau1.findViewById(R.id.btnDoi);
        btnDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soMet=editText_SoMet.getText().toString();
                String soKiLoM=editText_SoKiLoM.getText().toString();
                if(!soMet.isEmpty()){
                    double met=Double.parseDouble(soMet);
                    double km=met/1000;
                    editText_SoKiLoM.setText(String.valueOf(km));
                    Toast.makeText(viewCau1.getContext(), "m->km", Toast.LENGTH_SHORT).show();
                }
                else if(!soKiLoM.isEmpty()){
                    double km=Double.parseDouble(soKiLoM);
                    double met=km*1000;
                    editText_SoMet.setText(String.valueOf(met));
                    Toast.makeText(viewCau1.getContext(), "km->m", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return viewCau1;
    }
}