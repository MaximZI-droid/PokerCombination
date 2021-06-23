package com.ZiMax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_POS = "my_item_position";
    ImageView imageView;
    TextView textView1;
    TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //int my_item_position = (int) getIntent().getExtras().get(EXTRA_POS);

        int image = getIntent().getIntExtra("image",0);
        String text1 = getIntent().getStringExtra("mainText");
        String text2 = getIntent().getStringExtra("moreText");

        imageView = findViewById(R.id.imageViewInSecondAct);
        textView1 = findViewById(R.id.textViewInSecondAct1);
        textView2 = findViewById(R.id.textViewInSecondAct2);
        imageView.setImageResource(image);
        textView1.setText(text1);
        textView2.setText(text2);


    }
}