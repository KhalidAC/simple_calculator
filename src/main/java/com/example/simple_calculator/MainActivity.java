package com.example.simple_calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

//Khalid Aboulchaar 0300014043

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
    buttonAdd, buttonSub, buttonDivision,  buttonMul, buttonC, buttonEqual;

    TextView edttxt;

    boolean adding, subtracting, divising, multiplying; // these variables will help when pressing the equals button to compute the calc.

    float num_one, num_two; // float numbers will store the values being operated.


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.b0);
        button1 = (Button) findViewById(R.id.b1);
        button2 = (Button) findViewById(R.id.b2);
        button3 = (Button) findViewById(R.id.b3);
        button4 = (Button) findViewById(R.id.b4);
        button5 = (Button) findViewById(R.id.b5);
        button6 = (Button) findViewById(R.id.b6);
        button7 = (Button) findViewById(R.id.b7);
        button8 = (Button) findViewById(R.id.b8);
        button9 = (Button) findViewById(R.id.b9);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.sub);
        buttonDivision = (Button) findViewById(R.id.div);
        buttonMul = (Button) findViewById(R.id.mult);
        buttonEqual = (Button) findViewById(R.id.eql);
        buttonC = (Button) findViewById(R.id.clr);
        button10 = (Button) findViewById(R.id.prd); // decimal button

        edttxt = (TextView) findViewById(R.id.screen);

        // adding the  click button
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "0");
            }});

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "1");
            }});

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "2");
            }});

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "3");
            }});

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "4");
            }});

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "5");
            }});

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "6");
            }});

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "7");
            }});

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "8");
            }});

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "9");
            }});

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + ".");
            }});

        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(""); // button to clear the Textview
            }});

        //Operations onCLick methods

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (edttxt == null){
                    edttxt.setText("");
                }else{
                    num_one = Float.parseFloat(edttxt.getText()+ "");
                    adding = true;
                    edttxt.setText(null);
                }
            }});

        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (edttxt == null){
                    edttxt.setText("");
                }else{
                    num_one = Float.parseFloat(edttxt.getText()+ "");
                    subtracting = true;
                    edttxt.setText(null);
                }
            }});

        buttonDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (edttxt == null){
                    edttxt.setText("");
                }else{
                    num_one = Float.parseFloat(edttxt.getText()+ "");
                    divising = true;
                    edttxt.setText(null);
                }
            }});

        buttonMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if (edttxt == null){
                    edttxt.setText("");
                }else{
                    num_one = Float.parseFloat(edttxt.getText()+ "");
                    multiplying = true;
                    edttxt.setText(null);
                }
            }});

        buttonEqual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                num_two = Float.parseFloat(edttxt.getText()+"");

                if(adding == true){
                    edttxt.setText(num_one + num_two + "");
                    adding = false;
                }
                else if (subtracting == true){
                    edttxt.setText(num_one - num_two + "");
                    subtracting = false;
                }
                else if(divising == true){
                    edttxt.setText(num_one / num_two + "");
                    divising = false;
                }
                else if(multiplying == true){
                    edttxt.setText(num_one * num_two + "");
                    multiplying = false;
                }

            }});



            }







    }