package uta.fisei.shirleynunez_prueba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SecontActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secont);
    }

    public void siguiente(View view){
        Intent intent = new Intent(this, ThreeActivity.class);
        startActivity(intent);
    }
    public void cerrar(View view){
        finish();
    }
}