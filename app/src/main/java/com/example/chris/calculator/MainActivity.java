package com.example.chris.calculator;


import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import org.w3c.dom.*;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity
{
    private EditText edittext;
    private String mathOperation;
    private String num1, num2, result;
    private Double realNum1, realNum2, realResult=0.0;
    private boolean validNum1=false;
    private boolean equalsLastOp=false;

    Button zeroButton, oneButton, twoButton, threeButton, fourButton;
    Button fiveButton, sixButton, sevenButton, eightButton, nineButton;
    Button divideButton, multButton, subtractButton, addButton, dotButton, equalsButton;
    Button clrButton;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = (EditText) findViewById(R.id.mainEditText1);
        edittext.setText("");

        zeroButton = (Button) findViewById(R.id.zeroButton);
        zeroButton.setOnClickListener(onClickListener);
        oneButton = (Button) findViewById(R.id.oneButton);
        oneButton.setOnClickListener(onClickListener);
        twoButton = (Button) findViewById(R.id.twoButton);
        twoButton.setOnClickListener(onClickListener);
        threeButton = (Button) findViewById(R.id.threeButton);
        threeButton.setOnClickListener(onClickListener);
        fourButton = (Button) findViewById(R.id.fourButton);
        fourButton.setOnClickListener(onClickListener);
        fiveButton = (Button) findViewById(R.id.fiveButton);
        fiveButton.setOnClickListener(onClickListener);
        sixButton = (Button) findViewById(R.id.sixButton);
        sixButton.setOnClickListener(onClickListener);
        sevenButton = (Button) findViewById(R.id.sevenButton);
        sevenButton.setOnClickListener(onClickListener);
        eightButton = (Button) findViewById(R.id.eightButton);
        eightButton.setOnClickListener(onClickListener);
        nineButton = (Button) findViewById(R.id.nineButton);
        nineButton.setOnClickListener(onClickListener);
        divideButton = (Button) findViewById(R.id.divideButton);
        divideButton.setOnClickListener(onClickListener);
        multButton = (Button) findViewById(R.id.multButton);
        multButton.setOnClickListener(onClickListener);
        subtractButton = (Button) findViewById(R.id.subtractButton);
        subtractButton.setOnClickListener(onClickListener);
        addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(onClickListener);
        equalsButton = (Button) findViewById(R.id.equalsButton);
        equalsButton.setOnClickListener(onClickListener);
        dotButton = (Button) findViewById(R.id.dotButton);
        dotButton.setOnClickListener(onClickListener);
        clrButton = (Button) findViewById(R.id.clrButton);
        clrButton.setOnClickListener(onClickListener);

        mathOperation = "";
        num1 = "";
        num2 = "";
        result = "";
    }

    private OnClickListener onClickListener = new OnClickListener(){

        @Override
        public void onClick(View v)
        {
            //
            switch(v.getId()){
                case R.id.zeroButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("0");
                    break;
                case R.id.oneButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("1");
                    break;
                case R.id.twoButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("2");
                    break;
                case R.id.threeButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("3");
                    break;
                case R.id.fourButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("4");
                    break;
                case R.id.fiveButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("5");
                    break;
                case R.id.sixButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("6");
                    break;
                case R.id.sevenButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("7");
                    break;
                case R.id.eightButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("8");
                    break;
                case R.id.nineButton:
                    //
                    if(equalsLastOp){
                        equalsLastOp=false;
                        validNum1=false;
                        edittext.setText("");
                    }
                    edittext.append("9");
                    break;
                case R.id.divideButton:
                    //
                    if(equalsLastOp)
                        equalsLastOp=false;
                    if(!validNum1)
                        num1 = edittext.getText().toString();
                    mathOperation = "÷";
                    edittext.setText("");
                    break;
                case R.id.multButton:
                    //
                    if(equalsLastOp)
                        equalsLastOp=false;
                    if(!validNum1)
                        num1 = edittext.getText().toString();
                    mathOperation = "*";
                    edittext.setText("");
                    break;
                case R.id.subtractButton:
                    //
                    if(equalsLastOp)
                        equalsLastOp=false;
                    if(!validNum1)
                        num1 = edittext.getText().toString();
                    mathOperation = "-";
                    edittext.setText("");
                    break;
                case R.id.addButton:
                    //
                    if(equalsLastOp)
                        equalsLastOp=false;
                    if(!validNum1)
                        num1 = edittext.getText().toString();
                    mathOperation = "+";
                    edittext.setText("");
                    break;
                case R.id.equalsButton:
                    //
                    num2 = edittext.getText().toString();
                    realNum1 =  Double.valueOf(num1);
                    realNum2 =  Double.valueOf(num2);

                    switch(mathOperation){
                        case "÷":
                            realResult = realNum1/realNum2;
                            //result = Double.toString(realResult);
                            //edittext.setText(result);
                            break;
                        case "*":
                            realResult = realNum1*realNum2;
                            //result = Double.toString(realResult);
                            //edittext.setText(result);
                            break;
                        case "-":
                            realResult = realNum1-realNum2;
                            //result = Double.toString(realResult);
                            //edittext.setText(result);
                            break;
                        case "+":
                            realResult = realNum1+realNum2;
                            //result = Double.toString(realResult);
                            //edittext.setText(num1 + " " + mathOperation + " " + num2 + " = " + result + "\n");
                            //num1 = result;
                            break;
                        default:
                            break;

                    }
                    result = Double.toString(realResult);
                    edittext.setText(num1 + " " + mathOperation + " " + num2 + " = " + result + "\n");
                    num1 = result;
                    validNum1=true;
                    equalsLastOp=true;
                    break;
                case R.id.dotButton:
                    //
                    edittext.append(".");
                    break;
                case R.id.clrButton:
                    //
                    edittext.setText("");
                    validNum1=false;
                    break;
                default:
                    //
                    break;
            }
        }
    };
}

