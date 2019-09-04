package br.senac.go.nicholasousa.ui.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import br.senac.go.nicholasousa.R;

public class PrimeiraTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira_tela);

        ImageButton cronogramaButton= findViewById(R.id.imageButton2);
        cronogramaButton.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view){
                Intent intent= new Intent(getApplicationContext(), CronogramaActiviy.class);
                intent.putExtra("ActivityNegrito", R.id.textView7);
                startActivity(intent);
            }
        });

        ImageButton atividadeButton = findViewById(R.id.imageButton);
        atividadeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), SobreActivity.class);
                startActivity(intent);
            }
        });

    }
}
