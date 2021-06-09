 package com.example.uncalconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;


 public class MainActivity extends AppCompatActivity implements View.OnClickListener { //implements View.OnClickListener

    private TextView textview;
    private EditText no_1;
     private EditText no_2;
    private Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_1 =findViewById(R.id.add);

        Button button2 = findViewById(R.id.subtract);
        Button button3 = findViewById(R.id.divide);
        Button button4 = findViewById(R.id.multiply);
        Button button5 = findViewById(R.id.modlo);
        Button button6 = findViewById(R.id.power);

        button_1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

        textview = findViewById(R.id.text_3);
        no_1 = findViewById(R.id.no_1);
        no_2 = findViewById(R.id.no_2);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BAN GAYE ARYABHATT??, PDO LIKHO IAS YAS BANO", Toast.LENGTH_SHORT).show();
                String s1 = no_1.getText().toString();
                String s2 = no_2.getText().toString();

                int no1= Integer.parseInt(s1);
                int no2 = Integer.parseInt(s2);
                double pound = no1 + no2 ;
                textview.setText("SUM OF INPUT IS: " + pound);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BAN GAYE ARYABHATT??, PDO LIKHO IAS YAS BANO", Toast.LENGTH_SHORT).show();
                String s1 = no_1.getText().toString();
                String s2 = no_2.getText().toString();

                int no1= Integer.parseInt(s1);
                int no2 = Integer.parseInt(s2);
                double pound = no1 - no2 ;
                textview.setText("SUBTRACTION OF INPUT IS: " + pound);


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BAN GAYE ARYABHATT??, PDO LIKHO IAS YAS BANO", Toast.LENGTH_SHORT).show();
                String s1 = no_1.getText().toString();
                String s2 = no_2.getText().toString();

                int no1= Integer.parseInt(s1);
                int no2 = Integer.parseInt(s2);
                double pound = no1 / no2 ;
                textview.setText("DIVISION OF INPUT IS: " + pound);


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BAN GAYE ARYABHATT??, PDO LIKHO IAS YAS BANO", Toast.LENGTH_SHORT).show();
                String s1 = no_1.getText().toString();
                String s2 = no_2.getText().toString();

                int no1= Integer.parseInt(s1);
                int no2 = Integer.parseInt(s2);
                double pound = no1 * no2 ;
                textview.setText("MULTIPLICATION OF INPUT IS: " + pound);


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BAN GAYE ARYABHATT??, PDO LIKHO IAS YAS BANO", Toast.LENGTH_SHORT).show();
                String s1 = no_1.getText().toString();
                String s2 = no_2.getText().toString();

                int no1= Integer.parseInt(s1);
                int no2 = Integer.parseInt(s2);
                double pound = no1 % no2 ;
                textview.setText("MODLO OF INPUT IS: " + pound);


            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "FACT JANNA H?? ", Toast.LENGTH_SHORT).show();
                String s1 = no_1.getText().toString();
                String s2 = no_2.getText().toString();

                int no1= Integer.parseInt(s1);
                int no2 = Integer.parseInt(s2);
                double pound = no1 - no2 ;
                textview.setText("GO AND STUDY , EXAMS AA RHE H RE! HEHEHEHEH");


            }
        });


    }

     @Override
     public void onClick(View v) {
//         String s1 = no_1.getText().toString();
//         String s2 = no_2.getText().toString();
//
//         int no1= Integer.parseInt(s1);
//         int no2 = Integer.parseInt(s2);
//         double pound = no1 + no2 ;
//         textview.setText("The corresponding value in Pounds is " + pound);

     }


//    @Override
//    public void onClick(View v) {
//        switch(v.getId()){
//
//            case R.id.add:
//                Toast.makeText(this, "ha ha ban gye aryabhatta add", Toast.LENGTH_SHORT).show();
//
//                break;
//            case R.id.subtract:
//                Toast.makeText(this, "ha ha ban gye aryabhatta sub", Toast.LENGTH_SHORT).show();
//
//
//                break;
//            case R.id.divide:
//                Toast.makeText(this, "ha ha ban gye aryabhatta div", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.multiply:
//                Toast.makeText(this, "ha ha ban gye aryabhatta multi", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.modlo:
//                Toast.makeText(this, "ha ha ban gye aryabhatta modlo", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.power:
//                Toast.makeText(this, "ha ha ban gye aryabhatta fact", Toast.LENGTH_SHORT).show();
//                break;
//
//        }
//
//    }



}
