package com.example.lowerhigher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber ;

    public void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) +1;
    }
    public void guessButton(View view){
        EditText editText = (EditText) findViewById(R.id.editText);

        int guessValue = Integer.parseInt(editText.getText().toString());
        String message;

        if (guessValue > randomNumber){
            message = "Lower!";
        }else if (guessValue < randomNumber){
            message = "Higher!";
        }else {
            message = "you got it!  try again";
            generateRandomNumber();
        }
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
        Log.i("Entered value",editText.getText().toString());
        Log.i("Random Number", Integer.toString(randomNumber));

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      generateRandomNumber();
    }
}
