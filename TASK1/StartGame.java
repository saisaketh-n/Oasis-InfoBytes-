package com.example.numberguessinggame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class StartGame extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startgame);
    }
    Random random=new Random();
    int nums=random.nextInt(101);
    int i=0;
    int k=0;
    public void trying (View view) {
        EditText t = (EditText) findViewById(R.id.editTextNumber);
        for (i = 0; i < 10; i++) {
            TextView tv = (TextView) findViewById(R.id.result);
            String str = String.valueOf(t.getText());
            if (nums == (Integer.valueOf(str))) {
                tv.setText("You win the game !");
                k = 1;
                break;
            } else if (nums > (Integer.valueOf(str))) {
                tv.setText("Number You Guessed is lesser");
            }
            else {
                tv.setText("Number You Guessed is Greater");
            }
        }
        t.setText("");
    }
}
