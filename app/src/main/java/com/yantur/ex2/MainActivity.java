package com.yantur.ex2;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<String> data = new ArrayList<>();
        data.add("Heeeey!!");
        data.add("How Are You?");

        Intent intent = new Intent(Intent.ACTION_SEND_MULTIPLE);
        String title = "Choose App";
        intent.setType("text/*");
        intent.putStringArrayListExtra("images", data);
        Intent chooser = Intent.createChooser(intent,title);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(chooser);
        }


    }
}
