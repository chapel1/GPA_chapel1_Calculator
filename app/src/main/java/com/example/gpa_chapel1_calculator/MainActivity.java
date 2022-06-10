package com.example.gpa_chapel1_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText GPA1, GPA2, GPA3, GPA4, GPA5;
    TextView GPAresult;
    Button button;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        GPA1=(EditText)findViewById(R.id.GPA1);
        GPA2=(EditText)findViewById(R.id.GPA2);
        GPA3=(EditText)findViewById(R.id.GPA3);
        GPA4=(EditText)findViewById(R.id.GPA4);
        GPA5=(EditText)findViewById(R.id.GPA5);
        GPAresult=(TextView)findViewById(R.id.GPAresult);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1, n2, n3, n4, n5,n6;
                if (count % 2 == 0) {
                    if (GPA1.getText().toString().equals("") || GPA2.getText().toString().equals("") || GPA3.getText().toString().equals("") || GPA4.getText().toString().equals("") || GPA5.getText().toString().equals("")) {
                        GPAresult.setText("ERROR!!");
                    }
                    else {
                        n1 = Double.parseDouble(GPA1.getText().toString());
                        n2 = Double.parseDouble(GPA2.getText().toString());
                        n3 = Double.parseDouble(GPA3.getText().toString());
                        n4 = Double.parseDouble(GPA4.getText().toString());
                        n5 = Double.parseDouble(GPA5.getText().toString());
                        GPAresult.setText((n1 + n2 + n3 + n4 + n5) / 5 + "");
                        n6 = Double.parseDouble(GPAresult.getText().toString());

                        if (n6 < 60) {
                            GPAresult.setBackgroundColor(Color.RED);
                        } else if (n6 >= 60 && n6 <= 80) {
                            GPAresult.setBackgroundColor(Color.YELLOW);
                        } else if (n6 >= 80 && n6 <= 100) {
                            GPAresult.setBackgroundColor(Color.GREEN);
                        } else {
                            GPAresult.setBackgroundColor(Color.GRAY);
                        }
                        count++;
                        button.setText("Clear Form");
                    }
                } else {
                    GPA1.setText("");
                    GPA2.setText("");
                    GPA3.setText("");
                    GPA4.setText("");
                    GPA5.setText("");
                    GPAresult.setText("");
                    button.setText("Compute GPA");
                    GPAresult.setBackgroundColor(Color.GRAY);
                    count++;
                }
            }
        });


    }
}