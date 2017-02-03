package com.example.daniel.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goalA, goalB, cornerA, cornerB, faultA, faultB, yellowCardA, yellowCardB, redCardA, redCardB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVariablesTo0();
    }

    /**
     * updates the number in the textView of the goals of the local team
     * with the value of the variable goalA
     */
    private void updateScoreA() {
        TextView scoreView = (TextView) findViewById(R.id.textViewGoalCounterA);
        scoreView.setText(String.valueOf(goalA));
    }

    /**
     * updates the number in the textView of the goals of the visiting team
     * with the value of the variable GoalB
     */
    private void updateScoreB() {
        TextView scoreView = (TextView) findViewById(R.id.textViewGoalCounterB);
        scoreView.setText(String.valueOf(goalB));
    }

    /**
     * updates the number in the textView of the corner kicks of the local team
     * with the value of the variable cornerA
     */
    private void updateCornerA() {
        TextView scoreView = (TextView) findViewById(R.id.textViewCornerA);
        scoreView.setText(String.valueOf(cornerA));
    }

    /**
     * updates the number in the textView of the corner kicks of the visiting team
     * with the value of the variable cornerB
     */
    private void updateCornerB() {
        TextView scoreView = (TextView) findViewById(R.id.textViewCornerB);
        scoreView.setText(String.valueOf(cornerB));
    }

    /**
     * updates the number in the textView of the faults of the local team
     * with the value of the variable faultA
     */
    private void updateFaultA() {
        TextView scoreView = (TextView) findViewById(R.id.textViewFaltaA);
        scoreView.setText(String.valueOf(faultA));
    }

    /**
     * updates the number in the textView of the faults of the visiting team
     * with the value of the variable faultB
     */
    private void updateFaultB() {
        TextView scoreView = (TextView) findViewById(R.id.textViewFaltaB);
        scoreView.setText(String.valueOf(faultB));
    }

    /**
     * updates the number in the button red of the local team with
     * the value of the variable redCardA
     */
    private void updateRedCardA() {
        TextView scoreView = (TextView) findViewById(R.id.buttonRedCardA);
        scoreView.setText(String.valueOf(redCardA));
    }

    /**
     * updates the number in the button red of the visiting team with
     * the value of the variable redCardB
     */
    private void updateRedCardB() {
        TextView scoreView = (TextView) findViewById(R.id.ButtonRedCardB);
        scoreView.setText(String.valueOf(redCardB));
    }

    /**
     * updates the number in the button yellow of the local team with
     * the value of the variable yellowCardA
     */
    private void updateYellowCardA() {
        TextView scoreView = (TextView) findViewById(R.id.ButtonYellowCardA);
        scoreView.setText(String.valueOf(yellowCardA));
    }

    /**
     * updates the number in the button yellow of the visiting team with
     * the value of the variable YellowCardB
     */
    private void updateYellowCardB() {
        TextView scoreView = (TextView) findViewById(R.id.ButtonYellowCardB);
        scoreView.setText(String.valueOf(yellowCardB));
    }

    /**
     * sets all the variables to 0 to restart the match
     */
    private void setVariablesTo0() {
        goalA = 0;
        goalB = 0;
        cornerA = 0;
        cornerB = 0;
        faultA = 0;
        faultB = 0;
        yellowCardA = 0;
        yellowCardB = 0;
        redCardA = 0;
        redCardB = 0;
    }

    /**
     * increments in 1 the goals of the local team
     *
     * @param view
     */
    public void buttonGoalA(View view) {
        goalA++;
        updateScoreA();
    }

    /**
     * increments in 1 the goals of the visiting team
     *
     * @param view
     */
    public void buttonGoalB(View view) {
        goalB++;
        updateScoreB();
    }

    /**
     * increments in 1 the corner kicks of the local team
     *
     * @param view
     */
    public void ButtonCornerA(View view) {
        cornerA++;
        updateCornerA();
    }

    /**
     * increments in 1 the corner kicks of the visiting team
     *
     * @param view
     */
    public void ButtonCornerB(View view) {
        cornerB++;
        updateCornerB();
    }

    /**
     * increments in 1 the faults commited by the local team
     *
     * @param view
     */
    public void ButtonFaultA(View view) {
        faultA++;
        updateFaultA();
    }

    /**
     * increments in 1 the faults commited by the visiting team
     *
     * @param view
     */
    public void ButtonFaultB(View view) {
        faultB++;
        updateFaultB();
    }

    /**
     * increments in 1 the red cards showed to the local team
     *
     * @param view
     */
    public void ButtonRedCardA(View view) {
        redCardA++;
        updateRedCardA();
    }

    /**
     * increments in 1 the red cards showed to the visiting team
     *
     * @param view
     */
    public void ButtonRedCardB(View view) {
        redCardB++;
        updateRedCardB();
    }

    /**
     * increments in 1 the yellow cards showed to the local team
     *
     * @param view
     */
    public void ButtonYellowCardA(View view) {
        yellowCardA++;
        updateYellowCardA();
    }

    /**
     * increments in 1 the yellow cards showed to the visiting team
     *
     * @param view
     */
    public void ButtonYellowCardB(View view) {
        yellowCardB++;
        updateYellowCardB();
    }

    /**
     * sets all the variables to 0, and then updates all the textviews and
     * buttons to 0.
     *
     * @param view
     */
    public void ButtonReset(View view) {
        setVariablesTo0();
        updateCornerA();
        updateCornerB();
        updateFaultA();
        updateFaultB();
        updateScoreA();
        updateScoreB();
        updateYellowCardA();
        updateYellowCardB();
        updateRedCardA();
        updateRedCardB();
    }
}
