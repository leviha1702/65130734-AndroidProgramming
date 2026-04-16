package ntu.cntt2.luyentap;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Cau4Fragment extends Fragment {
    public static Cau4Fragment newInstance(String param1, String param2) {
        Cau4Fragment fragment = new Cau4Fragment();
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
//        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", getActivity().MODE_PRIVATE, null);
//        String sqlXoaBangNeuDaCo="DROP TABLE IF EXISTS Books";
//
//        String sqlTaoBang="CREATE TABLE Books(BookID PRIMARY KEY, BookName TEXT, Page integer,Price Float,Decription TEXT)";
//        db.execSQL(sqlXoaBangNeuDaCo);
//        db.execSQL(sqlTaoBang);
//
//        String sqlThem1="Insert into Books(BookID,BookName,Page,Price,Decription) values(1,'Android',100,1000,'Sách về Android')";
//        String sqlThem2="Insert into Books(BookID,BookName,Page,Price,Decription) values(2,'Java',200,2000,'Sách về Java')";
//        String sqlThem3="Insert into Books(BookID,BookName,Page,Price,Decription) values(3,'PHP',300,3000,'Sách về PHP')";
//        String sqlThem4="Insert into Books(BookID,BookName,Page,Price,Decription) values(4,'Python',400,4000,'Sách về Python')";
//        String sqlThem5="Insert into Books(BookID,BookName,Page,Price,Decription) values(5,'Học làm giàu',500,5000,'Sách về học làm giàu')";
//
//        db.execSQL(sqlThem1);
//        db.execSQL(sqlThem2);
//        db.execSQL(sqlThem3);
//        db.execSQL(sqlThem4);
//        db.execSQL(sqlThem5);
//
//        db.close();

        SQLiteDatabase db = getActivity().openOrCreateDatabase("QLSach.db", getActivity().MODE_PRIVATE, null);
        String sqlSelect = "SELECT * FROM Books";
        Cursor cursor = db.rawQuery(sqlSelect, null);
        cursor.moveToFirst();
        ArrayList<Book> dsSach = new ArrayList<Book>();
        while (cursor.moveToNext()) {
            int bookID = cursor.getInt(0);
            String bookName = cursor.getString(1);
            int page = cursor.getInt(2);
            float price = cursor.getFloat(3);
            String decription = cursor.getString(4);
            Book book = new Book(bookID, bookName, page, price, decription);
            dsSach.add(book);
        }
        ArrayList<String> dsTenSach=new ArrayList<String>();
        for(int i=0;i<dsSach.size();i++){
            dsTenSach.add(dsSach.get(i).getBookName());
        }

        View viewCau4= inflater.inflate(R.layout.fragment_cau4, container, false);
        ListView listView=viewCau4.findViewById(R.id.lvTenSach);
        ArrayAdapter<String> adapterTenSach =new ArrayAdapter<String>(viewCau4.getContext(),android.R.layout.simple_list_item_1,dsTenSach);
        listView.setAdapter(adapterTenSach);

        return viewCau4;
    }
}