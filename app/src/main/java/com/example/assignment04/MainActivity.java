package com.example.assignment04;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText number1;
    EditText number2;
    Button add_button;
    Button sub_button;
    TextView result;
    int ans=0;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1= findViewById(R.id.firstnum);
        number2= findViewById(R.id.secondnum);
        add_button= findViewById(R.id.add);
        sub_button= findViewById(R.id.sub);
        result = findViewById(R.id.ans);

        add_button.setOnClickListener(new View.OnClickListener() {
            double num1;
            double num2;
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().isEmpty()){
                    num1 = 0;
                } else{
                    num1 = Double.parseDouble(number1.getText().toString());
                }

                if(number2.getText().toString().isEmpty()){
                    num2 = 0;
                } else{
                    num2 = Double.parseDouble(number2.getText().toString());
                }

                double sum = num1 + num2;
                DecimalFormat df = new DecimalFormat("###.####");
                result.setText(df.format(sum));
            }
        });

        sub_button.setOnClickListener(new View.OnClickListener() {
            double num1;
            double num2;
            @Override
            public void onClick(View v) {
                if(number1.getText().toString().isEmpty()){
                    num1 = 0;
                } else{
                    num1 = Double.parseDouble(number1.getText().toString());
                }

                if(number2.getText().toString().isEmpty()){
                    num2 = 0;
                } else{
                    num2 = Double.parseDouble(number2.getText().toString());
                }

                double sum = num1 - num2;
                DecimalFormat df = new DecimalFormat("###.####");
                result.setText(df.format(sum));
            }
        });
    }
}
