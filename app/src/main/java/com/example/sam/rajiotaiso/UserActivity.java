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
        TextView langageEtudie = (TextView)findViewById(R.id.result_langage);
        TextView ecoleNom = (TextView)findViewById(R.id.result_ecole);

        UserModel model = getIntent().getExtras().getParcelable("user");

        String name = model.getUsername();
        String langage = model.getLangage();
        String ecole = model.getEcole();

        nomParticipant.setText(name);
        langageEtudie.setText(langage);
        ecoleNom.setText(ecole);



    }
}
