package ntu.cntt2.linearlayout03;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtSoThu1;
    EditText edtSoThu2;
    EditText edtKetQua;
    Button btnCong;
    Button btnTru;
    Button btnNhan;
    Button btnChia;
    void TimDieuKhien(){
        edtSoThu1 = (EditText)findViewById(R.id.edtSoThu1);
        edtSoThu2 = (EditText)findViewById(R.id.edtSoThu2);
        edtKetQua = (EditText)findViewById(R.id.edtKetQua);
        btnCong = (Button)findViewById(R.id.btnCong);
        btnTru = (Button)findViewById(R.id.btnTru);
        btnNhan = (Button)findViewById(R.id.btnNhan);
        btnChia = (Button)findViewById(R.id.btnChia);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyCong(v);
            }
        });
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyChia(v);
            }
        });
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyNhan(v);
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XuLyTru(v);
            }
        });
    }

    public void XuLyCong(View v) {
        String so1 = edtSoThu1.getText().toString();
        String so2 = edtSoThu2.getText().toString();
        float s1 = Float.parseFloat(so1);
        float s2 = Float.parseFloat(so2);
        float kq = s1 + s2;
        String ketqua = String.valueOf(kq);
        edtKetQua.setText(ketqua);
    }
    public void XuLyTru(View v) {
        String so1 = edtSoThu1.getText().toString();
        String so2 = edtSoThu2.getText().toString();
        float s1 = Float.parseFloat(so1);
        float s2 = Float.parseFloat(so2);
        float kq = s1 - s2;
        String ketqua = String.valueOf(kq);
        edtKetQua.setText(ketqua);
    }
    public void XuLyNhan(View v) {
        String so1 = edtSoThu1.getText().toString();
        String so2 = edtSoThu2.getText().toString();
        float s1 = Float.parseFloat(so1);
        float s2 = Float.parseFloat(so2);
        float kq = s1 * s2;
        String ketqua = String.valueOf(kq);
        edtKetQua.setText(ketqua);
    }
    public void XuLyChia(View v) {
        String so1 = edtSoThu1.getText().toString();
        String so2 = edtSoThu2.getText().toString();
        float s1 = Float.parseFloat(so1);
        float s2 = Float.parseFloat(so2);
        float kq = s1 / s2;
        String ketqua = String.valueOf(kq);
        edtKetQua.setText(ketqua);
    }
}