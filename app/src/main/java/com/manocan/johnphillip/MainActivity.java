package com.manocan.johnphillip;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Activity Life Cycle");
        setContentView(R.layout.activity_main);
        Log.d("4ITH", "onCreate() has sucessfully executed");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("4ITH","onResume() has sucessfully executed");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("4ITH","onPause() has sucessfully executed");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d("4ITH","onStop() has sucessfully executed");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("4ITH","onDestroy() has sucessfully executed");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("4ITH","onRestart() has sucessfully executed");
    }

    public void BackDisplayMsg(View v)
    {
        Toast.makeText(this, "Sorry no page is available.", Toast.LENGTH_LONG).show();
    }

    public void NextDisplayMsg(View v)
    {
        Snackbar.make(v,"Sorry no page is available.",Snackbar.LENGTH_LONG).show();
    }


}
