package com.example.berto.playmusic;

import android.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list_content);

            // Create a list of songs
            ArrayList<String> songs = new ArrayList<String>();
            songs.add("Banana Republic");
            songs.add("Un gelato al limon");
            songs.add("La canzone di Orlando");
            songs.add("Bufalo Bill");
            songs.add("Piazza Grande");
            songs.add("4/3/1943");
            songs.add("Santa Lucia");
            songs.add("Quattro cani");
            songs.add("Addio a Napoli");
            songs.add("Ma come fanno i marinai");


            ArrayAdapter<String> itemsAdapter =
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, songs);
            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(itemsAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
            {
                @Override
                public void onItemClick(AdapterView<?> adapter, View view, int position,
                                        long id)
                {
                    Song song = songsArray.get(position);
                    String songTitle = song.getTitle();

                }
            });


            }
        }

