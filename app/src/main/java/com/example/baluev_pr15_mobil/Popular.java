package com.example.baluev_pr15_mobil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Popular extends AppCompatActivity implements View.OnClickListener {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);
        img = findViewById(R.id.imageView2);
        img.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.imageView2:
                startActivity(new Intent(this, Karaoke.class));
                break;
        }
    }
}