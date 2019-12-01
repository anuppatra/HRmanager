package com.android.HRmanager.sampledata;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.HRmanager.MainActivity;
import com.android.HRmanager.R;
import com.android.HRmanager.ui.LoginActivity;
import com.android.HRmanager.ui.RegisterActivity;
import com.android.HRmanager.ui.UserProfileFragment;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class application_section extends Activity {

    Button sendmail,requestApplication;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.applicationdrawer_layout);
            sendmail = (Button) findViewById(R.id.leaveApplication);
            requestApplication=findViewById(R.id.requestApplication);
            FirebaseAuth mAuth= FirebaseAuth.getInstance();
            final FirebaseUser user = mAuth.getCurrentUser();
            sendmail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        }
                    });
            requestApplication.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(application_section.this,MainActivity.class));
                }
            });

                /*    Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                            "mailto","anup.patra97@gmail.com", null));
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Leave Application");
                    intent.putExtra(Intent.EXTRA_TEXT,"Greetings. This is mr X requesting for a leave due to this.");
                    startActivity(Intent.createChooser(intent,"Choose Client : "));
*/
                }





}
