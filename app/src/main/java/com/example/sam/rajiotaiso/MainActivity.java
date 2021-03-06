package com.example.sam.rajiotaiso;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonAddUser;
    EditText username_input;
    EditText langage;
    EditText ecole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAddUser = (Button) findViewById(R.id.add_user);
        username_input = (EditText)findViewById(R.id.username_input);
        langage = (EditText)findViewById(R.id.langageEditText);
        ecole = (EditText)findViewById(R.id.ecoleEditText);

        buttonAddUser.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, UserActivity.class);

                Toast.makeText(MainActivity.this,(username_input.getText().toString()),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,(langage.getText().toString()),
                        Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this,(ecole.getText().toString()),
                        Toast.LENGTH_LONG).show();

                UserModel model = new UserModel(username_input.getText().toString(),
                        langage.getText().toString(),ecole.getText().toString());

                intent.putExtra("user",model);

                startActivity(intent);
            }



        });

    }
}
