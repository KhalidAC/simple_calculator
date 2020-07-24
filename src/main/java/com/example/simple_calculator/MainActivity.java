package com.example.simple_calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;

import java.util.Random;

/* Author: Khalid Aboulchaar

This class is designed as a Basic Calculator with some added buttons/functionality
basic arithmetic can be completed in this class.

GNU License
*/

public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, button10,
    buttonAdd, buttonSub, buttonDivision,  buttonMul, buttonC, buttonEqual, buttonSci, buttonCol, buttonRst;

    ConstraintLayout layout;

    TextView edttxt,screen2;

    boolean adding, subtracting, divising, multiplying; // these variables will help when pressing the equals button to compute the calc.

    float num_one, num_two; // float numbers will store the values being operated.


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initializing the buttons to their respective IDs from activity_main.xml
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


        //additions to simple calc
        buttonSci = (Button) findViewById(R.id.sci); // button for Scientific Calculator
        buttonCol = (Button) findViewById(R.id.Col); // a colour button
        buttonRst = (Button) findViewById(R.id.Rst); // a reset button
        layout = findViewById(R.id.layout);


        edttxt = (TextView) findViewById(R.id.screen); // main display to show keypresses
        screen2 = (TextView) findViewById(R.id.screen2); // secondary display to show previously pressed buttons

        // adding the  onclick buttons
        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "0");
                screen2.setText(screen2.getText() + "0");
            }});

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "1");
                screen2.setText(screen2.getText() + "1");
            }});

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "2");
                screen2.setText(screen2.getText() + "2");
            }});

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "3");
                screen2.setText(screen2.getText() + "3");
            }});

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "4");
                screen2.setText(screen2.getText() + "4");
            }});

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "5");
                screen2.setText(screen2.getText() + "5");
            }});

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "6");
                screen2.setText(screen2.getText() + "6");
            }});

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "7");
                screen2.setText(screen2.getText() + "7");
            }});

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "8");
                screen2.setText(screen2.getText() + "8");
            }});

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + "9");
                screen2.setText(screen2.getText() + "9");
            }});
        //button10 corresponds to the decimal and not a number
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(edttxt.getText() + ".");
                screen2.setText(screen2.getText() + ".");
            }});
        //buttonC is the clear button
        buttonC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edttxt.setText(""); // button to clear the Textview
                screen2.setText("");
            }});

        //Operations onCLick methods

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen2.setText(screen2.getText() + "+");
                if (edttxt == null && screen2 == null){
                    edttxt.setText("");
                    screen2.setText("");
                }else{
                    num_one = Float.parseFloat(edttxt.getText()+ "");
                    adding = true;
                    edttxt.setText(null);
                }
            }});

        buttonSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen2.setText(screen2.getText() + "-");
                if (edttxt == null && screen2 == null){
                    edttxt.setText("");
                    screen2.setText("");
                }else{
                    num_one = Float.parseFloat(edttxt.getText()+ "");
                    subtracting = true;
                    edttxt.setText(null);
                }
            }});

        buttonDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen2.setText(screen2.getText() + "/");
                if (edttxt == null && screen2 == null){
                    edttxt.setText("");
                    screen2.setText("");
                }else{
                    num_one = Float.parseFloat(edttxt.getText()+ "");
                    divising = true;
                    edttxt.setText(null);
                }
            }});

        buttonMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                screen2.setText(screen2.getText() + "*");
                if (edttxt == null && screen2 == null){
                    edttxt.setText("");
                    screen2.setText("");
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
        // button to switch to the Scientific Calculator
        buttonSci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSciCalc();
            }

        });

        //button to change the background of the application to a randomly generated colour.
        buttonCol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int colour = Color.argb(255,random.nextInt(256),random.nextInt(256),random.nextInt(256));
                layout.setBackgroundColor(colour);
            }

        });
        //returns the background of the activity to default
        buttonRst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setBackgroundColor(0);
            }
        });





            }
        //function which creates an Intent to change activities, called when buttonSci is pressed.
        public void openSciCalc(){
        Intent intent = new Intent(this, ScienceCalc.class);
        startActivity(intent);
        }





    }
