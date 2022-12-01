package uta.fisei.shirleynunez_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ThreeActivity extends AppCompatActivity {

    EditText editTextNombrestres, editTextApellidostres, editTextDividendotres, editTextDivisortres, editTextNumerotres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        editTextNombrestres = editTextNombrestres.findViewById(R.id.editTextNombrestres);
       editTextApellidostres= editTextApellidostres.findViewById(R.id.editTextApellidostres);
        editTextDividendotres= editTextDividendotres.findViewById(R.id.editTextDividendotres);
        editTextDivisortres= editTextDivisortres.findViewById(R.id.editTextDivisortres);


    }
     public void cerrar(View view){
        String nombres= editTextNombrestres.getText().toString();
        String apellidos = editTextApellidostres.getText().toString();
        String dividendo = editTextDividendotres.getText().toString();
        String divisor= editTextDivisortres.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("Nombres", nombres);
         intent.putExtra("Apellidos", apellidos);
         intent.putExtra("Dividendo", dividendo);
         intent.putExtra("Divisor", divisor);

         finish();
     }

}