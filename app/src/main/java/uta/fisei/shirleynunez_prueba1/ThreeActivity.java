package uta.fisei.shirleynunez_prueba1;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThreeActivity extends AppCompatActivity {

    EditText editTextNombres, editTextDividendo , editTextApellidos, editTextDivisor , editTextNumeros;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        editTextNombres = findViewById(R.id.editTextNombrestres);
        editTextDividendo = findViewById(R.id.editTextDividendotres);
        editTextApellidos = findViewById(R.id.editTextApellidostres);
        editTextDivisor = findViewById(R.id.editTextDivisortres);
        editTextNumeros =  findViewById(R.id.editTextNumerotres);
    }

    public void cerrar (View view){
        String apellidos = editTextApellidos.getText().toString();
        String divisor = editTextDivisor.getText().toString();
        String numero = editTextNumeros.getText().toString();
        String nombres = editTextNombres.getText().toString();
        String dividendo = editTextDividendo.getText().toString();

        String[] lstDatos = new String[5];
        lstDatos[0]= nombres;
        lstDatos[1]=apellidos;
        lstDatos[2]= dividendo;
        lstDatos[3]=divisor;
        lstDatos[4]=numero;

        Intent intent = new Intent();
        intent.putExtra("lstDatos",lstDatos);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }





}