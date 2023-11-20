package com.chstn.zapallo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSumaActivity(View view) {
        Intent intent = new Intent(this, OperacionActivity.class);
        intent.putExtra("operacion", "Suma");
        startActivity(intent);
    }

    public void openRestaActivity(View view) {
        Intent intent = new Intent(this, OperacionActivity.class);
        intent.putExtra("operacion", "Resta");
        startActivity(intent);
    }

    public void openMultiplicacionActivity(View view) {
        Intent intent = new Intent(this, OperacionActivity.class);
        intent.putExtra("operacion", "Multiplicación");
        startActivity(intent);
    }

    public void openDivisionActivity(View view) {
        Intent intent = new Intent(this, OperacionActivity.class);
        intent.putExtra("operacion", "División");
        startActivity(intent);
    }
}
