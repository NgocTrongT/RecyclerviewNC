package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =(RecyclerView) findViewById(R.id.rcv_category);
        categoryAdapter= new CategoryAdapter(MainActivity.this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListcategory());
        recyclerView.setAdapter(categoryAdapter);
    }


    private List<Category> getListcategory(){
        List<Category> listCategory = new ArrayList<>();
        List<Game>  gameArrayList = new ArrayList<>();
        gameArrayList.add(new Game("Asphalt 8",R.drawable.asphalt,"Game mien phi"));
        gameArrayList.add(new Game("Pikachu",R.drawable.pikachu,"Game offline"));
        gameArrayList.add(new Game("Candy Crush Saga",R.drawable.candy,"Game da bong"));
        gameArrayList.add(new Game("Subway Surfers",R.drawable.subway,"Game offline"));
        gameArrayList.add(new Game("Asphalt 8",R.drawable.asphalt,"Game mien phi"));
        gameArrayList.add(new Game("Pikachu",R.drawable.pikachu,"Game offline"));
        gameArrayList.add(new Game("Candy Crush Saga",R.drawable.candy,"Game da bong"));
        gameArrayList.add(new Game("Subway Surfers",R.drawable.subway,"Game offline"));
        gameArrayList.add(new Game("Asphalt 8",R.drawable.asphalt,"Game mien phi"));
        gameArrayList.add(new Game("Pikachu",R.drawable.pikachu,"Game offline"));
        gameArrayList.add(new Game("Candy Crush Saga",R.drawable.candy,"Game da bong"));
        gameArrayList.add(new Game("Subway Surfers",R.drawable.subway,"Game offline"));

        listCategory.add(new Category("Game de xuat",gameArrayList));
        listCategory.add(new Category("Game Offline",gameArrayList));
        listCategory.add(new Category("Game Online",gameArrayList));
        listCategory.add(new Category("Game mien phi",gameArrayList));
        listCategory.add(new Category("Game tra phi",gameArrayList));

        return listCategory;
    }
    }
