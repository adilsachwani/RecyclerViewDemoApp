package com.example.scs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    PlayerAdapter playerAdapter;
    List<Player> playersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        playersList = new ArrayList<Player>();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        playersList.add(new Player(
                "Virat Kohli",
                "India",
                1,
                884,
                R.drawable.virat_kohli));

        playersList.add(new Player(
                "Rohit Sharma",
                "India",
                2,
                842,
                R.drawable.rohit_sharma));

        playersList.add(new Player(
                "Joe Root",
                "England",
                3,
                818,
                R.drawable.joe_root));

        playersList.add(new Player(
                "David Warner",
                "Australia",
                4,
                803,
                R.drawable.david_warner));

        playersList.add(new Player(
                "Shikhar Dhawan",
                "India",
                5,
                802,
                R.drawable.shikhar_dhawan));

        playersList.add(new Player(
                "Babar Azam",
                "Pakistan",
                6,
                798,
                R.drawable.babar_azam));

        playersList.add(new Player(
                "Ross Taylor",
                "New Zealand",
                7,
                785,
                R.drawable.ross_taylor));

        playersList.add(new Player(
                "Quinton De Kock",
                "South Africa",
                8,
                781,
                R.drawable.quinton_de_kock));

        playersList.add(new Player(
                "Kane Williamson",
                "New Zealand",
                9,
                778,
                R.drawable.kane_williamson));

        playersList.add(new Player(
                "Jonny Bairstow",
                "England",
                10,
                769,
                R.drawable.jonny_bairstow));

        playerAdapter = new PlayerAdapter(this,playersList);

        recyclerView.setAdapter(playerAdapter);
    }
}
