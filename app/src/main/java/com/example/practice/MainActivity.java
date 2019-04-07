package com.example.practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int result = 0, firstNumber = 0, secondNumber = 0;
    private int tempNum = 0;


    private TextView tvResult;
    private String displayedText = "";
    private String calcText = "";

    private boolean plusClickedOnce = false;
    private boolean minusClickedOnce = false;
    private boolean multiplyClickedOnce = false;
    private boolean divideClickedOnce = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayedText = "";
        Button btnPlus = findViewById(R.id.btn_plus);
        Button btnOne = findViewById(R.id.btn_one);
        Button btnTwo = findViewById(R.id.btn_two);
        TextView btnEquals = findViewById(R.id.btn_equals);
        tvResult = findViewById(R.id.tv_result);
        Button btnThree = findViewById(R.id.btn_three);
        Button btnFour = findViewById(R.id.btn_four);
        Button btnFive = findViewById(R.id.btn_five);
        Button btnSix = findViewById(R.id.btn_six);
        Button btnSeven = findViewById(R.id.btn_seven);
        Button btnEight = findViewById(R.id.btn_eight);
        Button btnNine = findViewById(R.id.btn_nine);
        Button btnZero = findViewById(R.id.btn_zero);
        Button btnMinus = findViewById(R.id.btn_minus);
        Button btnDivide = findViewById(R.id.btn_divide);
        Button btnMultiply = findViewById(R.id.btn_multiply);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "1";
                calcText += "1";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);

            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "2";
                calcText += "2";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "3";
                calcText += "3";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "4";
                calcText += "4";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "5";
                calcText += "5";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "6";
                calcText += "6";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "7";
                calcText += "7";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "8";
                calcText += "8";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "9";
                calcText += "9";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText += "0";
                calcText += "0";
                firstNumber = Integer.parseInt(calcText);

                tvResult.setText(displayedText);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!divideClickedOnce){
                    tempNum = firstNumber;
                    firstNumber = 0;
                    calcText = "";
                    displayedText = tempNum + "/";

                    tvResult.setText(displayedText);
                }
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!plusClickedOnce) {
                    tempNum = firstNumber;
                    firstNumber = 0;
                    calcText = "";
                    displayedText = tempNum + "+";

                    tvResult.setText(displayedText);
                }

                plusClickedOnce = true;
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!minusClickedOnce) {
                    tempNum = firstNumber;
                    firstNumber = 0;
                    calcText = "";
                    displayedText = tempNum + "-";

                    tvResult.setText(displayedText);
                }
                minusClickedOnce = true;
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!multiplyClickedOnce) {
                    tempNum = firstNumber;
                    firstNumber = 0;
                    calcText = "";
                    displayedText = tempNum + "*";

                    tvResult.setText(displayedText);
                }
                multiplyClickedOnce = true;
            }

        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == 0 || tempNum == 0)
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                else {
                    result = firstNumber + tempNum;
                    tvResult.setText("result = " + result);
                }
            }
        });


    }
}

