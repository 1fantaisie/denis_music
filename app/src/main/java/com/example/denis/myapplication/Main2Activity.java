package com.example.denis.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        fragmentmanager();

    }
    public void fragmentmanager()
    {
        // get fragment manager
        FragmentManager fm = getFragmentManager();

// add
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.listcontainer, new DetailsFragment());
// alternatively add it with a tag
// trx.add(R.id.your_placehodler, new YourFragment(), "detail");
        ft.commit();


    }
}
