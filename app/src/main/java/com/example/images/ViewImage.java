package com.example.images;

import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import java.net.URI;

public class ViewImage extends AppCompatActivity
{
    ImageView iv2;
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        String f = getIntent().getStringExtra("img");

        iv2 =(ImageView)findViewById(R.id.imageView2);
        iv2.setImageURI(Uri.parse(f));
    }
}
