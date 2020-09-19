package com.example.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RadioButton dice_one;
    Button throwDice;
    // 값이 1이면 주사위 1개 선택, 2이면 주사위 2개 선택
    int whichRadioButton = 1;
    //첫 번째 주사위 이미지
    ImageView dice_image;
    ImageView dice_image2;
    Random random = new Random();
    private RadioGroup choiceDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        throwDice = findViewById(R.id.throwdice);
        choiceDice = findViewById(R.id.choicedice);
        dice_one = findViewById(R.id.dice_one);
        dice_image = findViewById(R.id.diceimage1);
        dice_image2 = findViewById(R.id.diceimage2);

        choiceDice.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.dice_one) whichRadioButton = 1;
                else if(checkedId == R.id.dice_two) whichRadioButton = 2;
            }
        });

        throwDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 int numberOfDice = 1;
                 int numberOfDice2 = 1;

                 if (whichRadioButton == 1)
                     numberOfDice = random.nextInt()+1;
                 else if (whichRadioButton == 2){
                     numberOfDice = random.nextInt(6) + 1;
                     numberOfDice2 = random.nextInt(6) + 1;
                 }

                 if(whichRadioButton == 1){
                     dice_image2.setVisibility(View.INVISIBLE);
                     switch (numberOfDice){
                         case 1:
                             dice_image.setImageResource(R.drawable.dice1);
                             break;
                         case 2:
                             dice_image.setImageResource(R.drawable.dice2);
                             break;
                         case 3:
                             dice_image.setImageResource(R.drawable.dice3);
                             break;
                         case 4:
                             dice_image.setImageResource(R.drawable.dice4);
                             break;
                         case 5:
                             dice_image.setImageResource(R.drawable.dice5);
                             break;
                         case 6:
                             dice_image.setImageResource(R.drawable.dice6);
                             break;
                     }
                 }

                 if(whichRadioButton == 2) {
                     switch (numberOfDice) {
                         case 1:
                             dice_image.setImageResource(R.drawable.dice1);
                             break;
                         case 2:
                             dice_image.setImageResource(R.drawable.dice2);
                             break;
                         case 3:
                             dice_image.setImageResource(R.drawable.dice3);
                             break;
                         case 4:
                             dice_image.setImageResource(R.drawable.dice4);
                             break;
                         case 5:
                             dice_image.setImageResource(R.drawable.dice5);
                             break;
                         case 6:
                             dice_image.setImageResource(R.drawable.dice6);
                             break;
                     }
                     switch (numberOfDice2) {
                         case 1:
                             dice_image.setImageResource(R.drawable.dice1);
                             break;
                         case 2:
                             dice_image.setImageResource(R.drawable.dice2);
                             break;
                         case 3:
                             dice_image.setImageResource(R.drawable.dice3);
                             break;
                         case 4:
                             dice_image.setImageResource(R.drawable.dice4);
                             break;
                         case 5:
                             dice_image.setImageResource(R.drawable.dice5);
                             break;
                         case 6:
                             dice_image.setImageResource(R.drawable.dice6);
                             break;
                     }
                 }
            }   //end of onClick
        });
    }   //end of onCreate
}