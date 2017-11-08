package com.example.berylsystem.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView programingList = (RecyclerView) findViewById(R.id.programmingList);
        programingList.setLayoutManager(new LinearLayoutManager(this));
        String[] language = {"Java","JavaScript","C#","PHP","C","C++","Java","JavaScript","C#","PHP","C","C++","Java","JavaScript","C#","PHP","C","C++"};
        ProgrammingAdapter programmingAdapter= new ProgrammingAdapter(language,this);
        programingList.setAdapter(programmingAdapter);
    }
}
