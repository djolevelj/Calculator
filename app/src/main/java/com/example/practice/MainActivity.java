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

    private String selectedOperation = "";

    private boolean operationClickedOnce = false;

    private void setNumber(String num) {
        displayedText += num;
        calcText += num;
        firstNumber = Integer.parseInt(calcText);

        tvResult.setText(displayedText);
    }

    private void setOperation(String operation) {
        if (!operationClickedOnce) {
            tempNum = firstNumber;

            firstNumber = 0;
            calcText = "";
            displayedText = tempNum + operation;

            selectedOperation = operation;

            tvResult.setText(displayedText);
        }
        operationClickedOnce = true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        Button btnClear = findViewById(R.id.btn_clear);

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("2");
            }
        });
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("4");
            }
        });
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("9");
            }
        });
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber("0");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("/");
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              setOperation("+");
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("-");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation("*");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayedText = "";
                calcText = "";
                firstNumber = 0;
                tempNum = 0;
                tvResult.setText(displayedText);
                operationClickedOnce = false;
                selectedOperation = "";
            }
        });
        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (firstNumber == 0 || tempNum == 0)
                    Toast.makeText(MainActivity.this, "error", Toast.LENGTH_SHORT).show();
                else {
                    switch(selectedOperation){
                        case "+":
                            result = firstNumber + tempNum;
                            break;
                        case "-":
                            result =  tempNum - firstNumber;
                            break;
                        case "/":
                            result = tempNum / firstNumber;
                            break;
                        case "*":
                            result = firstNumber * tempNum;
                            break;
                    }
                    tvResult.setText("result = " + result);
                }
            }
        });
    }
}

