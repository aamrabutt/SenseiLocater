package com.lab42.maham.senseilocater;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TeacherListFragment extends Fragment {

    ListView listView = null;
    myAdapter adapter = null;
    String [] dummy = {"a","b","c","Sania Ashraf" , "Kashif Murtaza" , "Waqar ul Qonain" , "Ahmad Ghazali" , "Aneeze Babar" , "Abdullah" , "Aisha Khan" , "Anum Tariq" , "Fareed ul Hassan" , "Ahmad Raza"} ;
  public TeacherListFragment() {

    }
 @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_teacher_list2, container, false);
        listView = (ListView)   view.findViewById(R.id.list_view_teachers_list);
        if(listView != null) {
            adapter = new myAdapter(getActivity(), R.layout.list_item_teachers_list, dummy);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> adapter, View arg1, int position, long arg3) {

                    Intent i = new Intent( getActivity() , TeacherDetailsActivity.class );
                    i.putExtra("name" , dummy[position]);
                    getActivity().startActivity(i);
                }

            });
        }
     return view;
    }

}
