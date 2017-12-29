package com.example.android.scorekeeper2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalsReal = 0;
    int yellowsReal = 0;
    int redsReal = 0;
    int foulsReal = 0;

    int goalsBarcelona = 0;
    int yellowsBarcelona = 0;
    int redsBarcelona = 0;
    int foulsBarcelona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("goalsReal", goalsReal);
        outState.putInt("yellowsReal", yellowsReal);
        outState.putInt("redsReal", redsReal);
        outState.putInt("foulsReal", foulsReal);
        outState.putInt("goalsBarcelona", goalsBarcelona);
        outState.putInt("yellowsBarcelona", yellowsBarcelona);
        outState.putInt("redsBarcelona", redsBarcelona);
        outState.putInt("foulsBarcelona", foulsBarcelona);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        goalsReal = savedInstanceState.getInt("goalsReal");
        yellowsReal = savedInstanceState.getInt("yellowsReal");
        redsReal = savedInstanceState.getInt("redsReal");
        foulsReal = savedInstanceState.getInt("foulsReal");
        goalsBarcelona = savedInstanceState.getInt("goalsBarcelona");
        yellowsBarcelona = savedInstanceState.getInt("yellowsBarcelona");
        redsBarcelona = savedInstanceState.getInt("redsBarcelona");
        foulsBarcelona = savedInstanceState.getInt("foulsBarcelona");

        displayGoalsReal(goalsReal);
        displayYellowsReal(yellowsReal);
        displayRedsReal(redsReal);
        displayFoulsReal(foulsReal);
        displayGoalsBarcelona(goalsBarcelona);
        displayYellowsBarcelona(yellowsBarcelona);
        displayRedsBarcelona(redsBarcelona);
        displayFoulsBarcelona(foulsBarcelona);

        super.onRestoreInstanceState(savedInstanceState);
    }

    public void addGoalForReal(View view) {
        goalsReal++;
        displayGoalsReal(goalsReal);
    }

    public void addYellowForReal(View view) {
        yellowsReal++;
        displayYellowsReal(yellowsReal);
    }

    public void addRedForReal(View view) {
        redsReal++;
        displayRedsReal(redsReal);
    }

    public void addFoulForReal(View view) {
        foulsReal++;
        displayFoulsReal(foulsReal);
    }

    public void addGoalForBarcelona(View view) {
        goalsBarcelona++;
        displayGoalsBarcelona(goalsBarcelona);


    }

    public void addYellowForBarcelona(View view) {
        yellowsBarcelona++;
        displayYellowsBarcelona(yellowsBarcelona);
    }

    public void addRedForBarcelona(View view) {
        redsBarcelona++;
        displayRedsBarcelona(redsBarcelona);
    }

    public void addFoulForBarcelona(View view) {
        foulsBarcelona++;
        displayFoulsBarcelona(foulsBarcelona);
    }

    public void resetScore(View view){
        goalsReal = 0;
        yellowsReal = 0;
        redsReal = 0;
        foulsReal = 0;
        goalsBarcelona = 0;
        yellowsBarcelona = 0;
        redsBarcelona = 0;
        foulsBarcelona = 0;
        displayGoalsReal(goalsReal);
        displayYellowsReal(yellowsReal);
        displayRedsReal(redsReal);
        displayFoulsReal(foulsReal);
        displayGoalsBarcelona(goalsBarcelona);
        displayYellowsBarcelona(yellowsBarcelona);
        displayRedsBarcelona(redsBarcelona);
        displayFoulsBarcelona(foulsBarcelona);


    }

    public void displayGoalsReal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_real);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsReal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_real);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowsReal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellows_real);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedsReal(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reds_real);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalsBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.goals_barcelona);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulsBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.fouls_barcelona);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowsBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellows_barcelona);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedsBarcelona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.reds_barcelona);
        scoreView.setText(String.valueOf(score));
    }

}


