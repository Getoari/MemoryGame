package edu.uni_pr.fiek.memorygame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView  tvPlayerOne, tvPlayerTwo, tvPlayerOneScore, tvPlayerTwoScore;

    ImageButton card1,card2,card3,card4,card5,card6,card7,card8,card9,card10;
    ImageButton card11,card12,card13,card14,card15,card16,card17,card18,card19,card20;

    int image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (ImageButton) findViewById(R.id.card1);
        card2 = (ImageButton) findViewById(R.id.card2);
        card3 = (ImageButton) findViewById(R.id.card3);
        card4 = (ImageButton) findViewById(R.id.card4);
        card5 = (ImageButton) findViewById(R.id.card5);
        card6 = (ImageButton) findViewById(R.id.card6);
        card7 = (ImageButton) findViewById(R.id.card7);
        card8 = (ImageButton) findViewById(R.id.card8);
        card9 = (ImageButton) findViewById(R.id.card9);
        card10 = (ImageButton) findViewById(R.id.card10);
        card11 = (ImageButton) findViewById(R.id.card11);
        card12 = (ImageButton) findViewById(R.id.card12);
        card13 = (ImageButton) findViewById(R.id.card13);
        card14 = (ImageButton) findViewById(R.id.card14);
        card15 = (ImageButton) findViewById(R.id.card15);
        card16 = (ImageButton) findViewById(R.id.card16);
        card17 = (ImageButton) findViewById(R.id.card17);
        card18 = (ImageButton) findViewById(R.id.card18);
        card19 = (ImageButton) findViewById(R.id.card19);
        card20 = (ImageButton) findViewById(R.id.card20);

    }

}
