package com.AJ.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText et;
    EditText et1;
    DatePicker d;
    TimePicker t;
    Button btn1;
    Button btn2;
    EditText no;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    CheckBox smoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.name);
        et1 = findViewById(R.id.No_);
        d = findViewById(R.id.date);
        t = findViewById(R.id.time);
        btn1 = findViewById(R.id.clear);
        btn2 = findViewById(R.id.Set);
        no = findViewById(R.id.nopicker);
        tv1 = findViewById(R.id.response1);
        tv2 = findViewById(R.id.response2);
        tv3 = findViewById(R.id.responsedate);
        tv4 = findViewById(R.id.responsetime);
        tv5 = findViewById(R.id.smokin);
        tv6 = findViewById(R.id.people);
        smoke = findViewById(R.id.smoke);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = et.getText().toString();
                String text1 = et1.getText().toString();
                String num = no.getText().toString();
                String form = text + text1 +num;


                if(form.isEmpty()){
                    Toast.makeText(MainActivity.this, "Form is already Empty", Toast.LENGTH_SHORT).show();
                }else{
                    et.setText(" ");
                    et1.setText(" ");
                    no.setText(" ");
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = et.getText().toString();
                String text1 = et1.getText().toString();
                String num = no.getText().toString();
                String date = d.getMonth() + "/" + d.getDayOfMonth() + "/" + d.getYear();
                String time = t.getCurrentHour() + ":" + t.getCurrentMinute();


                if(text.isEmpty()){
                    Toast.makeText(MainActivity.this, "Name has not been entered Yet", Toast.LENGTH_SHORT).show();
                }else if(text1.isEmpty()){
                    Toast.makeText(MainActivity.this, "Mobile Number has not been entered Yet", Toast.LENGTH_SHORT).show();
                }else if(num.isEmpty()){
                    Toast.makeText(MainActivity.this, "Size of group has not been entered Yet", Toast.LENGTH_SHORT).show();
                }else{
                    tv1.setText("Name: " + text);
                    tv2.setText("Mobile Number: " + text1);
                    tv3.setText("Date: " + date);
                    tv4.setText("Time: " + time);
                    if(smoke.isChecked()){
                        tv5.setText("In smoking area");
                    }else{
                        tv5.setText("In non-smoking area");
                    }
                    tv6.setText("Number of People in group: " + num);
                }
            }
        });

    }
}