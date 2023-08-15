package com.belajar.sportdb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;

public class DetailSportAdapter extends AppCompatActivity {
    TextView name, detail, desc, link;
    String n_name, n_detail, n_desc, n_link;
    int n_photo;
    ImageView photo;

    Button share, favorite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_sport_adapter);



        Bundle bundle = getIntent().getExtras();
        n_name = bundle.getString("name");
        n_detail = bundle.getString("detail");
        n_desc = bundle.getString("desc");
        n_link = bundle.getString("link");
        n_photo = bundle.getInt("photo");


        name = (TextView) findViewById(R.id.detail_name);
        detail = (TextView) findViewById(R.id.detail_detail);
        desc = (TextView) findViewById(R.id.detail_desc);
        link = (TextView) findViewById(R.id.detail_link);
        photo = (ImageView) findViewById(R.id.detail_photo);

        name.setText(""+n_name);
        detail.setText(""+n_detail);
        desc.setText(""+n_desc);


        link.setMovementMethod(LinkMovementMethod.getInstance());

        Glide.with(DetailSportAdapter.this).load(n_photo).apply(new RequestOptions().override(370,370)).into(photo);

        favorite = (Button) findViewById(R.id.action_favorite);
        share = (Button) findViewById(R.id.action_share);

        favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String output = name.getText().toString();
                Toast.makeText(DetailSportAdapter.this, "Menyukai " + output ,Toast.LENGTH_SHORT).show();
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Insert Subject here");
                String app_url = " https://thesportdb.com";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                startActivity(Intent.createChooser(shareIntent, "Share via"));
                String output = name.getText().toString();
                Toast.makeText(DetailSportAdapter.this, "Membagikan " + output ,Toast.LENGTH_SHORT).show();
            }
        });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("DB Basket Teams");
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}