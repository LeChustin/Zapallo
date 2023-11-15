package com.chstn.zapallo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private Button btnSumar;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        btnSumar = findViewById(R.id.btnSumar);
        textViewResultado = findViewById(R.id.textViewResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sumarNumeros();
            }
        });
    }

    private void sumarNumeros() {
        // Obtener los números ingresados
        String strNumero1 = editTextNumber1.getText().toString();
        String strNumero2 = editTextNumber2.getText().toString();

        // Verificar que se hayan ingresado números
        if (!strNumero1.isEmpty() && !strNumero2.isEmpty()) {

            double numero1 = Double.parseDouble(strNumero1);
            double numero2 = Double.parseDouble(strNumero2);
            double resultado = numero1 + numero2;


            textViewResultado.setText("Resultado: " + resultado);
        } else {

            textViewResultado.setText("Por favor, ingrese ambos números.");
        }
    }
}
