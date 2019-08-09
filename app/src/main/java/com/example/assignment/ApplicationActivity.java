package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class ApplicationActivity extends AppCompatActivity {
    EditText tsk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application);
        tsk=(EditText)findViewById(R.id.task);
    }
    public void onClick(View view)
    {
        if(!tsk.getText().toString().isEmpty())
        {
            ArrayList<String> list = new ArrayList<String>();
            list.add(tsk.getText().toString());
        }
    }
}
