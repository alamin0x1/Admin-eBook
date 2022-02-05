package com.developeralamin.pdfadmin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.developeralamin.pdfadmin.Ebook.EbookActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CardView uploadNotice, addGalleryImage, addEbook, faculty, news, student, delete, logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addEbook = findViewById(R.id.addEbook);

        addEbook.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.addEbook:
                startActivity(new Intent(MainActivity.this, EbookActivity.class));
                finish();
                break;
        }

    }
}