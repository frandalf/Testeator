package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Test extends AppCompatActivity {
    int asignatura=0, unidad=0, pregunta=1,respuesta=0, nPreguntas=0, puntuacion=0;
    Button bA, bB, bC, bD, bSiguiente;
    TextView tvPregunta, tvA,tvB,tvC,tvD;
    String[] P1, P2, P3, P4, P5, P6, P7, P8, P9, P10;
    ArrayList<String> falladas = new ArrayList<>();







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);




        Bundle datosRecuperados = getIntent().getExtras();
        asignatura= datosRecuperados.getInt("asignatura");
        unidad=datosRecuperados.getInt("unidad");

        bA = (Button) findViewById(R.id.BT_A);
        bB = (Button) findViewById(R.id.BT_B);
        bC = (Button) findViewById(R.id.BT_C);
        bD = (Button) findViewById(R.id.BT_D);
        bSiguiente = (Button) findViewById(R.id.BT_Siguiente);

        tvPregunta = (TextView) findViewById(R.id.TV_Pregunta);
        tvA = (TextView) findViewById(R.id.TV_RespuestaA);
        tvB = (TextView) findViewById(R.id.TV_RespuestaB);
        tvC = (TextView) findViewById(R.id.TV_RespuestaC);
        tvD = (TextView) findViewById(R.id.TV_RespuestaD);

        /*
        <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< COMPROBAMOS ASIGNATURA >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
         */
        //Comprobamos asignatura
            if (asignatura==1){ //Acceso a Datos
                AccesoDatos asignatura = new AccesoDatos();
                if (unidad==1){
                    P1 =asignatura.getU1P1();
                    P2 =asignatura.getU1P2();
                    P3 =asignatura.getU1P3();
                    P4 =asignatura.getU1P4();
                    P5 =asignatura.getU1P5();
                    P6 =asignatura.getU1P6();
                    P7 =asignatura.getU1P7();
                    P8 =asignatura.getU1P8();
                    P9 =asignatura.getU1P9();
                    P10 =asignatura.getU1P10();
                }

                if (unidad==2){
                    P1 =asignatura.getU2P1();
                    P2 =asignatura.getU2P2();
                    P3 =asignatura.getU2P3();
                    P4 =asignatura.getU2P4();
                    P5 =asignatura.getU2P5();
                    P6 =asignatura.getU2P6();
                    P7 =asignatura.getU2P7();
                    P8 =asignatura.getU2P8();
                    P9 =asignatura.getU2P9();
                    P10 =asignatura.getU2P10();
                }

                if (unidad==3){
                    P1 =asignatura.getU3P1();
                    P2 =asignatura.getU3P2();
                    P3 =asignatura.getU3P3();
                    P4 =asignatura.getU3P4();
                    P5 =asignatura.getU3P5();
                    P6 =asignatura.getU3P6();
                    P7 =asignatura.getU3P7();
                    P8 =asignatura.getU3P8();
                    P9 =asignatura.getU3P9();
                    P10 =asignatura.getU3P10();
                }

            }

            if (asignatura==2){//Desarrollo de Interfaces
                DesarrolloInterfaces asignatura = new DesarrolloInterfaces();

                if (unidad==1){
                    P1 =asignatura.getU1P1();
                    P2 =asignatura.getU1P2();
                    P3 =asignatura.getU1P3();
                    P4 =asignatura.getU1P4();
                    P5 =asignatura.getU1P5();
                    P6 =asignatura.getU1P6();
                    P7 =asignatura.getU1P7();
                    P8 =asignatura.getU1P8();
                    P9 =asignatura.getU1P9();
                    P10 =asignatura.getU1P10();
                }

                if (unidad==2){
                    P1 =asignatura.getU2P1();
                    P2 =asignatura.getU2P2();
                    P3 =asignatura.getU2P3();
                    P4 =asignatura.getU2P4();
                    P5 =asignatura.getU2P5();
                    P6 =asignatura.getU2P6();
                    P7 =asignatura.getU2P7();
                    P8 =asignatura.getU2P8();
                    P9 =asignatura.getU2P9();
                    P10 =asignatura.getU2P10();
                }

                if (unidad==3){
                    P1 =asignatura.getU3P1();
                    P2 =asignatura.getU3P2();
                    P3 =asignatura.getU3P3();
                    P4 =asignatura.getU3P4();
                    P5 =asignatura.getU3P5();
                    P6 =asignatura.getU3P6();
                    P7 =asignatura.getU3P7();
                    P8 =asignatura.getU3P8();
                    P9 =asignatura.getU3P9();
                    P10 =asignatura.getU3P10();
                }

                if (unidad==4){
                    P1 =asignatura.getU4P1();
                    P2 =asignatura.getU4P2();
                    P3 =asignatura.getU4P3();
                    P4 =asignatura.getU4P4();
                    P5 =asignatura.getU4P5();
                    P6 =asignatura.getU4P6();
                    P7 =asignatura.getU4P7();
                    P8 =asignatura.getU4P8();
                    P9 =asignatura.getU4P9();
                    P10 =asignatura.getU4P10();
                }


            }

        if (asignatura==3){//Empresa
            EIE asignatura = new EIE();

            if (unidad==1){
                P1 =asignatura.getU1P1();
                P2 =asignatura.getU1P2();
                P3 =asignatura.getU1P3();
                P4 =asignatura.getU1P4();
                P5 =asignatura.getU1P5();
                P6 =asignatura.getU1P6();
                P7 =asignatura.getU1P7();
                P8 =asignatura.getU1P8();
                P9 =asignatura.getU1P9();
                P10 =asignatura.getU1P10();
            }

            if (unidad==2){
                P1 =asignatura.getU2P1();
                P2 =asignatura.getU2P2();
                P3 =asignatura.getU2P3();
                P4 =asignatura.getU2P4();
                P5 =asignatura.getU2P5();
                P6 =asignatura.getU2P6();
                P7 =asignatura.getU2P7();
                P8 =asignatura.getU2P8();
                P9 =asignatura.getU2P9();
                P10 =asignatura.getU2P10();
            }

            if (unidad==3){
                P1 =asignatura.getU3P1();
                P2 =asignatura.getU3P2();
                P3 =asignatura.getU3P3();
                P4 =asignatura.getU3P4();
                P5 =asignatura.getU3P5();
                P6 =asignatura.getU3P6();
                P7 =asignatura.getU3P7();
                P8 =asignatura.getU3P8();
                P9 =asignatura.getU3P9();
                P10 =asignatura.getU3P10();
            }

            if (unidad==4){
                P1 =asignatura.getU4P1();
                P2 =asignatura.getU4P2();
                P3 =asignatura.getU4P3();
                P4 =asignatura.getU4P4();
                P5 =asignatura.getU4P5();
                P6 =asignatura.getU4P6();
                P7 =asignatura.getU4P7();
                P8 =asignatura.getU4P8();
                P9 =asignatura.getU4P9();
                P10 =asignatura.getU4P10();
            }

            if (unidad==5){
                P1 =asignatura.getU5P1();
                P2 =asignatura.getU5P2();
                P3 =asignatura.getU5P3();
                P4 =asignatura.getU5P4();
                P5 =asignatura.getU5P5();
                P6 =asignatura.getU5P6();
                P7 =asignatura.getU5P7();
                P8 =asignatura.getU5P8();
                P9 =asignatura.getU5P9();
                P10 =asignatura.getU5P10();
            }

            if (unidad==6){
                P1 =asignatura.getU6P1();
                P2 =asignatura.getU6P2();
                P3 =asignatura.getU6P3();
                P4 =asignatura.getU6P4();
                P5 =asignatura.getU6P5();
                P6 =asignatura.getU6P6();
                P7 =asignatura.getU6P7();
                P8 =asignatura.getU6P8();
                P9 =asignatura.getU6P9();
                P10 =asignatura.getU6P10();
            }

        }

        if (asignatura==4){ //PSP
            PSP asignatura = new PSP();
            if (unidad==1){
                P1 =asignatura.getU1P1();
                P2 =asignatura.getU1P2();
                P3 =asignatura.getU1P3();
                P4 =asignatura.getU1P4();
                P5 =asignatura.getU1P5();
                P6 =asignatura.getU1P6();
                P7 =asignatura.getU1P7();
                P8 =asignatura.getU1P8();
                P9 =asignatura.getU1P9();
                P10 =asignatura.getU1P10();
            }

            if (unidad==2){
                P1 =asignatura.getU2P1();
                P2 =asignatura.getU2P2();
                P3 =asignatura.getU2P3();
                P4 =asignatura.getU2P4();
                P5 =asignatura.getU2P5();
                P6 =asignatura.getU2P6();
                P7 =asignatura.getU2P7();
                P8 =asignatura.getU2P8();
                P9 =asignatura.getU2P9();
                P10 =asignatura.getU2P10();
            }

        }

        if (asignatura==5){ //PMDM
            PMDM asignatura = new PMDM();
            if (unidad==1){
                P1 =asignatura.getU1P1();
                P2 =asignatura.getU1P2();
                P3 =asignatura.getU1P3();
                P4 =asignatura.getU1P4();
                P5 =asignatura.getU1P5();
                P6 =asignatura.getU1P6();
                P7 =asignatura.getU1P7();
                P8 =asignatura.getU1P8();
                P9 =asignatura.getU1P9();
                P10 =asignatura.getU1P10();
            }

            if (unidad==2){
                P1 =asignatura.getU2P1();
                P2 =asignatura.getU2P2();
                P3 =asignatura.getU2P3();
                P4 =asignatura.getU2P4();
                P5 =asignatura.getU2P5();
                P6 =asignatura.getU2P6();
                P7 =asignatura.getU2P7();
                P8 =asignatura.getU2P8();
                P9 =asignatura.getU2P9();
                P10 =asignatura.getU2P10();
            }

        }

        if (asignatura==6){ //SGE
            SGE asignatura = new SGE();
            if (unidad==1){
                P1 =asignatura.getU1P1();
                P2 =asignatura.getU1P2();
                P3 =asignatura.getU1P3();
                P4 =asignatura.getU1P4();
                P5 =asignatura.getU1P5();
                P6 =asignatura.getU1P6();
                P7 =asignatura.getU1P7();
                P8 =asignatura.getU1P8();
                P9 =asignatura.getU1P9();
                P10 =asignatura.getU1P10();
            }

            if (unidad==2){
                P1 =asignatura.getU2P1();
                P2 =asignatura.getU2P2();
                P3 =asignatura.getU2P3();
                P4 =asignatura.getU2P4();
                P5 =asignatura.getU2P5();
                P6 =asignatura.getU2P6();
                P7 =asignatura.getU2P7();
                P8 =asignatura.getU2P8();
                P9 =asignatura.getU2P9();
                P10 =asignatura.getU2P10();
            }

        }

        if (asignatura==7){ //INGLES
            INGLES asignatura = new INGLES();
            if (unidad==1){
                P1 =asignatura.getU1P1();
                P2 =asignatura.getU1P2();
                P3 =asignatura.getU1P3();
                P4 =asignatura.getU1P4();
                P5 =asignatura.getU1P5();
                P6 =asignatura.getU1P6();
                P7 =asignatura.getU1P7();
                P8 =asignatura.getU1P8();
                P9 =asignatura.getU1P9();
                P10 =asignatura.getU1P10();
            }

            if (unidad==2){
                P1 =asignatura.getU2P1();
                P2 =asignatura.getU2P2();
                P3 =asignatura.getU2P3();
                P4 =asignatura.getU2P4();
                P5 =asignatura.getU2P5();
                P6 =asignatura.getU2P6();
                P7 =asignatura.getU2P7();
                P8 =asignatura.getU2P8();
                P9 =asignatura.getU2P9();
                P10 =asignatura.getU2P10();
            }

        }

        //XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX FIN COMPROBAR ASIGNATURA XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

        //Iniciamos con 1º pregunta
                establecerPregunta();


        /*
        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX BLOQUE BOTONES RESPUESTA XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
         */

        //RESPUESTA A
        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int miRespuesta = 1;
                comprobar(miRespuesta,tvA);
            }
        });

        //RESPUESTA B
        bB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int miRespuesta = 2;
                comprobar(miRespuesta,tvB);
            }
        });

        //RESPUESTA C
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int miRespuesta = 3;
                comprobar(miRespuesta,tvC);
            }
        });

        //RESPUESTA D
        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int miRespuesta = 4;
                comprobar(miRespuesta,tvD);
            }
        });

        /*
        XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX  FIN BLOQUE BOTONES RESPUESTA XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
         */

        bSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                establecerPregunta();

            }
        });




    }//FIN ON CREATE

    public void comprobar(int Respuesta, TextView TV){
        int miRespuesta = Respuesta;
        TextView miTV = TV;
        Toast toast1;

        //Comprobamos si miRespuesta es correcta.
        if(miRespuesta==respuesta){
            miTV.setTextColor(Color.GREEN);
            ++puntuacion;
            //Mostramos resultado en toast
                toast1 = Toast.makeText(getApplicationContext(),"¡CORRECTO!", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.CENTER,0,500);
                toast1.show();
        }else{
            //Establecemos pregunta en lista falladas(1) y seguidamente la respuesta errónea(2):
            String preguntaFallada=tvPregunta.getText().toString();
            falladas.add(preguntaFallada);
            falladas.add(miTV.getText().toString());
            //Coloreamos en rojo el textview de respuesta errónea:
            miTV.setTextColor(Color.RED);

            if (respuesta==1){
                tvA.setTextColor(Color.GREEN);
                //Añadimos a lista falladas la respuesta correcta(3):
                falladas.add(tvA.getText().toString());
            }
            if (respuesta==2){
                tvB.setTextColor(Color.GREEN);
                //Añadimos a lista falladas la respuesta correcta(3):
                falladas.add(tvA.getText().toString());
            }
            if (respuesta==3){
                tvC.setTextColor(Color.GREEN);
                //Añadimos a lista falladas la respuesta correcta(3):
                falladas.add(tvA.getText().toString());
            }
            if (respuesta==4){
                tvD.setTextColor(Color.GREEN);
                //Añadimos a lista falladas la respuesta correcta(3):
                falladas.add(tvA.getText().toString());
            }

            //Mostramos mensaje de error:
            toast1 = Toast.makeText(getApplicationContext(),"¡INCORRECTO!", Toast.LENGTH_SHORT);
            toast1.setGravity(Gravity.CENTER,0,500);
            toast1.show();






        }
        //Desactivamos los botones de respuesta y activamos siguiente:
        bA.setEnabled(false);
        bB.setEnabled(false);
        bC.setEnabled(false);
        bD.setEnabled(false);
        bSiguiente.setEnabled(true);
        pregunta++;

    }

    public void establecerPregunta(){
        String[] numPregunta={};
        //Comprobamos Unidad.

            //Comprobamos pregunta
            if(pregunta==1){
                numPregunta = P1;
            }
            if(pregunta==2){
                numPregunta = P2;
            }
            if(pregunta==3){
                numPregunta = P3;
            }
            if(pregunta==4){
                numPregunta = P4;
            }
            if(pregunta==5){
                numPregunta = P5;
            }
            if(pregunta==6){
                numPregunta = P6;
            }
            if(pregunta==7){
                numPregunta = P7;
            }
            if(pregunta==8){
                numPregunta = P8;
            }
            if(pregunta==9){
                numPregunta = P9;
            }
            if(pregunta==10){
                numPregunta = P10;
            }

        //Comprobamos si no se ha llegado al final de las preguntas:
        if (pregunta <= 10){
            //Establecemos la pregunta y las respuestas dependiendo del valor de "pregunta", que marca el numPregunta actual:
            tvPregunta.setText(numPregunta[0]+"\n");
            respuesta=Integer.parseInt(numPregunta[1]);
            tvA.setText(numPregunta[2]);
            tvB.setText(numPregunta[3]);

            nPreguntas=numPregunta.length;
            //Comprobamos si hay más de dos respuestas:
            if(nPreguntas>4){
                tvC.setText(numPregunta[4]);
                bC.setVisibility(View.VISIBLE);
                tvC.setVisibility(View.VISIBLE);
            }else{
                bC.setVisibility(View.INVISIBLE);
                tvC.setVisibility(View.INVISIBLE);
            }
            if(nPreguntas>5){
                tvD.setText(numPregunta[5]);
                bD.setVisibility(View.VISIBLE);
                tvD.setVisibility(View.VISIBLE);
            }else{
                bD.setVisibility(View.INVISIBLE);
                tvD.setVisibility(View.INVISIBLE);
            }
        }else{
            Intent vpuntuacion = new Intent(Test.this,Puntuacion.class);
            vpuntuacion.putExtra("puntos",puntuacion);
            vpuntuacion.putExtra("fallidas",falladas);
            vpuntuacion.putExtra("asignatura",asignatura);
            vpuntuacion.putExtra("unidad",unidad);
            startActivity(vpuntuacion);
        }


        //Activamos botones:
        bA.setEnabled(true);
        bB.setEnabled(true);
        bC.setEnabled(true);
        bD.setEnabled(true);
        bSiguiente.setEnabled(false);

        //Recoloreamos texto:
        tvA.setTextColor(Color.BLACK);
        tvB.setTextColor(Color.BLACK);
        tvC.setTextColor(Color.BLACK);
        tvD.setTextColor(Color.BLACK);

    }//Fin establecerPregunta()


}//FIN CLASE TEST
