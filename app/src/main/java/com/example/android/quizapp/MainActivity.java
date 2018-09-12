package com.example.android.quizapp;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Global variable
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // to always stay in portrait mode
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    public void scoreDisplay (int score) {
        TextView scoreView = findViewById(R.id.totalDisplay);
        scoreView.setText(String.valueOf(score));
    }

    public void oneClicked (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.one_1:
                if (checked)
                    score += 0;
                    break;
            case R.id.one_2:
                if (checked)
                    score += 1;
                    break;
            case R.id.one_3:
                if (checked)
                    score += 0;
                    break;
        }
    }

    public void twoClicked (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.two_1:
                if (checked)
                    score += 0;
                break;
            case R.id.two_2:
                if (checked)
                    score += 1;
                break;
            case R.id.two_3:
                if (checked)
                    score += 0;
                break;
        }
    }

    public void threeClicked (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.three_1:
                if (checked)
                    score += 1;
                break;
            case R.id.three_2:
                if (checked)
                    score += 0;
                break;
            case R.id.three_3:
                if (checked)
                    score += 0;
                break;
        }
    }

    public void fourClicked (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.four_1:
                if (checked)
                    score += 0;
                break;
            case R.id.four_2:
                if (checked)
                    score += 0;
                break;
            case R.id.four_3:
                if (checked)
                    score += 1;
                break;
        }
    }

    public void fiveClicked (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.five_1:
                if (checked)
                    score += 0;
                break;
            case R.id.five_2:
                if (checked)
                    score += 0;
                break;
            case R.id.five_3:
                if (checked)
                    score += 1;
                break;
        }
    }

    public void sixClicked (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.six_1:
                if (checked)
                    score += 0;
                break;
            case R.id.six_2:
                if (checked)
                    score += 0;
                break;
            case R.id.six_3:
                if (checked)
                    score += 1;
                break;
        }
    }

    public void sevenClicked (View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.seven_1:
                if (checked)
                    score += 1;
                break;
            case R.id.seven_2:
                if (checked)
                    score += 0;
                break;
            case R.id.seven_3:
                if (checked)
                    score += 0;
                break;
        }
    }





    public void totalScore (View view){
        scoreDisplay(score);

        EditText namePlayer = findViewById(R.id.playerNameText);
        String Name =namePlayer.getText().toString();

        Toast.makeText(this, "ThankYou: " + Name , Toast.LENGTH_SHORT).show();
    }
}