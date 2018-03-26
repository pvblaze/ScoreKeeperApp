package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamS = 0;
    int teamAfoul = 0;
    int teamSfoul = 0;

    Button
    //    Reset button - Make reset button visible
    rg,
    //    Reset button - Make reset button invisible when reset button have been pressed
    rgok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg =  findViewById(R.id.resetbutton);
        rgok =  findViewById(R.id.resetbutton);
    }

    public void ok(View view) {
        rg.setVisibility(View.VISIBLE);
    }

    //    Display score for Team Aquarius.

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamAfoul(int score) {
        TextView scoreView = findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    //    Increase the score for Team Aquarius by 1 point.

    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    //    Increase the score for Team Aquarius by 2 points.

    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    //    Increase the score for Team Aquarius by 3 points.

    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    //    Increase the score for Team Aquarius by 1 foul.

    public void team_a_foul(View v) {
        teamAfoul = teamAfoul + 1;
        displayForTeamAfoul(teamAfoul);
    }

    //    Displays the score for Team Scropions.

    public void displayForTeamS(int score) {
        TextView scoreView = findViewById(R.id.team_s_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamSfoul(int score) {
        TextView scoreView = findViewById(R.id.team_s_foul);
        scoreView.setText(String.valueOf(score));
    }

    //     Increase the score for Team Scropions by 1 point.

    public void addOneForTeamS(View v) {
        scoreTeamS = scoreTeamS + 1;
        displayForTeamS(scoreTeamS);
    }

    //     Increase the score for Team Scropions by 2 points.

    public void addTwoForTeamS(View v) {
        scoreTeamS = scoreTeamS + 2;
        displayForTeamS(scoreTeamS);
    }

    //     Increase the score for Team Scropions by 3 points.

    public void addThreeForTeamS(View v) {
        scoreTeamS = scoreTeamS + 3;
        displayForTeamS(scoreTeamS);
    }

    //     Increase the score for Team Scropions by 1 foul.

    public void team_s_foul(View v) {
        teamSfoul = teamSfoul + 1;
        displayForTeamSfoul(teamSfoul);
    }

    // This script runs when reset button is pressed

    public void reset(View v) {
        rgok.setVisibility(View.INVISIBLE);
        displayForTeamA(scoreTeamA = 0);
        displayForTeamS(scoreTeamS = 0);
        displayForTeamAfoul(teamAfoul = 0);
        displayForTeamSfoul(teamSfoul = 0);
    }
}