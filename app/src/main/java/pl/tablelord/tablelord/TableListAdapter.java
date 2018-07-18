package pl.tablelord.tablelord;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class TableListAdapter extends BaseAdapter {

    private Context mContext;
    private List<Table>mTableList;

    //constructor

    public TableListAdapter(Context mContext, List<Table> mTableList){
        this.mContext=mContext;
        this.mTableList=mTableList;
    }

    @Override
    public int getCount() {
        return mTableList.size();
    }

    @Override
    public Object getItem(int position) {
        return mTableList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        View view = View.inflate(mContext,R.layout.table_list_upper_room_one, null);
        TextView tableNumber =(TextView) view.findViewById(R.id.table_numer);
        TextView tablePlaces =(TextView) view.findViewById(R.id.table_places);
        TextView tableStatus =(TextView) view.findViewById(R.id.table_status);
        // Set text for Textview
        tableNumber.setText(String.valueOf(mTableList.get(position).getTableNo()));
        tablePlaces.setText(String.valueOf(mTableList.get(position).getPlaces()));
        tableStatus.setText(String.valueOf(mTableList.get(position).getStatus()));

        //save product id to tag
        view.setTag(mTableList.get(position).getTableNo());
        return view;
    }
}
