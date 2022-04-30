package com.example.androidcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Stack;
import java.*;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    TextView calculationTV;
    TextView resultsTV;
    String calc="";
    Stack calculation = new Stack();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTextViews();
    }

    private void initTextViews() {
        calculationTV=(TextView) findViewById(R.id.calculations);
        resultsTV=(TextView) findViewById(R.id.results);
    }
    private void setCalc(String val){
        calc=calc+val;
        calculationTV.setText(calc);
    }

    public void equalOnClick(View view) {
        Double prev=null;
    }

    public void clearOnClick(View view) {
        calculationTV.setText("");
        calc="";
        resultsTV.setText("0");
        calculation.empty();
    }

    public void bracketOnClick(View view) {
    }

    public void powerOnClick(View view) {
        setCalc("^");
    }

    public void divideOnClick(View view) {
        setCalc("/");
    }

    public void sevenOnClick(View view) {
        setCalc("7");
        calculation.push(7);
    }
    public void eightOnClick(View view) {
        setCalc("8");
        calculation.push(8);
    }
    public void nineOnClick(View view) {
        setCalc("9");
    }
    public void multiplyOnClick(View view) {
        setCalc("X");
    }
    public void fourOnClick(View view) {
        setCalc("4");
    }
    public void fiveOnClick(View view) {
        setCalc("5");
    }
    public void sixOnClick(View view) {
        setCalc("6");
    }
    public void subtractOnClick(View view) {
        setCalc("-");
    }
    public void oneOnClick(View view) {
        setCalc("1");
    }
    public void twoOnClick(View view) {
        setCalc("2");
    }
    public void threeOnClick(View view) {
        setCalc("3");
    }
    public void addOnClick(View view) {
        setCalc("+");
        calculation.push("+");
    }
    public void dotOnClick(View view) {
        setCalc(".");
    }
    public void zeroOnClick(View view) {
        setCalc("0");
    }

}