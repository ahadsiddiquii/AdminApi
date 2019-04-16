package com.example.adminapi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       openAdminLogin();
    }
    public void openAdminLogin(){
        Intent intent = new Intent(this, AdminLog.class);
        startActivity(intent);
        finish();
    }
}
