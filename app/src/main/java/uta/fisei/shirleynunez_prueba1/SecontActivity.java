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

public class SecontActivity extends AppCompatActivity {

    EditText editTextNombresdos,editTextApellidodos, editTextDividendodos;
    String[] lstDatosRecibidos;
    Button buttonCerrarS ;

    ActivityResultLauncher<Intent> activityResult =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK)
                    {
                        Bundle datos = result.getData().getExtras();
                        lstDatosRecibidos = datos.getStringArray("lstDatos");
                        editTextNombres.setText(lstDatosRecibidos[0].toString());
                        editTextApellidos.setText(lstDatosRecibidos[2].toString());
                        buttonCerrarS.setEnabled(true);

                    }
                }
            });



    EditText editTextNombres, editTextDividendo , editTextApellidos, editTextDivisor , editTextNumeros;



    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secont);
        editTextNombresdos= findViewById(R.id.editTextNombresdos);
        editTextApellidodos= findViewById(R.id.editTextApellidosdos);
        buttonCerrarS = findViewById(R.id.buttonCerrarS);

    }

      public void siguientedos(View view){
        Intent intent = new Intent(this, ThreeActivity.class);
        startActivity(intent);
      }
    public void cerrar(View view){
        Intent intent = new Intent();
        intent.putExtra("lstDatos",lstDatosRecibidos);
        setResult(Activity.RESULT_OK, intent);
        finish();

   }
}