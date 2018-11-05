package com.example.drake.codepathintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSecondActivity(View view) {
        //No permission set, app will crash when using action_dial
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+50975647382"));
        startActivity(i);
    }
}
