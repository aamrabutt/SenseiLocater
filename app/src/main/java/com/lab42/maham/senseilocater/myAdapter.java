package com.lab42.maham.senseilocater;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 4/24/2017.
 */
public class myAdapter extends ArrayAdapter {
    Context context;
   // List<Object> list;
    Object [] list;

    public myAdapter(Context _context, int resource, Object [] objects) {

        super(_context, resource, objects);
        context = _context;
        list = objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v=null;
        viewHolder view_holder= new viewHolder();
        if(convertView==null) {

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v = layoutInflater.inflate(R.layout.list_item_teachers_list, null, true);
            TextView tv = (TextView) v.findViewById(R.id.tv_cell_teacher_list);
            ImageView img = (ImageView) v.findViewById(R.id.img_teacher_teacher_list);
            ImageView status = (ImageView) v.findViewById(R.id.img_status_teacher_list);
            view_holder.teacherImage= img;
            view_holder.teacherName= tv;
            view_holder.teacherStatus = status;

            v.setTag(view_holder);
        }
        else
        {
            v = convertView;
            view_holder = (viewHolder) v.getTag();
        }
       view_holder.teacherName.setText(list[position].toString());


        return  v;
 }

}
 class viewHolder
{
    ImageView teacherImage , teacherStatus;
    TextView teacherName;

}