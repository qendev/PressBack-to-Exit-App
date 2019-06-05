package com.example.pressbackagaintoexitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {


        if(backPressedTime + 2000> System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;

        }else{
            backToast=Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backPressedTime= System.currentTimeMillis();
    }
}
