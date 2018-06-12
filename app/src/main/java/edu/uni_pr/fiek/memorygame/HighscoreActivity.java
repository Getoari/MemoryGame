package edu.uni_pr.fiek.memorygame;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HighscoreActivity extends AppCompatActivity {

    Button btnEasyHighscores;
    Button btnMediumHighscores;
    Button btnHardHighscores;

    Database myDatabase;
    ListView lvHighscore;
    ListAdapter adapter;
    ArrayList<Player> players = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        btnEasyHighscores = findViewById(R.id.btnEasyHighscores);
        btnMediumHighscores = findViewById(R.id.btnMediumHighscores);
        btnHardHighscores = findViewById(R.id.btnHardHighscores);

        lvHighscore = findViewById(R.id.lvHighscore);
        myDatabase = new Database(this);

        // default is the easy
        populateListView("easy");

        btnEasyHighscores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                populateListView("easy");
                btnEasyHighscores.setBackgroundResource(R.drawable.tab_button_active);
                btnMediumHighscores.setBackgroundResource(R.drawable.tab_button_inactive);
                btnHardHighscores.setBackgroundResource(R.drawable.tab_button_inactive);
            }
        });

        btnMediumHighscores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                populateListView("medium");
                btnEasyHighscores.setBackgroundResource(R.drawable.tab_button_inactive);
                btnMediumHighscores.setBackgroundResource(R.drawable.tab_button_active);
                btnHardHighscores.setBackgroundResource(R.drawable.tab_button_inactive);
            }
        });

        btnHardHighscores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                populateListView("hard");
                btnEasyHighscores.setBackgroundResource(R.drawable.tab_button_inactive);
                btnMediumHighscores.setBackgroundResource(R.drawable.tab_button_inactive);
                btnHardHighscores.setBackgroundResource(R.drawable.tab_button_active);
            }
        });
    }

    private void populateListView(String level) {

        players = new ArrayList<>();

        Cursor data = myDatabase.getData(level);

        while (data.moveToNext()) {
            players.add(new Player(data.getString(0),data.getString(1)+" Points"));
        }

        adapter = new ListAdapter(HighscoreActivity.this, players);
        lvHighscore.setAdapter(adapter);
    }
}
