package thigk2.levietha.baithi_65130734;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ChucNang1Fragment extends Fragment {
    EditText editText_ChieuDai, editText_ChieuRong;
    Button btnChuVi, btnDienTich;
    EditText editText_Kqua;
    
    public static ChucNang1Fragment newInstance() {
        ChucNang1Fragment fragment = new ChucNang1Fragment();
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
        // Inflate the layout for this fragment
        View view1=inflater.inflate(R.layout.fragment_chuc_nang1, container, false);
        editText_ChieuDai = view1.findViewById(R.id.editText_ChieuDai);
        editText_ChieuRong = view1.findViewById(R.id.editText_ChieuRong);
        btnChuVi = view1.findViewById(R.id.btnChuVi);
        btnDienTich = view1.findViewById(R.id.btn_dienTich);
        editText_Kqua = view1.findViewById(R.id.editTextKqua);

        btnChuVi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chieuDai =editText_ChieuDai.getText().toString();
                String chieuRong=editText_ChieuRong.getText().toString();
                if(chieuDai.equals("")||chieuRong.equals("")) {
                    Toast.makeText(getActivity(), "Vui lòng nhập chiều dài và chiều rộng", Toast.LENGTH_SHORT).show();
                }
                else if(){
                    double cd = Double.parseDouble(editText_ChieuDai.getText().toString());
                    double cr = Double.parseDouble(editText_ChieuRong.getText().toString());
                    double chuVi = (cd + cr) * 2;
                    editText_Kqua.setText(String.valueOf(chuVi));
                    Toast.makeText(getActivity(), "Tính thành công", Toast.LENGTH_SHORT).show();

                }
            }

        }
        return view1;
}