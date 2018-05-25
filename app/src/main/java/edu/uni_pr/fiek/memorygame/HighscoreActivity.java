package edu.uni_pr.fiek.memorygame;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HighscoreActivity extends AppCompatActivity {

    Button btnEasyHighscores;
    Button btnMediumHighscores;
    Button btnHardHighscores;

    Database myDatabase;
    ListView lvHighscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highscore);

        btnEasyHighscores = findViewById(R.id.btnEasyHighscores);
        btnMediumHighscores = findViewById(R.id.btnMediumHighscores);
        btnHardHighscores = findViewById(R.id.btnHardHighscores);

        lvHighscore = (ListView) findViewById(R.id.lvHighscore);
        myDatabase = new Database(this);

        btnEasyHighscores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                populateListView("easy");
            }
        });

        btnMediumHighscores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                populateListView("medium");
            }
        });

        btnHardHighscores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                populateListView("hard");
            }
        });

    }

    private void populateListView(String level) {

        Cursor data = myDatabase.getData(level);
        ArrayList<String> listData = new ArrayList<>();

        while (data.moveToNext()) {
            listData.add(data.getString(0)+"\n"+data.getString(1)+" Points");
        }

        ListAdapter adapter = new ArrayAdapter<>(this, R.layout.row_layout, listData);
        lvHighscore.setAdapter(adapter);
    }
}
