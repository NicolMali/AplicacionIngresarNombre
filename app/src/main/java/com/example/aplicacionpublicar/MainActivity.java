package com.example.aplicacionpublicar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText valorNombre;
    TextView txtNombre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorNombre = (EditText) findViewById(R.id.edtNombre);
        txtNombre = findViewById(R.id.txtNombre);

    }
    public void evento(View view){
                String nombre = valorNombre.getText().toString();
                txtNombre.setText("Bienvenid@: " + nombre);
        Toast.makeText(this, "Su nombre es: " + nombre, Toast.LENGTH_SHORT).show();



    }

}



