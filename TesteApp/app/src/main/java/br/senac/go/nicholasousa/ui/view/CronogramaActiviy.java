package br.senac.go.nicholasousa.ui.view;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.senac.go.nicholasousa.R;

public class CronogramaActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronograma_activiy);

        Intent intent = getIntent();
        if (intent.hasExtra("ActivityNegrito")) {
            Bundle extras = intent.getExtras();
            int argInt = extras.getInt("ActivityNegrito", -1);
            if (argInt == -1) {
                throw new  IllegalStateException("Argumento não é inteiro");
            }
            TextView textToBold = findViewById(argInt);
            textToBold.setTypeface(null, Typeface.BOLD);
        }
        }
    }
