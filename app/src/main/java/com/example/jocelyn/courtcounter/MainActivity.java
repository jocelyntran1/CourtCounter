package com.example.jocelyn.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases team A's score by 1.
     */
    public void addOneForTeamA( View v ) {
        teamAScore++;
        displayForTeamA( teamAScore );
    }

    /**
     * Increases team A's score by 2.
     */
    public void addTwoForTeamA( View v ) {
        teamAScore+=2;
        displayForTeamA( teamAScore );
    }

    /**
     * Increases team A's score by 3.
     */
    public void addThreeForTeamA( View v ) {
        teamAScore+=3;
        displayForTeamA( teamAScore );
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increases team A's score by 1.
     */
    public void addOneForTeamB( View v ) {
        teamBScore++;
        displayForTeamB( teamBScore );
    }

    /**
     * Increases team A's score by 2.
     */
    public void addTwoForTeamB( View v ) {
        teamBScore+=2;
        displayForTeamB( teamBScore );
    }

    /**
     * Increases team A's score by 3.
     */
    public void addThreeForTeamB( View v ) {
        teamBScore+=3;
        displayForTeamB( teamBScore );
    }

    /**
     * Sets the score for team A and team B to 0.
     */
    public void resetScore( View v ) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA( teamAScore );
        displayForTeamB( teamBScore );
    }

}
