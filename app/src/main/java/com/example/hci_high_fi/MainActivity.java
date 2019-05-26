package com.example.hci_high_fi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static String PACKAGE_NAME;
    public static String buffer;
    public static bookmark_exhib_list bookmark_exhib_list = new bookmark_exhib_list();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.HARD_CODE_FEATURE_bookmark();
        setContentView(R.layout.activity_main);
        Fragment fragment = new homepage();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragframe, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();

    }
    void nav_bookmark_btn_click(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.bottom_nav_bookmark);
        Fragment fragment = new bookmark_page();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragframe, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
    }
    void nav_home_btn_click(View view) {
        ImageButton button = (ImageButton)findViewById(R.id.bottom_nav_home);
        Fragment fragment = new homepage();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragframe, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();

    }
    void setBuffer(String x){
        buffer=x;
    }
    static String getBuffer(){
        return buffer;
    }

    void HARD_CODE_FEATURE_bookmark(){
        this.PACKAGE_NAME = getApplicationContext().getPackageName();
        //vreate bookmark exhib
        bookmark_exhib_list.generate_n(6);
        //create bookmark item
        bookmark_item test_item=new bookmark_item(0,"test_item","this is a test description","smell");
        this.bookmark_exhib_list.get_exhib_by_list_index(1).add_bookmark_item(test_item);
    }
}
