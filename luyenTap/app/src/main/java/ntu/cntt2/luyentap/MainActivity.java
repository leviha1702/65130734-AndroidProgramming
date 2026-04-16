package ntu.cntt2.luyentap;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomnav = findViewById(R.id.bottomNavigationView);
        bottomnav.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectFragment = null;
                int itemId = item.getItemId();
                if (itemId == R.id.nav_welcome) {
                    selectFragment = new Cau1Fragment();
                } else if (itemId == R.id.nav_cau1) {
                    selectFragment = new Cau1Fragment();
                } else if (itemId == R.id.nav_cau2) {
                    selectFragment = new Cau2Fragment();
                } else if (itemId == R.id.nav_cau3) {
                    selectFragment = new Cau3Fragment();
                } else if (itemId == R.id.nav_cau4) {
                    selectFragment = new Cau4Fragment();
                }

                if (selectFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentSpace, selectFragment).commit();
                }
                return true;
            }
        });
    }
}
