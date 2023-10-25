package com.example.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        String[] colors = {"Черный","Малиновый","Синий","Красный","Фиолетовый", "Зеленый","Белый"};

        ArrayList<String> posts = new ArrayList<>();
        for (int i = 0; i < colors.length;i++){
            posts.add("Цвет: " + colors[i]);
        }

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, posts);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(MainActivity.this,"Цвет " + (position+1) + ": " + colors[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}