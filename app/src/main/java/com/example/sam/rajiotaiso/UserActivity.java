package com.example.sam.rajiotaiso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView nomParticipant =(TextView)findViewById(R.id.result_username);

        UserModel model = getIntent().getExtras().getParcelable("userName");

        String username = model.getUsername();

        nomParticipant.setText(username);

    }
}
