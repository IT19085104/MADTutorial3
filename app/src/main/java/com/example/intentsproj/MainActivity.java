package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edNum1;
    EditText edNum2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);


    }

    public void openSecondInterface(View view){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("n1",edNum1.getText().toString());
        intent.putExtra("n2",edNum2.getText().toString());

        //Context context = getApplicationContext();
        //CharSequence message = "You just clicked the OK button";
        //int duration = Toast.LENGTH_SHORT;
        //Toast toast = Toast.makeText(context, message, duration);
        //toast.show();

        //Creating the LayoutInflater instance
        LayoutInflater li = getLayoutInflater();
        //Getting the View object as defined in the customtoast.xml file
        View layout = li.inflate(R.layout.customtoast, (ViewGroup) findViewById(R.id.custom_toast_layout));
        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setView(layout);//setting the view of custom toast layout
        toast.show();
        startActivity(intent);

    }
}