package com.lab42.maham.senseilocater;
/**
 * Created by lenovo on 4/24/2017.
 */
public class NotificationBO {
    private String rolno;
    private String name;
    private String date;
    private String time;
    NotificationBO(String r,String n,String d,String t)
    {
        rolno=r;
        name=n;
        date=d;
        time=t;
    }
    String getRolno(){
        return rolno;
    }
    String getName()
    {
        return name;

    }
    String getDate(){
        return date;
    }
    String getTime()
    {
        return time;
    }

}
