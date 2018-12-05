package com.example.jaime.pratica4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumerosPrimos extends AppCompatActivity {


    TextView idtxtentero;
    EditText ideditEntero;
    Button btnCalcular;
    TextView idtxtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

        idtxtentero = findViewById(R.id.idtxtentero);
        ideditEntero = findViewById(R.id.ideditEntero);
        btnCalcular = findViewById(R.id.btnCalcular);
        idtxtResultado = findViewById(R.id.idtxtResultado);

        this.setTitle(R.string.app_name_hijo1);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num = Integer.parseInt(ideditEntero.getText().toString());
                boolean prime = true;
                for (int i = 2; i <= num/2; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime)
                    idtxtResultado.setText("Si es Primo");
                else
                    idtxtResultado.setText("No es Primo");
            }

        });
    }

}
