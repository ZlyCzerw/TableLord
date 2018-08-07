package pl.tablelord.tablelord;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.sql.Ref;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
    private ListView lvTables;
    private TableListAdapter tableListAdapter;
    private List<Table> mTableList;

    private DatabaseReference isFreeRef;
    private DatabaseReference seatsNoRef;
    private DatabaseReference tableNoRef;

    private  FirebaseDatabase database;
    private DatabaseReference allChildrenRef;
    private ChildEventListener isFreeChildEventListener;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTables=(ListView)findViewById(R.id.listView_tables);
        mTableList = new ArrayList<>();
        // Here add from DB
        database = FirebaseDatabase.getInstance();
        isFreeRef = database.getReference("Rooms/Room1/Tables/Table1/isFree");
        seatsNoRef = database.getReference("Rooms/Room1/Tables/Table1/seatsNo");
        tableNoRef = database.getReference("Rooms/Room1/Tables/Table1/tableNo");
        allChildrenRef = database.getReference().child("Rooms/Room1/Tables");

        //save "false" to database:
        isFreeRef.setValue(false);
        seatsNoRef.setValue(7);
        tableNoRef.setValue(222);



        mTableList.add(new Table(1,100,2,true));
        mTableList.add(new Table(1,101,2,false));
        mTableList.add(new Table(1,102,2,true));
        mTableList.add(new Table(1,103,2,true));
        mTableList.add(new Table(1,104,4,true));
        mTableList.add(new Table(1,105,6,true));
        mTableList.add(new Table(1,106,4,true));
        mTableList.add(new Table(1,107,4,false));
        mTableList.add(new Table(1,108,4,true));
        mTableList.add(new Table(1,109,6,true));
        mTableList.add(new Table(1,110,4,true));
        mTableList.add(new Table(1,111,4,true));
        mTableList.add(new Table(1,112,4,true));
        mTableList.add(new Table(1,113,4,false));
        mTableList.add(new Table(1,114,8,true));
        mTableList.add(new Table(1,115,8,true));
        mTableList.add(new Table(1,116,4,true));
        mTableList.add(new Table(1,117,4,false));
        mTableList.add(new Table(1,118,8,false));
        mTableList.add(new Table(1,119,4,false));
        mTableList.add(new Table(1,120,6,true));
        mTableList.add(new Table(1,121,4,true));
        mTableList.add(new Table(1,122,8,false));

        //init adaptr

        tableListAdapter = new TableListAdapter(this,
                R.layout.table_list_upper_room_one,
                mTableList);
        lvTables.setAdapter(tableListAdapter);


        lvTables.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // display TOAST
                //TextView toastTextView=(TextView)view;
                Toast.makeText(getApplicationContext(),"you want to book table: " + view.getTag(), Toast.LENGTH_SHORT);
                //Toast.makeText(getApplicationContext(),"Do you wish to book: "+ toastTextView.getText()+ position,Toast.LENGTH_SHORT).show();

            }
        });

        isFreeChildEventListener = new ChildEventListener() {
            @Override
            public void onChildAdded(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
             // Table table = dataSnapshot.getValue(Table.class);
             // tableListAdapter.add(table);


            }

            @Override
            public void onChildChanged(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {
              Table table = dataSnapshot.getValue(Table.class);
              tableListAdapter.add(table);
            //  tableListAdapter.add(mTableList);
            }

            @Override
            public void onChildRemoved(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(@NonNull DataSnapshot dataSnapshot, @Nullable String s) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        };
        allChildrenRef.addChildEventListener(isFreeChildEventListener);



    }
}
