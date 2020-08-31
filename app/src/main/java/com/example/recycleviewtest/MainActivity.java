package com.example.recycleviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[];
    int images [] = {R.drawable.Vaseline1,R.drawable.Vaseline2,R.drawable.Vaseline3,R.drawable.Vaseline4,
            R.drawable.Vaseline5,R.drawable.Vaseline6,R.drawable.Vaseline7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        s1 = getResources().getStringArray(R.array.Vaseline_Type);
        s2 = getResources().getStringArray(R.array.Description);

        MyAdapter myAdapter = new MyAdapter( this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}