package com.belajar.sportdb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private RecyclerView rvSport;
    private ArrayList<Sport> list = new ArrayList<>();
    private String title = "DBSport List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setActionBarTitle(title);

        rvSport = findViewById(R.id.rv_sport);
        rvSport.setHasFixedSize(true);
        list.addAll(SportData.getListData());

        showRecyclerList();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.about_page:
                startActivity(new Intent(MainActivity.this, AboutPage.class));
                break;
            case R.id.action_list:
                title = "DBSport List";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "DBSport Grid";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "DbSport CardView";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void showRecyclerList() {
        rvSport.setLayoutManager(new LinearLayoutManager(this));
        ListSportAdapter listSportAdapter = new ListSportAdapter(list);
        rvSport.setAdapter(listSportAdapter);

        listSportAdapter.setOnItemClickCallback(new ListSportAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Sport data) {
                showSelectedSport(data);
            }
        });
    }

    private void showRecyclerGrid() {
        rvSport.setLayoutManager(new GridLayoutManager(this, 2));
        GridSportAdapter gridSportAdapter = new GridSportAdapter(list);
        rvSport.setAdapter(gridSportAdapter);

        gridSportAdapter.setOnItemClickCallback(new GridSportAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Sport data) {
                showSelectedSport(data);
            }
        });
    }

    private void showRecyclerCardView() {
        rvSport.setLayoutManager(new LinearLayoutManager(this));
        CardViewSportAdapter cardViewSportAdapter = new CardViewSportAdapter(list);
        rvSport.setAdapter(cardViewSportAdapter);
    }

    private void setActionBarTitle(String title) {
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
    private void showSelectedSport(Sport sport) {
        Toast.makeText(this, "Kamu memilih " + sport.getName(), Toast.LENGTH_SHORT).show();
    }
}