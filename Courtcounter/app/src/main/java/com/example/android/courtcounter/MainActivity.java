package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulsTeamA = 0;
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
        displayFoulsForTeamA(0);
        displayFoulsForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /*
    // display number of fouls
     */
    private void displayFoulsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_a_text_view);
        scoreView.setText(String.valueOf(score));
    }

    private void displayFoulsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_b_text_view);
        scoreView.setText(String.valueOf(score));
    }

    //3points
    private void threePointsA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    private void threePointsB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    private void twoPointsA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    private void twoPointsB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    private void freeThrowA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    private void freeThrowB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    private void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulsTeamA = 0;
        foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulsForTeamA(foulsTeamA);
        displayFoulsForTeamB(foulsTeamB);
    }
    /*
    // add number of fouls and display
    */
    private void foulsForTeamA(View view){
        foulsTeamA += 1;
        displayFoulsForTeamA(foulsTeamA);
    }

    private void foulsForTeamB(View view){
        foulsTeamB += 1;
        displayFoulsForTeamB(foulsTeamB);
    }

}
