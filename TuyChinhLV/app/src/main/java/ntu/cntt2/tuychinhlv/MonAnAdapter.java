package ntu.cntt2.tuychinhlv;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {

    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater inflater;
    private Context context;

    public MonAnAdapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.context = _context;
        this.dsMonAn = dsMonAn;
        this.inflater = LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewHienHanh = view;
        if(viewHienHanh == null)
            viewHienHanh = inflater.inflate(R.layout.item_monan, null);
        MonAn monAnHienTai = dsMonAn.get(i);
        TextView textTenMonAn = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView textDonGia = (TextView) viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textMoTa = (TextView) viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageAnhDaiDien = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);

        textTenMonAn.setText(monAnHienTai.getTenMonAn());
        textDonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textMoTa.setText(monAnHienTai.getMoTa());
        imageAnhDaiDien.setImageResource(monAnHienTai.getIdAnhMinhHoa());
        return viewHienHanh;

    }
}
