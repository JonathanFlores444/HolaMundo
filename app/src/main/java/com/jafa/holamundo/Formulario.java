package com.jafa.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        //Crear objetos del layout
        EditText edNombres,edApellidos,edCedula,edCorreo,edDireccion;
        Button btValidar = findViewById(R.id.btnValidar);
        edNombres=findViewById(R.id.txtNombres);
        edApellidos=findViewById(R.id.txtApellidos);
        edCedula=findViewById(R.id.txtCedula);
        edCorreo=findViewById(R.id.txtCorreo);
        edDireccion=findViewById(R.id.txtDireccion);

        btValidar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = edNombres.getText().toString();
                if(!nombre.isEmpty()){
                    Toast.makeText(Formulario.this,"Holi",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}