package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;
    EditText num2;
    TextView result;
    Button btnSoma;
    Button btnMult;
    Button btnDivi;
    Button btnSubt;

    int n1, n2, soma, multi, divi, subt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.resultado);
        btnSoma = (Button) findViewById(R.id.btnCalc);
        btnMult = (Button) findViewById(R.id.btnMulti);
        btnDivi = (Button) findViewById(R.id.btnDiv);
        btnSubt = (Button) findViewById(R.id.btnSub);
    }

    public void Calcula(View view) {
        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        if (n1 < 10000 && n2 < 10000) { 
            soma = n1 + n2;
            result.setText(Integer.toString(soma));
        }
    }
        public void Multiplicar(View view){
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 < 10000 && n2 < 10000) {
                multi = n1 * n2;
                result.setText(Integer.toString(multi));
            }
        }
        public void Dividir(View view) {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            if (n1 < 10000 && n2 < 10000) {
                divi = n1 / n2;
                result.setText(Integer.toString(divi));
            }
        }
            public void Subtrair(View view) {
                n1 = Integer.parseInt(num1.getText().toString());
                n2 = Integer.parseInt(num2.getText().toString());
                if (n1 < 10000 && n2 < 10000) {
                    subt = n1 - n2;
                    result.setText(Integer.toString(subt));
                }
            }
}
