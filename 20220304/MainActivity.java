package com.example.homework_20220304_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String title = "NestingOfLayouts";
    String txt1 = "User Name";
    String txt2 = "Phone No.";
    String txt3 = "Email ID";
    String result = "";

    String btnTxt1 = "Cancel";
    String btnTxt2 = "Save";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtViewTitle = (TextView) findViewById(R.id.txtViewTitle);
        TextView txtView1 = (TextView) findViewById(R.id.txtView1);
        TextView txtView2 = (TextView) findViewById(R.id.txtView2);
        TextView txtView3 = (TextView) findViewById(R.id.txtView3);
        TextView txtViewResult = (TextView) findViewById(R.id.txtViewResult);

        EditText editTxt1 = (EditText) findViewById(R.id.editTxt1);
        EditText editTxt2 = (EditText) findViewById(R.id.editTxt2);
        EditText editTxt3 = (EditText) findViewById(R.id.editTxt3);

        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);

        txtViewTitle.setText(title);
        txtViewTitle.setTextSize(25);

        txtView1.setText(txt1);
        txtView1.setTextSize(20);

        txtView2.setText(txt2);
        txtView2.setTextSize(20);

        txtView3.setText(txt3);
        txtView3.setTextSize(20);

        btn1.setText(btnTxt1);
        btn1.setTextSize(20);

        btn2.setText(btnTxt2);
        btn2.setTextSize(20);

        txtViewResult.setTextSize(15);
        txtViewResult.setMovementMethod(new ScrollingMovementMethod());

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                result = "";

                txtViewResult.setText(result);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                result += editTxt1.getText().toString();
                result += ", " + editTxt2.getText().toString();
                result += ", " + editTxt3.getText().toString() + "\n";

                txtViewResult.setText(result);
            }
        });
    }
}