package pl.tablelord.tablelord;

import com.google.firebase.database.DataSnapshot;

import java.util.ArrayList;
import java.util.HashMap;

public class recArrayList {
    /**
     *
     *  I like this because it gest 'any' Firebase Database data down to your app for manipulation.
     *  You don't need to know the field names or the data types. Those are retrieved.
     */
    public ArrayList<HashMap<String, Object>> recArrayList(DataSnapshot snapshot){

        ArrayList<HashMap<String, Object>> list = new ArrayList<>();

        if (snapshot == null){

            return list;
        }

        // This is awesome! You don't have to know the data structure of the database.
        Object fieldsObj = new Object();

        HashMap fldObj;

        for (DataSnapshot shot : snapshot.getChildren()){

            try{

                fldObj = (HashMap)shot.getValue(fieldsObj.getClass());

            }catch (Exception ex){

                // My custom error handler. See 'ErrorHandler' in Gist
//                ErrorHandler.logError(ex);

                continue;
            }

            // Include the primary key of this Firebase data record. Named it 'recKeyID'
            fldObj.put("recKeyID", shot.getKey());

            list.add(fldObj);
        }

        return list;
    }
}
