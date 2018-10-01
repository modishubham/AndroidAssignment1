package com.example.shubham.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.loginmodule.Login;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    EditText et1,et2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btnClick);
        et1 = (EditText) findViewById(R.id.et1);
        et2 =  (EditText)findViewById(R.id.et2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et1.getText().toString();
                String password = et2.getText().toString();
                Login login = new Login(MainActivity.this);
                login.checkData(username,password);
            }
        });
    }
}
