package com.chstn.zapallo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class OperacionActivity extends AppCompatActivity {

    private EditText editTextNumero1;
    private EditText editTextNumero2;
    private TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operacion);

        editTextNumero1 = findViewById(R.id.editTextNumero1);
        editTextNumero2 = findViewById(R.id.editTextNumero2);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void calcularOperacion(View view) {
        double numero1 = Double.parseDouble(editTextNumero1.getText().toString());
        double numero2 = Double.parseDouble(editTextNumero2.getText().toString());
        String operacion = getIntent().getStringExtra("operacion");

        double resultado = 0;

        switch (operacion) {
            case "Suma":
                resultado = numero1 + numero2;
                break;
            case "Resta":
                resultado = numero1 - numero2;
                break;
            case "Multiplicación":
                resultado = numero1 * numero2;
                break;
            case "División":
                if (numero2 != 0
                ) {
                    resultado = numero1 / numero2;
                } else {
                    textViewResultado.setText("No es posible dividir por cero");
                    return;
                }
                break;
            default:
                textViewResultado.setText("Operación no reconocida");
                return;
        }

        // Muestra el resultado en el TextView
        textViewResultado.setText("Resultado: " + resultado);
    }

    private void volverAlMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish(); // Cierra la actividad actual para evitar que quede en la pila de actividades
    }

}
