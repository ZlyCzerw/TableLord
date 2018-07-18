package pl.tablelord.tablelord;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView lvTables;
    private TableListAdapter adapter;
    private List<Table> mTableList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTables=(ListView)findViewById(R.id.listView_tables);
        mTableList = new ArrayList<>();
        // Here add from DB

        mTableList.add(new Table(1,100,2,1));
        mTableList.add(new Table(1,101,2,0));
        mTableList.add(new Table(1,102,2,1));
        mTableList.add(new Table(1,103,2,1));
        mTableList.add(new Table(1,104,4,1));
        mTableList.add(new Table(1,105,6,1));
        mTableList.add(new Table(1,106,4,1));
        mTableList.add(new Table(1,107,4,0));
        mTableList.add(new Table(1,108,4,1));
        mTableList.add(new Table(1,109,6,1));
        mTableList.add(new Table(1,110,4,1));
        mTableList.add(new Table(1,111,4,1));
        mTableList.add(new Table(1,112,4,1));
        mTableList.add(new Table(1,113,4,0));
        mTableList.add(new Table(1,114,8,1));
        mTableList.add(new Table(1,115,8,1));
        mTableList.add(new Table(1,116,4,1));
        mTableList.add(new Table(1,117,4,0));
        mTableList.add(new Table(1,118,8,0));
        mTableList.add(new Table(1,119,4,0));
        mTableList.add(new Table(1,120,6,1));
        mTableList.add(new Table(1,121,4,1));
        mTableList.add(new Table(1,122,8,1));

        //init adaptr

        adapter = new TableListAdapter(getApplicationContext(),mTableList);
        lvTables.setAdapter(adapter);

        lvTables.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // display TOAST
                //TextView toastTextView=(TextView)view;
                Toast.makeText(getApplicationContext(),"you want to book table: " + view.getTag(), Toast.LENGTH_SHORT);
                //Toast.makeText(getApplicationContext(),"Do you wish to book: "+ toastTextView.getText()+ position,Toast.LENGTH_SHORT).show();

            }
        });



    }
}