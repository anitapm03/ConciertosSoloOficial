package com.example.conciertossolooficial.login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.conciertossolooficial.R;
import com.example.conciertossolooficial.principal.MainActivity;
import com.example.conciertossolooficial.registro.Registro;

public class LogIn extends AppCompatActivity {
    Button btnIS, btnR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        btnIS=findViewById(R.id.btnIS);
        btnR=findViewById(R.id.btnR);

        btnIS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarSesion();
            }
        });
        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registrarse();
            }
        });
    }

    public void iniciarSesion(){
        Intent is =new Intent(this, MainActivity.class);
        startActivity(is);
    }

    public void registrarse(){
        Intent r = new Intent(this, Registro.class);
        startActivity(r);
    }
}