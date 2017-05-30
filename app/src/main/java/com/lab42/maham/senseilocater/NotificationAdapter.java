package com.lab42.maham.senseilocater;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;
import java.util.Objects;

/**
 * Created by lenovo on 4/24/2017.
 */
public class NotificationAdapter extends ArrayAdapter{

    Context con;
    List<NotificationBO> list;
   // String [] list;
    TextView tv1r;
    TextView tv2n;
    TextView tv3d;
    TextView tv4t;
    public NotificationAdapter(Context context, int resource, List<NotificationBO> objects) {
        super(context, resource, objects);
        this.con=context;
        list=objects;
    }


   public View getView(int position,View convertView, ViewGroup parent){

      View v=null;
       viewHolder1 vh=new viewHolder1();
        if(convertView==null) {
            LayoutInflater layoutInflater = (LayoutInflater) con.getSystemService(con.LAYOUT_INFLATER_SERVICE);
            v = layoutInflater.inflate(R.layout.notification_cell, null, true);
            this.tv1r=(TextView) v.findViewById(R.id.tv_rollno);
            vh.tvrollno=this.tv1r;
            this.tv2n=(TextView) v.findViewById(R.id.tv_name);
            vh.tvname=this.tv2n;
            this.tv3d=(TextView) v.findViewById(R.id.tv_date);
            vh.tvdate=this.tv3d;
            this.tv4t=(TextView) v.findViewById(R.id.tv_time);
            vh.tvtime=this.tv4t;
            v.setTag(vh);
            }
       else {
            v=convertView;
            vh=(viewHolder1) v.getTag();
        }
      //  String n=list[position];
       NotificationBO n= new NotificationBO(list.get(position).getRolno(),list.get(position).getName(),list.get(position).getDate(),list.get(position).getTime());
       if(n!=null) {
           vh.tvrollno.setText(n.getRolno());
           vh.tvname.setText(n.getName());
           vh.tvdate.setText(n.getDate());
           vh.tvtime.setText(n.getTime());
       }
       return v;
}

}
class viewHolder1
{
    public TextView tvrollno;
    public TextView tvname;
    public TextView tvdate;
    public TextView tvtime;
}
