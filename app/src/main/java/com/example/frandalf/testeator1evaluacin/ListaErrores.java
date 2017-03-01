package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaErrores extends AppCompatActivity {
    ArrayList<String> falladas= new ArrayList<>();
    int numeroPreguntas;
    int asignatura, unidad;

    TextView P1,P2,P3,P4,P5,P6,P7,P8,P9,P10,
            RE1,RE2,RE3,RE4,RE5,RE6,RE7,RE8,RE9,RE10,
            RC1,RC2,RC3,RC4,RC5,RC6,RC7,RC8,RC9,RC10,
            S2,S3,S4,S5,S6,S7,S8,S9,S10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_errores);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        Bundle datosRecuperados = getIntent().getExtras();
        falladas=datosRecuperados.getStringArrayList("fallidas");
        asignatura=datosRecuperados.getInt("asignatura");
        unidad=datosRecuperados.getInt("unidad");

        //Variables de TV:
        P1=(TextView) findViewById(R.id.TV_PreguntaFallida1);
        RE1=(TextView) findViewById(R.id.TV_RespuestaFallida1);
        RC1=(TextView) findViewById(R.id.TV_RespuestaAcertada1);
        //--//
        P2=(TextView) findViewById(R.id.TV_PreguntaFallida2);
        RE2=(TextView) findViewById(R.id.TV_RespuestaFallida2);
        RC2=(TextView) findViewById(R.id.TV_RespuestaAcertada2);
        S2=(TextView) findViewById(R.id.TV_Separador2);
        //--//
        P3=(TextView) findViewById(R.id.TV_PreguntaFallida3);
        RE3=(TextView) findViewById(R.id.TV_RespuestaFallida3);
        RC3=(TextView) findViewById(R.id.TV_RespuestaAcertada3);
        S3=(TextView) findViewById(R.id.TV_Separador3);
        //--//
        P4=(TextView) findViewById(R.id.TV_PreguntaFallida4);
        RE4=(TextView) findViewById(R.id.TV_RespuestaFallida4);
        RC4=(TextView) findViewById(R.id.TV_RespuestaAcertada4);
        S4=(TextView) findViewById(R.id.TV_Separador4);
        //--//
        P5=(TextView) findViewById(R.id.TV_PreguntaFallida5);
        RE5=(TextView) findViewById(R.id.TV_RespuestaFallida5);
        RC5=(TextView) findViewById(R.id.TV_RespuestaAcertada5);
        S5=(TextView) findViewById(R.id.TV_Separador5);
        //--//
        P6=(TextView) findViewById(R.id.TV_PreguntaFallida6);
        RE6=(TextView) findViewById(R.id.TV_RespuestaFallida6);
        RC6=(TextView) findViewById(R.id.TV_RespuestaAcertada6);
        S6=(TextView) findViewById(R.id.TV_Separador6);
        //--//
        P7=(TextView) findViewById(R.id.TV_PreguntaFallida7);
        RE7=(TextView) findViewById(R.id.TV_RespuestaFallida7);
        RC7=(TextView) findViewById(R.id.TV_RespuestaAcertada7);
        S7=(TextView) findViewById(R.id.TV_Separador7);
        //--//
        P8=(TextView) findViewById(R.id.TV_PreguntaFallida8);
        RE8=(TextView) findViewById(R.id.TV_RespuestaFallida8);
        RC8=(TextView) findViewById(R.id.TV_RespuestaAcertada8);
        S8=(TextView) findViewById(R.id.TV_Separador8);
        //--//
        P9=(TextView) findViewById(R.id.TV_PreguntaFallida9);
        RE9=(TextView) findViewById(R.id.TV_RespuestaFallida9);
        RC9=(TextView) findViewById(R.id.TV_RespuestaAcertada9);
        S9=(TextView) findViewById(R.id.TV_Separador9);
        //--//
        P10=(TextView) findViewById(R.id.TV_PreguntaFallida10);
        RE10=(TextView) findViewById(R.id.TV_RespuestaFallida10);
        RC10=(TextView) findViewById(R.id.TV_RespuestaAcertada10);
        S10=(TextView) findViewById(R.id.TV_Separador10);

        //Fin Variables botones


        //Comprobamos el número de preguntas en arraylist:
        numeroPreguntas=falladas.size()/3; //Entre 3 porque hay 3 lineas por pregunta: pregunta, respuesta incorrecta, respuesta correcta.

        //Establecemos la primera pregunta:
        P1.setText(falladas.get(0).toString());
        RE1.append(falladas.get(1).toString());
        RC1.append(falladas.get(2).toString()+numeroPreguntas);



        if (numeroPreguntas>=2){//Pregunta 2
            P2.setVisibility(View.VISIBLE);
            RE2.setVisibility(View.VISIBLE);
            RC2.setVisibility(View.VISIBLE);
            S2.setVisibility(View.VISIBLE);

            P2.setText(falladas.get(3).toString());
            RE2.append(falladas.get(4).toString());
            RC2.append(falladas.get(5).toString());



        }

        if (numeroPreguntas>=3){//Pregunta 3
            P3.setVisibility(View.VISIBLE);
            RE3.setVisibility(View.VISIBLE);
            RC3.setVisibility(View.VISIBLE);
            S3.setVisibility(View.VISIBLE);

            P3.setText(falladas.get(6).toString());
            RE3.append(falladas.get(7).toString());
            RC3.append(falladas.get(8).toString());



        }

        if (numeroPreguntas>=4){//Pregunta 4
            P4.setVisibility(View.VISIBLE);
            RE4.setVisibility(View.VISIBLE);
            RC4.setVisibility(View.VISIBLE);
            S4.setVisibility(View.VISIBLE);

            P4.setText(falladas.get(9).toString());
            RE4.append(falladas.get(10).toString());
            RC4.append(falladas.get(11).toString());
        }

        if (numeroPreguntas>=5){//Pregunta 5
            P5.setVisibility(View.VISIBLE);
            RE5.setVisibility(View.VISIBLE);
            RC5.setVisibility(View.VISIBLE);
            S5.setVisibility(View.VISIBLE);

            P5.setText(falladas.get(12).toString());
            RE5.append(falladas.get(13).toString());
            RC5.append(falladas.get(14).toString());
        }


        if (numeroPreguntas>=6){//Pregunta 6
            P6.setVisibility(View.VISIBLE);
            RE6.setVisibility(View.VISIBLE);
            RC6.setVisibility(View.VISIBLE);
            S6.setVisibility(View.VISIBLE);

            P6.setText(falladas.get(15).toString());
            RE6.append(falladas.get(16).toString());
            RC6.append(falladas.get(17).toString());
        }

        if (numeroPreguntas>=7){//Pregunta 7
            P7.setVisibility(View.VISIBLE);
            RE7.setVisibility(View.VISIBLE);
            RC7.setVisibility(View.VISIBLE);
            S7.setVisibility(View.VISIBLE);

            P7.setText(falladas.get(18).toString());
            RE7.append(falladas.get(19).toString());
            RC7.append(falladas.get(20).toString());
        }

        if (numeroPreguntas>=8){//Pregunta 8
            P8.setVisibility(View.VISIBLE);
            RE8.setVisibility(View.VISIBLE);
            RC8.setVisibility(View.VISIBLE);
            S8.setVisibility(View.VISIBLE);

            P8.setText(falladas.get(21).toString());
            RE8.append(falladas.get(22).toString());
            RC8.append(falladas.get(23).toString());
        }

        if (numeroPreguntas>=9){//Pregunta 9
            P9.setVisibility(View.VISIBLE);
            RE9.setVisibility(View.VISIBLE);
            RC9.setVisibility(View.VISIBLE);
            S9.setVisibility(View.VISIBLE);

            P9.setText(falladas.get(24).toString());
            RE9.append(falladas.get(25).toString());
            RC9.append(falladas.get(26).toString());
        }

        if (numeroPreguntas==10){//Pregunta 10
            P10.setVisibility(View.VISIBLE);
            RE10.setVisibility(View.VISIBLE);
            RC10.setVisibility(View.VISIBLE);

            P10.setText(falladas.get(27).toString());
            RE10.append(falladas.get(28).toString());
            RC10.append(falladas.get(29).toString());
        }

    //Fin establecer preguntas y respuestas



    }//Fin onCreate

    //Menu:
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
            MenuItem item1=menu.add(0,1,1,"Volver a inicio");
            MenuItem item2=menu.add(0,2,2,"Reiniciar test");
            MenuItem item3=menu.add(0,3,3, "Volver a asignatura");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        int id= item.getItemId();

        if (id==1){
            Intent nScroll = new Intent(ListaErrores.this,Principal.class);
            startActivity(nScroll);
        }

        if (id==2){
            Intent abrirTest = new Intent(ListaErrores.this,Test.class);
            abrirTest.putExtra("asignatura",asignatura);
            abrirTest.putExtra("unidad",unidad);
            startActivity(abrirTest);

        }

        if (id==3){
            Intent abrirTest = null;
            if(asignatura==1){
                abrirTest  = new Intent(ListaErrores.this,AccesoDatos.class);
            }
            if(asignatura==2){
                abrirTest  = new Intent(ListaErrores.this,DesarrolloInterfaces.class);
            }
            if(asignatura==3){
                abrirTest  = new Intent(ListaErrores.this,EIE.class);
            }
            if(asignatura==4){
                abrirTest  = new Intent(ListaErrores.this,PSP.class);
            }
            if(asignatura==5){
                abrirTest  = new Intent(ListaErrores.this,PMDM.class);
            }
            if(asignatura==6){
                abrirTest  = new Intent(ListaErrores.this,SGE.class);
            }
            if(asignatura==7){
                abrirTest  = new Intent(ListaErrores.this,INGLES.class);
            }
            startActivity(abrirTest);
        }



        return true;
    }
}
