package edu.uni_pr.fiek.memorygame;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    TextView  tvPlayerOne, tvPlayerTwo, tvPlayerOneScore, tvPlayerTwoScore;

    ImageButton card0, card1, card2, card3, card4, card5, card6, card7, card8, card9,
            card10, card11, card12, card13, card14, card15, card16, card17, card18,card19;

    Integer[] cardsArray = {101,102,103,104,105,106,107,108,109,110,
            201,202,203,204,205,206,207,208,209,210};

    int image101,image102,image103,image104,image105,image106,image107,image108,image109,image110
            ,image201,image202,image203,image204,image205,image206,image207,image208,image209,image210;

    int firstCard, secondCard;
    int clickedFirst, clickedSecond;

    int cardCount = 1;
    int turn = 1;

    int playerOnePoints = 0, playerTwoPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPlayerOneScore = (TextView) findViewById(R.id.tvPlayerOneScore);
        tvPlayerTwoScore = (TextView) findViewById(R.id.tvPlayerTwoScore);
        tvPlayerOne = (TextView) findViewById(R.id.tvPlayerOne);
        tvPlayerTwo = (TextView) findViewById(R.id.tvPlayerTwo);

        card0 = (ImageButton) findViewById(R.id.card1);
        card1 = (ImageButton) findViewById(R.id.card2);
        card2 = (ImageButton) findViewById(R.id.card3);
        card3 = (ImageButton) findViewById(R.id.card4);
        card4 = (ImageButton) findViewById(R.id.card5);
        card5 = (ImageButton) findViewById(R.id.card6);
        card6 = (ImageButton) findViewById(R.id.card7);
        card7 = (ImageButton) findViewById(R.id.card8);
        card8 = (ImageButton) findViewById(R.id.card9);
        card9 = (ImageButton) findViewById(R.id.card10);
        card10 = (ImageButton) findViewById(R.id.card11);
        card11 = (ImageButton) findViewById(R.id.card12);
        card12 = (ImageButton) findViewById(R.id.card13);
        card13 = (ImageButton) findViewById(R.id.card14);
        card14 = (ImageButton) findViewById(R.id.card15);
        card15 = (ImageButton) findViewById(R.id.card16);
        card16 = (ImageButton) findViewById(R.id.card17);
        card17 = (ImageButton) findViewById(R.id.card18);
        card18 = (ImageButton) findViewById(R.id.card19);
        card19 = (ImageButton) findViewById(R.id.card20);

        card0.setTag("0");
        card1.setTag("1");
        card2.setTag("2");
        card3.setTag("3");
        card4.setTag("4");
        card5.setTag("5");
        card6.setTag("6");
        card7.setTag("7");
        card8.setTag("8");
        card9.setTag("9");
        card10.setTag("10");
        card11.setTag("11");
        card12.setTag("12");
        card13.setTag("13");
        card14.setTag("14");
        card15.setTag("15");
        card16.setTag("16");
        card17.setTag("17");
        card18.setTag("18");
        card19.setTag("19");

        tvPlayerOne.setTextColor(Color.BLACK);
        tvPlayerOneScore.setTextColor(Color.BLACK);
        tvPlayerTwo.setTextColor(Color.GRAY);
        tvPlayerTwoScore.setTextColor(Color.GRAY);

        frontOfCardsResources();

        Collections.shuffle(Arrays.asList(cardsArray));

        card0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card0, theCard);
            }
        });
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card1, theCard);
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card2, theCard);
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card3, theCard);
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card4, theCard);
            }
        });
        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card5, theCard);
            }
        });
        card6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card6, theCard);
            }
        });
        card7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card7, theCard);
            }
        });
        card8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card8, theCard);
            }
        });
        card9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card9, theCard);
            }
        });
        card10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card10, theCard);
            }
        });
        card11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card11, theCard);
            }
        });
        card12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card12, theCard);
            }
        });
        card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card13, theCard);
            }
        });
        card14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card14, theCard);
            }
        });
        card15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card15, theCard);
            }
        });
        card16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card16, theCard);
            }
        });
        card17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card17, theCard);
            }
        });
        card18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card18, theCard);
            }
        });
        card19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int theCard = Integer.parseInt((String) v.getTag());
                doAction(card19, theCard);
            }
        });
    }

    private void doAction(ImageButton ib, int card) {
        if(cardsArray[card] == 101) {
            ib.setBackgroundResource(image101);
        } else if (cardsArray[card] == 102) {
            ib.setBackgroundResource(image102);
        } else if (cardsArray[card] == 103) {
            ib.setBackgroundResource(image103);
        } else if (cardsArray[card] == 104) {
            ib.setBackgroundResource(image104);
        } else if (cardsArray[card] == 105) {
            ib.setBackgroundResource(image105);
        } else if (cardsArray[card] == 106) {
            ib.setBackgroundResource(image106);
        } else if (cardsArray[card] == 107) {
            ib.setBackgroundResource(image107);
        } else if (cardsArray[card] == 108) {
            ib.setBackgroundResource(image108);
        } else if (cardsArray[card] == 109) {
            ib.setBackgroundResource(image109);
        } else if (cardsArray[card] == 110) {
            ib.setBackgroundResource(image110);
        } else if (cardsArray[card] == 201) {
            ib.setBackgroundResource(image201);
        } else if (cardsArray[card] == 202) {
            ib.setBackgroundResource(image202);
        } else if (cardsArray[card] == 203) {
            ib.setBackgroundResource(image203);
        } else if (cardsArray[card] == 204) {
            ib.setBackgroundResource(image204);
        } else if (cardsArray[card] == 205) {
            ib.setBackgroundResource(image205);
        } else if (cardsArray[card] == 206) {
            ib.setBackgroundResource(image206);
        } else if (cardsArray[card] == 207) {
            ib.setBackgroundResource(image207);
        } else if (cardsArray[card] == 208) {
            ib.setBackgroundResource(image208);
        } else if (cardsArray[card] == 209) {
            ib.setBackgroundResource(image209);
        } else if (cardsArray[card] == 210) {
            ib.setBackgroundResource(image210);
        }

        if(cardCount == 1) {
            firstCard = cardsArray[card];
            if(firstCard > 200) {
                firstCard = firstCard - 100;
            }
            cardCount = 2;
            clickedFirst = card;

            ib.setEnabled(false);
        } else if(cardCount == 2) {
            secondCard = cardsArray[card];
            if(secondCard > 200) {
                secondCard = secondCard - 100;
            }
            cardCount = 1;
            clickedSecond = card;

            card0.setEnabled(false);
            card1.setEnabled(false);
            card2.setEnabled(false);
            card3.setEnabled(false);
            card4.setEnabled(false);
            card5.setEnabled(false);
            card6.setEnabled(false);
            card7.setEnabled(false);
            card8.setEnabled(false);
            card9.setEnabled(false);
            card10.setEnabled(false);
            card11.setEnabled(false);
            card12.setEnabled(false);
            card13.setEnabled(false);
            card14.setEnabled(false);
            card15.setEnabled(false);
            card16.setEnabled(false);
            card17.setEnabled(false);
            card18.setEnabled(false);
            card19.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    calculate();
                }
            },1000);
        }
    }

    private void calculate() {
        if(firstCard == secondCard) {
            if(clickedFirst == 0) {
                card0.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 1) {
                card1.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 2) {
                card2.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 3) {
                card3.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 4) {
                card4.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 5) {
                card5.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 6) {
                card6.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 7) {
                card7.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 8) {
                card8.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 9) {
                card9.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 10) {
                card10.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 11) {
                card11.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 12) {
                card12.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 13) {
                card13.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 14) {
                card14.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 15) {
                card15.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 16) {
                card16.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 17) {
                card17.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 18) {
                card18.setVisibility(View.INVISIBLE);
            } else if(clickedFirst == 19) {
                card19.setVisibility(View.INVISIBLE);
            }
        }

        if(firstCard == secondCard) {
            if(clickedSecond == 0) {
                card0.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 1) {
                card1.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 2) {
                card2.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 3) {
                card3.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 4) {
                card4.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 5) {
                card5.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 6) {
                card6.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 7) {
                card7.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 8) {
                card8.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 9) {
                card9.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 10) {
                card10.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 11) {
                card11.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 12) {
                card12.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 13) {
                card13.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 14) {
                card14.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 15) {
                card15.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 16) {
                card16.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 17) {
                card17.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 18) {
                card18.setVisibility(View.INVISIBLE);
            } else if(clickedSecond == 19) {
                card19.setVisibility(View.INVISIBLE);
            }

            if(turn == 1) {
                playerOnePoints++;
                tvPlayerOneScore.setText(playerOnePoints+"");
            } else if (turn == 2) {
                playerTwoPoints++;
                tvPlayerTwoScore.setText(playerTwoPoints+"");
            }
        } else {
            card0.setBackgroundResource(R.drawable.ic_unknown);
            card1.setBackgroundResource(R.drawable.ic_unknown);
            card2.setBackgroundResource(R.drawable.ic_unknown);
            card3.setBackgroundResource(R.drawable.ic_unknown);
            card4.setBackgroundResource(R.drawable.ic_unknown);
            card5.setBackgroundResource(R.drawable.ic_unknown);
            card6.setBackgroundResource(R.drawable.ic_unknown);
            card7.setBackgroundResource(R.drawable.ic_unknown);
            card8.setBackgroundResource(R.drawable.ic_unknown);
            card9.setBackgroundResource(R.drawable.ic_unknown);
            card10.setBackgroundResource(R.drawable.ic_unknown);
            card11.setBackgroundResource(R.drawable.ic_unknown);
            card12.setBackgroundResource(R.drawable.ic_unknown);
            card13.setBackgroundResource(R.drawable.ic_unknown);
            card14.setBackgroundResource(R.drawable.ic_unknown);
            card15.setBackgroundResource(R.drawable.ic_unknown);
            card16.setBackgroundResource(R.drawable.ic_unknown);
            card17.setBackgroundResource(R.drawable.ic_unknown);
            card18.setBackgroundResource(R.drawable.ic_unknown);
            card19.setBackgroundResource(R.drawable.ic_unknown);

            if(turn == 1) {
                turn = 2;
                tvPlayerOne.setTextColor(Color.GRAY);
                tvPlayerOneScore.setTextColor(Color.GRAY);
                tvPlayerTwo.setTextColor(Color.BLACK);
                tvPlayerTwoScore.setTextColor(Color.BLACK);
            } else if(turn == 2) {
                turn = 1;
                tvPlayerOne.setTextColor(Color.BLACK);
                tvPlayerOneScore.setTextColor(Color.BLACK);
                tvPlayerTwo.setTextColor(Color.GRAY);
                tvPlayerTwoScore.setTextColor(Color.GRAY);
            }
        }

        card0.setEnabled(true);
        card1.setEnabled(true);
        card2.setEnabled(true);
        card3.setEnabled(true);
        card4.setEnabled(true);
        card5.setEnabled(true);
        card6.setEnabled(true);
        card7.setEnabled(true);
        card8.setEnabled(true);
        card9.setEnabled(true);
        card10.setEnabled(true);
        card11.setEnabled(true);
        card12.setEnabled(true);
        card13.setEnabled(true);
        card14.setEnabled(true);
        card15.setEnabled(true);
        card16.setEnabled(true);
        card17.setEnabled(true);
        card18.setEnabled(true);
        card19.setEnabled(true);

        checkEnd();
    }

    private void checkEnd() {
        if( card0.getVisibility() == View.INVISIBLE &&
                card1.getVisibility() == View.INVISIBLE &&
                card2.getVisibility() == View.INVISIBLE &&
                card3.getVisibility() == View.INVISIBLE &&
                card4.getVisibility() == View.INVISIBLE &&
                card5.getVisibility() == View.INVISIBLE &&
                card6.getVisibility() == View.INVISIBLE &&
                card7.getVisibility() == View.INVISIBLE &&
                card8.getVisibility() == View.INVISIBLE &&
                card9.getVisibility() == View.INVISIBLE &&
                card10.getVisibility() == View.INVISIBLE &&
                card11.getVisibility() == View.INVISIBLE &&
                card12.getVisibility() == View.INVISIBLE &&
                card13.getVisibility() == View.INVISIBLE &&
                card14.getVisibility() == View.INVISIBLE &&
                card15.getVisibility() == View.INVISIBLE &&
                card16.getVisibility() == View.INVISIBLE &&
                card17.getVisibility() == View.INVISIBLE &&
                card18.getVisibility() == View.INVISIBLE &&
                card19.getVisibility() == View.INVISIBLE){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder
                    .setMessage("Game Over!\nPlayer 1: "+playerOnePoints+"  Player 2: " + playerTwoPoints +
                    "\nWinner: " + ((playerOnePoints > playerTwoPoints)? "Player 1" : "Player 2") + ((playerOnePoints == playerTwoPoints)? "DRAW!" : ""))
                    .setCancelable(false)
                    .setPositiveButton("NEW", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });

            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }

    private void frontOfCardsResources() {
        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image103;
        image104 = R.drawable.ic_image104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;
        image107 = R.drawable.ic_image107;
        image108 = R.drawable.ic_image108;
        image109 = R.drawable.ic_image109;
        image110 = R.drawable.ic_image110;
        image201 = R.drawable.ic_image101;
        image202 = R.drawable.ic_image102;
        image203 = R.drawable.ic_image103;
        image204 = R.drawable.ic_image104;
        image205 = R.drawable.ic_image105;
        image206 = R.drawable.ic_image106;
        image207 = R.drawable.ic_image107;
        image208 = R.drawable.ic_image108;
        image209 = R.drawable.ic_image109;
        image210 = R.drawable.ic_image110;
    }
}
