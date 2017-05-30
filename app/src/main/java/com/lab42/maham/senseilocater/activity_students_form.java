package com.lab42.maham.senseilocater;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.annotation.StringRes;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class activity_students_form extends AppCompatActivity {

    //EditText t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_form);

        Button bu = (Button)findViewById(R.id.btn_std_profile_signup);

//        t1 = (EditText)findViewById(R.id.et_std_profile_fname);
//        t2 = (EditText)findViewById(R.id.et_std_profile_lname);
//        t3 = (EditText)findViewById(R.id.et_std_profile_rollNo);
//        t4 = (EditText)findViewById(R.id.et_std_profile_email);
//        t5 = (EditText)findViewById(R.id.et_std_profile_password);
//        t6 = (EditText)findViewById(R.id.et_std_profile_password_reEnter);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),TeachersListActivity.class);
                startActivity(intent);
            }
        });
    }

//    final TextInputLayout Fname = (TextInputLayout) findViewById(R.id.Stu_FName_Wrapper);
//    final TextInputLayout Lname=(TextInputLayout) findViewById(R.id.Stu_Lname_Wrapper);
//    final TextInputLayout email=(TextInputLayout) findViewById(R.id.Stu_Email_Wrapper);
//    final TextInputLayout pass=(TextInputLayout) findViewById(R.id.Stu_Pass_Wrapper);
//    final TextInputLayout repass=(TextInputLayout) findViewById(R.id.Stu_RePass_Wrapper);
//    final TextInputLayout roll=(TextInputLayout) findViewById(R.id.Stu_Roll_Wrapper);
//
//


//    Fname.setHint(getString(R.string.std_profile_fname));
//    Lname.setHint(getString(R.string.std_profile_lname));
//    email.setHint(getString(R.string.std_profile_email));
//    pass.setHint(getString(R.string.std_profile_password));
//    repass.setHint(getString(R.string.std_profile_password_reEnter));
//    roll.setHint(getString(R.string.std_profile_rolNo));

//    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
//    private void showProgress(final boolean show) {
//        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
//        // for very easy animations. If available, use these APIs to fade-in
//        // the progress spinner.
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
//            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);
//
//            t1.setVisibility(show ? View.GONE : View.VISIBLE);
//            t1.animate().setDuration(shortAnimTime).alpha(
//                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
//                @Override
//                public void onAnimationEnd(Animator animation) {
//                    t1.setVisibility(show ? View.GONE : View.VISIBLE);
//                }
//            });
//
//            t2.setVisibility(show ? View.VISIBLE : View.GONE);
//            t2.animate().setDuration(shortAnimTime).alpha(
//                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
//                @Override
//                public void onAnimationEnd(Animator animation) {
//                    t2.setVisibility(show ? View.VISIBLE : View.GONE);
//                }
//            });
//        } else {
//            // The ViewPropertyAnimator APIs are not available, so simply show
//            // and hide the relevant UI components.
//            t2.setVisibility(show ? View.VISIBLE : View.GONE);
//            t1.setVisibility(show ? View.GONE : View.VISIBLE);
//        }
//    }
}
