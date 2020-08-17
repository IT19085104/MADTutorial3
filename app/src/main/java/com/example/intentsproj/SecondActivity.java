package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    EditText edNum1;
    EditText edNum2;
    TextView lbDisplay;


    String num1;
    String num2;

    int number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edNum1=findViewById(R.id.edNum1);
        edNum2=findViewById(R.id.edNum2);
        lbDisplay=findViewById(R.id.lbDisplay);

        Intent intent = getIntent();
         num1  = intent.getStringExtra("n1");
         num2 = intent.getStringExtra("n2");

        edNum1.setText(num1);
        edNum2.setText(num2);

        number1=Integer.parseInt(num1);
        number2=Integer.parseInt(num2);

    }

    public void addNumbers(View view){
       lbDisplay.setText(num1 + " + " + num2 + " = "+(number1+number2));
    }

    public void substractNumbers(View view){
        lbDisplay.setText(num1 + " - " + num2 + " = "+(number1-number2));
    }

    public void multiplyNumbers(View view){
        lbDisplay.setText(num1 + " * " + num2 + " = "+(number1*number2));
    }

    public void divideNumbers(View view){
        lbDisplay.setText(num1 + " / " + num2 + " = "+(number1/number2));
    }

}