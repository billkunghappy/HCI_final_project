package com.example.hci_high_fi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    void nav_bookmark_btn_click(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.bottom_nav_bookmark);
        setContentView(R.layout.activity_bookmark);
    }
    void nav_home_btn_click(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.bottom_nav_home);
        setContentView(R.layout.activity_main);
    }
}
