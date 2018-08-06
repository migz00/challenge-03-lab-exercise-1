package com.migue.challenge_03_lab_exercise_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.et_message);
        btn = (Button) findViewById(R.id.btn_clear);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        et1.setText("");
    }
}
