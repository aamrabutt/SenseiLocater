package com.lab42.maham.senseilocater;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class activity_signup_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_menu);

        Button b1 = (Button)findViewById(R.id.tv_signup_menu_as_std);
        Button b2 = (Button)findViewById(R.id.tv_signup_menu_as_teacher);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),activity_students_form.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),activity_teacher_form.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onBackPressed(){
        //Toast.makeText(getApplicationContext(),"end",Toast.LENGTH_SHORT).show();

        //finish();
        //System.exit(0);
    }
}
