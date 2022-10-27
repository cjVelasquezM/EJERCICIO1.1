package com.example.operaciones12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etN1, etN2;
    TextView txtResultado;
    Button btnSuma, btnResta, btnMultiplicacion, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1= (EditText) findViewById(R.id.etN1);
        etN2= (EditText) findViewById(R.id.etN2);
        txtResultado = (TextView) findViewById(R.id.txtResultado);
        btnSuma= (Button) findViewById(R.id.btnSuma);
        btnResta= (Button) findViewById(R.id.btnResta);
        btnMultiplicacion= (Button) findViewById(R.id.btnMultiplicacion);
        btnDivision= (Button) findViewById(R.id.btnDivision);

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                suma();
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resta();
            }
        });
        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                multi();
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                division();
            }
        });


        }
        private void suma(){
            double x,y;
            double r;
            x = Double.parseDouble(etN1.getText().toString());
            y = Integer.parseInt(etN2.getText().toString());
            r= x+y;
            txtResultado.setText(String.valueOf(r));
        }

    private void resta(){
        double x,y;
        double r;
        x = Double.parseDouble(etN1.getText().toString());
        y = Integer.parseInt(etN2.getText().toString());
        r= x-y;
        txtResultado.setText(String.valueOf(r));
    }
    private void multi(){
        double x,y;
        double r;
        x = Double.parseDouble(etN1.getText().toString());
        y = Integer.parseInt(etN2.getText().toString());
        r= x*y;
        txtResultado.setText(String.valueOf(r));
    }
    private void division(){
        double x,y;
        double r;
        x = Double.parseDouble(etN1.getText().toString());
        y = Integer.parseInt(etN2.getText().toString());
        r= x/y;
        txtResultado.setText(String.valueOf(r));
    }

    }

