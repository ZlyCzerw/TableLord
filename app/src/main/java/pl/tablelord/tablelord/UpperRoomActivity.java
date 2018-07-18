/*package pl.tablelord.tablelord;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class UpperRoomActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView list;
    String[] tables={"Table 100", "Table 101", "Table 102","Table 103","Table 104","Table 105","Table 106" ,"Table 107","Table 108","Table 109","Table 110","Table 111","Table 112","Table 113","Table 114","Table 115","Table 116","Table 117","Table 118","Table 119","Table 120"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_upper_room);
        list=findViewById(R.id.roomOneList);
        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, tables);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        TextView toastTextView=(TextView)view;
        Toast.makeText(this,"Do you wish to book: "+ toastTextView.getText()+ position,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
*/