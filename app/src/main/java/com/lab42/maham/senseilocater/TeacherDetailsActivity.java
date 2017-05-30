package com.lab42.maham.senseilocater;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TeacherDetailsActivity extends AppCompatActivity {

    TextView teacher_name ;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_details);
        teacher_name = (TextView) findViewById(R.id.tv_name_teacher_details);
        teacher_name.setText(getIntent().getExtras().getString("name"));


        b = (Button)findViewById(R.id.teacher_profile_check_notif);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

                Notification notif = new Notification.Builder(getApplicationContext())
                        .setSmallIcon(R.drawable.logo1_web)
                        .setContentTitle("Notification")
                        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.logo1_web))
                        .setContentText("You have new Notification")
                        .build();

                notificationManager.notify(0,notif);


            }
        });
    }
}
