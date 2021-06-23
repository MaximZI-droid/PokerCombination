package com.ZiMax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private  RecyclerView.LayoutManager manager;

    private RecyclerViewItem recyclerViewItem = new RecyclerViewItem();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewItem.createContentResource();

        recyclerView = findViewById(R.id.recyclerView);
        adapter = new RecyclerViewAdapter(recyclerViewItem.getListPokerCombination());
        manager = new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);

    }

    //Intent intent;

  /*  public void moreInformation(View view) {


        intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("Image", recyclerViewItem.getImageResource());
        intent.putExtra("MainText", recyclerViewItem.getText1());
        intent.putExtra("moreInfoText", recyclerViewItem.getText3());

        startActivity(intent);

    }*/
}