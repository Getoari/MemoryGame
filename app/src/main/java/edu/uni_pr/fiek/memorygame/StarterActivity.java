package edu.uni_pr.fiek.memorygame;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.zip.Inflater;

public class StarterActivity extends AppCompatActivity {

    Button btnOnePlayer, btnTwoPlayers, btnPlayerCpu, btnHighscores;
    Button btnEasy, btnMedium, btnHard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        btnOnePlayer = (Button) findViewById(R.id.btnOnePlayer);
        btnTwoPlayers = (Button) findViewById(R.id.btnTwoPlayers);
        btnPlayerCpu = (Button) findViewById(R.id.btnPlayerCpu);
        btnHighscores = (Button) findViewById(R.id.btnHighscores);

        btnOnePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("GameMode","1player");
                startActivity(intent);
            }
        });

        btnTwoPlayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.putExtra("GameMode","2players");
                startActivity(intent);
            }
        });

        btnPlayerCpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alert = new AlertDialog.Builder(StarterActivity.this);
                alert.setTitle("Select game difficulty:");
                alert.setView(R.layout.select_difficulty);

                AlertDialog dialog = alert.create();
                dialog.show();

                btnEasy = (Button) dialog.findViewById(R.id.btnEasy);
                btnMedium = (Button) dialog.findViewById(R.id.btnMedium);
                btnHard = (Button) dialog.findViewById(R.id.btnHard);

                btnEasy.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("GameMode","cpu");
                        intent.putExtra("GameDifficulty","easy");
                        startActivity(intent);
                    }
                });

                btnMedium.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("GameMode","cpu");
                        intent.putExtra("GameDifficulty","medium");
                        startActivity(intent);
                    }
                });

                btnHard.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        intent.putExtra("GameMode","cpu");
                        intent.putExtra("GameDifficulty","hard");
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
