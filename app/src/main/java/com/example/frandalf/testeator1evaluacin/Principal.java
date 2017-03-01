package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import javax.crypto.spec.DESKeySpec;


public class Principal extends AppCompatActivity {
    Button bAD, bDI, bEIE, bPSP, bPMDM, bSGE, bING;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bAD = (Button) findViewById(R.id.BT_AD);
        bDI = (Button) findViewById(R.id.BT_DI);
        bEIE = (Button) findViewById(R.id.BT_EIE);
        bPSP = (Button) findViewById(R.id.BT_PSP);
        bPMDM = (Button) findViewById(R.id.BT_PMDM);
        bSGE = (Button) findViewById(R.id.BT_SGE);
        bING = (Button) findViewById(R.id.BT_INGLES);

        bAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asignatura = new Intent(Principal.this, AccesoDatos.class);
                startActivity(asignatura);
            }
        });

        bDI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asignatura = new Intent(Principal.this, DesarrolloInterfaces.class);
                startActivity(asignatura);
            }
        });

        bEIE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asignatura = new Intent(Principal.this, EIE.class);
                startActivity(asignatura);
            }
        });

        bPSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asignatura = new Intent(Principal.this, PSP.class);
                startActivity(asignatura);
            }
        });

        bPMDM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asignatura = new Intent(Principal.this, PMDM.class);
                startActivity(asignatura);
            }
        });

        bSGE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asignatura = new Intent(Principal.this, SGE.class);
                startActivity(asignatura);
            }
        });

        bING.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent asignatura = new Intent(Principal.this, INGLES.class);
                startActivity(asignatura);
            }
        });


    }
}
