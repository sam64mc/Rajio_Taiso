package com.example.sam.rajiotaiso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

     String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        TextView nomParticipant =(TextView)findViewById(R.id.result_username);

        Intent intent = this.getIntent();
        name = intent.getStringExtra("userName");
        nomParticipant.setText(name);

    }
}
