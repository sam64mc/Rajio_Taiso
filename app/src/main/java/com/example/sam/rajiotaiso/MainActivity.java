package com.example.sam.rajiotaiso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddUser = (Button) findViewById(R.id.add_user);
        final EditText username_input = (EditText)findViewById(R.id.username_input);
        buttonAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,(username_input.getText().toString()),
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
