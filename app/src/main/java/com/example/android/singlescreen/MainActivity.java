package com.example.android.singlescreen;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void reserve(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel: 01234567896"));
        if(callIntent.resolveActivity(getPackageManager())!=null) {
            startActivity(callIntent);
        }
    }

    public void getInTouch(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel: 01234567896"));
        if(callIntent.resolveActivity(getPackageManager())!=null) {
            startActivity(callIntent);
        }
    }

    public void locate(View view) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW);
        mapIntent.setData(Uri.parse("geo: 26.1518478, 91.7827728"));
        if(mapIntent.resolveActivity(getPackageManager())!=null) {
            startActivity(mapIntent);
        }
    }
}
