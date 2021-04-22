package com.example.nflscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreA=0;
int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

/*Display score of team*/
    public void displayA(int score) {
        TextView score1 = (TextView) findViewById(R.id.scr_team_a);
        score1.setText(score+"");

    }

    /*Display score of team*/
    public void displayB(int score) {
        TextView score1 = (TextView) findViewById(R.id.scr_team_b);
        score1.setText(score+"");

    }
    /*Score Updation for team A when buttons are pressed*/
    public void touchdownA(View view){
        scoreA=scoreA+6;
        displayA(scoreA);
    }

    public  void addOneA(View view){
        scoreA++;
        displayA(scoreA);
    }

    public void addTwoA(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }

    public void addThreeA(View view){
        scoreA=scoreA+3;
        displayA(scoreA);
    }


    /*Score Updation of team b when buttons are pressed*/

    public void touchdownB(View view){
        scoreB=scoreB+6;
        displayB(scoreB);
    }

    public  void addOneB(View view){
        scoreB++;
        displayB(scoreB);
    }

    public void addTwoB(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void addThreeB(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }

    /*Reset Button is pressed */
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }
}