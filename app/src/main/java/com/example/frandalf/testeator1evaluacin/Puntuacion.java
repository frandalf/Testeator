package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.opengl.Visibility;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class Puntuacion extends AppCompatActivity {
    private int puntos=0;
    ArrayList<String> falladas = new ArrayList<>();
    TextView tvPuntos,tvResult,tvPoints;
    Button bInicio, bFalladas;
    int asignatura, unidad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puntuacion);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Bundle datosRecuperados = getIntent().getExtras();
        puntos=datosRecuperados.getInt("puntos");
        falladas=datosRecuperados.getStringArrayList("fallidas");
        asignatura=datosRecuperados.getInt("asignatura");
        unidad=datosRecuperados.getInt("unidad");




        bFalladas = (Button) findViewById(R.id.BT_Fallos);
        bInicio = (Button) findViewById(R.id.BT_Inicio);
        tvPuntos = (TextView) findViewById(R.id.TV_Puntuacion);
        tvResult = (TextView) findViewById(R.id.TV_TextResult);
        tvPoints = (TextView) findViewById(R.id.TV_points);

        tvPuntos.setText(puntos+"/10");


        if (puntos>=7 && puntos<10){
            tvPuntos.setTextColor(Color.GREEN);
            tvResult.setTextColor(Color.GREEN);
            tvResult.setText("¡Enhorabuena, lo has conseguido! Pero tienes que repasar un poco");
            //Se muestra el botón de fallos:
            bFalladas.setVisibility(View.VISIBLE);
        }else if (puntos==10){
            tvPuntos.setTextColor(Color.GREEN);
            tvResult.setTextColor(Color.GREEN);
            tvResult.setText("¡Enhorabuena, lo has conseguido! ¡Perfecto!");
        }else{
            tvPuntos.setTextColor(Color.RED);
            tvResult.setTextColor(Color.RED);
            tvResult.setText("¡Lo siento, has fallado! Vuelve a repasarlo");
            //Se muestra el botón de fallos:
            bFalladas.setVisibility(View.VISIBLE);
        }




        bInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inicio = new Intent(Puntuacion.this, Principal.class);
                startActivity(inicio);
            }
        });


        bFalladas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fallidas = new Intent(Puntuacion.this,ListaErrores.class);
                fallidas.putExtra("fallidas",falladas);
                fallidas.putExtra("asignatura",asignatura);
                fallidas.putExtra("unidad",unidad);
                startActivity(fallidas);
            }
        });


    }
}
