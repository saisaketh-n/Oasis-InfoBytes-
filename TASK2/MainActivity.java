package com.example.myatm;

import static java.lang.String.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void valid (View view) {
        EditText x1=(EditText) findViewById(R.id.e1);
        EditText x2=(EditText) findViewById(R.id.e2);
        String num= valueOf(x1.getText());
        String p= valueOf(x2.getText());
        if ((num.equals("saketh")) && (p.equals("1234"))) {
            Intent i=new Intent(MainActivity.this,Atm.class);
            startActivity(i);
        }
        else {
            TextView t1=(TextView) findViewById(R.id.t);
            t1.setText("Incorrect Atm Number or pin !");
        }
    }
}
