package com.example.loginmodule;

import android.content.Context;
import android.widget.Toast;

public class Login {
private Context context;
    public Login(Context context) {
        this.context=context;
    }

    public void checkData(String username, String password) {
        if(username.equals("shubham") && password.equals("12345")) {
            Toast.makeText(context, "success", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(context, "failure", Toast.LENGTH_LONG).show();
        }
    }
}
