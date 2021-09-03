package com.uso.parcial1ejer2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCancelar, btnRegistrar;
    TextView tvMensaje;
    EditText etNombre, etEdad, etGenero, etDireccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCancelar = findViewById(R.id.btnCancelar);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        tvMensaje = findViewById(R.id.tvMensaje);
        etNombre = findViewById(R.id.etNombre);
        etEdad = findViewById(R.id.etEdad);
        etGenero = findViewById(R.id.etGenero);
        etDireccion = findViewById(R.id.etDireccion);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etNombre.setText("");
                etEdad.setText("");
                etGenero.setText("");
                etDireccion.setText("");
                tvMensaje.setText("");
            }
        });
        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int edad = etEdad.getText().toString().isEmpty() ? 0 : Integer.parseInt(etEdad.getText().toString());
                String nombre = etNombre.getText().toString();
                String mayor = "Bienvenido " + nombre;
                String mensaje = "";
                if (edad > 18) {
                    mensaje = mayor.toUpperCase();
                    tvMensaje.setText(mensaje);
                    tvMensaje.setTextColor(Color.GREEN);
                }
                else {
                    mensaje = "Usted es menor de edad, no se puede registrar";
                    tvMensaje.setText(mensaje);
                    tvMensaje.setTextColor(Color.RED);
                }

            }
        });
    }
}