package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.userName);
        pwd=(EditText)findViewById(R.id.password);

    }
    public void onclick(View view)

    {
        String userName= user.getText().toString();
        String password= pwd.getText().toString();

        if(userName.equals("harman") && password.equals("harman"))
        {
            Intent intent= new Intent(MainActivity.this,ApplicationActivity.class);
            startActivity(intent);
        }
        else
            Toast.makeText(MainActivity.this,"invalid user",Toast.LENGTH_LONG).show();
    }
}
