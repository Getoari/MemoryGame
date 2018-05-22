package edu.uni_pr.fiek.memorygame;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Result extends AppCompatActivity {

    String playerName;
    EditText etName;
    TextView scoreLabel;
    int playerOnePoints;
    int playerTwoPoints;
    String playerTwo;
    String gameMode;
    String gameDifficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        scoreLabel = (TextView) findViewById(R.id.scoreLabel);
        TextView highScoreLabel =(TextView) findViewById(R.id.highScoreLabel);


        Intent i = getIntent();

        playerOnePoints=i.getIntExtra("playerOnePoints",0);
        playerTwoPoints=i.getIntExtra("playerTwoPoints",0);
        playerTwo= i.getStringExtra("PlayerTwo");
        gameMode = i.getStringExtra("GameMode");
        gameDifficulty = i.getStringExtra("GameDifficulty");

        if(gameMode.equals("cpu")) {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Result.this);
            alertDialogBuilder.setTitle("Please enter your name:");
            alertDialogBuilder.setView(R.layout.dialog_name);

            final AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();

            Button btnName = (Button) alertDialog.findViewById(R.id.btnName);
            etName = (EditText) alertDialog.findViewById(R.id.etName);

            btnName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    playerName = etName.getText().toString();
                    scoreLabel.setText("CPU: " + playerTwoPoints + "/" + playerName + ": " + playerOnePoints);
                    //Kodi per me rujt ne db playerOnePoints, playerName.
                    alertDialog.hide();
                }
            });
        } else if(gameMode.equals("2players")) {
            playerName = "Player 1";
            scoreLabel.setText(playerName + ": " + playerOnePoints +"/"+ playerTwo + ": " + playerTwoPoints);
        } else {
            scoreLabel.setText("You Won!");
        }
    }
    public void tryAgain(View view)
    {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.putExtra("GameMode",gameMode);
        intent.putExtra("GameDifficulty",gameDifficulty);
        startActivity(intent);
        finish();
    }
    public void backToMeny (View view)
    {
        finish();
    }

}
