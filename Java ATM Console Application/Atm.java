package com.example.myatm;

import static java.lang.String.valueOf;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Atm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.atm);
    }

    double Balance=0;
    public void displayBalance(View view) {
        TextView tv=(TextView) findViewById(R.id.result);
        tv.setText("Your Balance is "+Balance);
    }
    public void depositAmount(View view) {
        TextView tv=(TextView) findViewById(R.id.result);
        EditText e1=(EditText) findViewById(R.id.et1);
        double x=Double.parseDouble(valueOf(e1.getText()));
        tv.setText(x+" is deposited successfully !");
        Balance+=x;
        e1.setText("");
    }
    public void withdrawAmount(View view) {
        TextView tv=(TextView) findViewById(R.id.result);
        EditText e2=(EditText) findViewById(R.id.et2);
        double x=Double.valueOf(valueOf(e2.getText()));
        if (x<=Balance) {
            Balance-=x;
            tv.setText(x+" is Withdrawn Successfully !");
            e2.setText("");
        }
        else {
            tv.setText("Insufficent Balance");
            e2.setText("");
        }
        }
    public void Finish (View view) {
        TextView tv=(TextView) findViewById(R.id.result);
        tv.setText("Thank You! Please collect your Card");
    }
}
