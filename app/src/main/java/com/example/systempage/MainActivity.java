package com.example.systempage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void edit(View view) {
        Intent intent = new Intent(this, Activityedit.class);
        startActivity(intent);
    }

    public void go(View view) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public void go2(View view) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    public void go3(View view) {
        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);
    }

    public void go4(View view) {
        Intent intent = new Intent(this, Activity5.class);
        startActivity(intent);
    }

    public void go5(View view) {
        Intent intent = new Intent(this, Activity6.class);
        startActivity(intent);
    }

    public void go6(View view) {
        Intent intent = new Intent(this, Activity7.class);
        startActivity(intent);
    }

    public void go7(View view) {
        Intent intent = new Intent(this, Activity8.class);
        startActivity(intent);
    }

    public void go8(View view) {
        Intent intent = new Intent(this, Activity9.class);
        startActivity(intent);
    }

    public void go9(View view) {
        Intent intent = new Intent(this, Activity10.class);
        startActivity(intent);
    }
}