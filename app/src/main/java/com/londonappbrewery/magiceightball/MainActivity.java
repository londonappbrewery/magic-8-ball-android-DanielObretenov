package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    Random random = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = findViewById(R.id.title);
        final ImageView magicBallImage = findViewById(R.id.image_eightBall);
        Button askButton = findViewById(R.id.askButton);
        final int[] answers = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };
        final int maxNumber = answers.length-1;
        final int minNumber = 0;

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                magicBallImage.setImageResource(answers[getRandomNumber(minNumber,maxNumber)]);
            }
        });

    }

    private int getRandomNumber(int min, int max){
       return   random.nextInt(max - min) + min;
    }
}
