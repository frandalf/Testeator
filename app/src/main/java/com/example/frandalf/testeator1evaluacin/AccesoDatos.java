package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;

public class AccesoDatos extends AppCompatActivity {

    private Button bU1, bU2, bU3;
    private int asignatura=1,unidad=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acceso_datos);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bU1 = (Button) findViewById(R.id.BAD_U1);
        bU2 = (Button) findViewById(R.id.BAD_U2);
        bU3 = (Button) findViewById(R.id.BAD_U3);


        bU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (AccesoDatos.this,Test.class);
                unidad=1;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (AccesoDatos.this,Test.class);
                unidad=2;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (AccesoDatos.this,Test.class);
                unidad=3;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });



    }

/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<UNIDADES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 */

    //UNIDAD 1
    public String[] getU1P1(){
        String[]test ={
                "1. ¿Cómo se denomina la clase de Java para trabajar con archivos y directorios?",
                "3",
                "OutputFile",
                "InputFile",
                "File"};
        return test;
    }

    public String[] getU1P2(){
        String[]test ={
                "2. Un flujo de información o stream permite la comunicación entre el origen de la información y el destino",
                "1",
                "VERDADERO",
                "FALSO"};
        return test;
    }

    public String[] getU1P3(){
        String[]test ={
                "3. ¿Cómo se denominan los flujos que se encargan de realizar operaciones de entrada y salida en base a bytes de 8 bits?",
                "2",
                "Flujo de caracteres",
                "Flujo de bytes",
                "Flujo de objetos"};
        return test;
    }

    public String[] getU1P4(){
        String[]test ={
                "4. ¿Qué clases se utilizan para la lectura y escritura de caracteres en archivos?",
                "2",
                "PrintWriter y FileReader",
                "FileReader y FileWriter",
                "Reader y Writer"};
        return test;
    }

    public String[] getU1P5(){
        String[]test ={
                "5. DOM permite procesar documentos XML pero no crearlos",
                "2",
                "VERDADERO",
                "FALSO"};
        return test;
    }

    public String[] getU1P6(){
        String[]test ={
                "6. ¿Qué tipo de pruebas se utilizan para controlar si el sistema cumple los requisitos funcionales así como los de rendimiento, seguridad, etc.?",
                "1",
                "Pruebas de validación",
                "Pruebas unitarias",
                "Pruebas de integración"};
        return test;
    }

    public String[] getU1P7(){
        String[]test ={
                "7. ¿Qué clases se utilizan para la gestión de ficheros de objetos?",
                "2",
                "DataInput y Data Output",
                "ObjetcInputStream y ObjectOutputStream",
                "Ambas son correctas"};
        return test;
    }

    public String[] getU1P8(){
        String[]test ={
                "8. ¿Cómo se denominan los ficheros que permiten leer o escribir datos en forma no secuencial, es decir, en cualquier orden?",
                "2",
                "Ficheros de acceso secuencial",
                "Ficheros de acceso aleatorio",
                "Ambas son correctas"};
        return test;
    }
    public String[] getU1P9(){
        String[]test ={
                "9. ¿Qué otro nombre recibe el manual de usuario?",
                "1",
                "Guía de uso",
                "Manual técnico",
                "Documento de usuario"};
        return test;
    }
    public String[] getU1P10(){
        String[]test ={
                "10. ¿Cómo se denomina el error que sucede cuando estamos ejecutando nuestro programa y éste falla?",
                "1",
                "Excepción",
                "Error de programación",
                "Defecto"};
        return test;
    }
    //FIN UNIDAD 1

    //UNIDAD 2
    public String[] getU2P1(){
        String[]test ={
                "1. Un SGDB embebido es aquel que se ejecuta de manera separada de la aplicación con la que se comunica, es decir, el sistema operativo ejecuta ambos como procesos distintos",
                "2",
                "VERDADERO",
                "FALSO"};
        return test;
    }

    public String[] getU2P2(){
        String[]test ={
                "2. ¿Qué tipo de driver se encarga de traducir las solicitudes de API JDBC en llamadas específicas a bases de datos para RDBMS, como por ejemplo SQL Server, utilizando para ello la interfaz de métodos nativos que proporciona Java?",
                "2",
                "Driver tipo 1",
                "Driver tipo 2",
                "Driver tipo 3"};
        return test;
    }

    public String[] getU2P3(){
        String[]test ={
                "3. ¿Qué tipo de driver está implementado utilizando una arquitectura de tres capas?",
                "3",
                "Driver tipo 1",
                "Driver tipo 2",
                "Driver tipo 3"};
        return test;
    }

    public String[] getU2P4(){
        String[]test ={
                "4. ¿Cuál es la sintaxis de una URL de JDBC?",
                "2",
                "Jdbc:<subname>:<subprotocol>",
                "Jdbc:<subprotocol>:<subname>"};
        return test;
    }

    public String[] getU2P5(){
        String[]test ={
                "5. ¿Cómo se denomina el método encargado de ejecutar las sentencias SELECT?",
                "1",
                "executeQuery",
                "executeUpdate"};
        return test;
    }

    public String[] getU2P6(){
        String[]test ={
                "6. ¿Cómo se denomina la interfaz a la que pertenecen los métodos executeQery() y executeUpdate()?",
                "2",
                "Java.sql.ResultSet",
                "Java.sql.Statement"};
        return test;
    }

    public String[] getU2P7(){
        String[]test ={
                "7. ¿Cómo se denomina la interfaz que permite conocer la estructura de los resultados obtenidos?",
                "1",
                "Java.sql.ResultSet",
                "Java.sql.Statement"};
        return test;
    }

    public String[] getU2P8(){
        String[]test ={
                "8. ¿Qué método permite obtener el número de columnas de un bloque de resultados?",
                "2",
                "getColumnType()",
                "getColumnCount()",
                "getColumnName()"};
        return test;
    }

    public String[] getU2P9(){
        String[]test ={
                "9. ¿Qué método ejecuta todas las instrucciones desde el último commit?",
                "2",
                "Rollback",
                "Commit"};
        return test;
    }

    public String[] getU2P10(){
        String[]test ={
                "10.   ¿Qué método deshace todas las instrucciones desde el último commit?",
                "1",
                "Rollback",
                "Commit"};
        return test;
    }
    //FIN UNIDAD 2

    //UNIDAD 3

    public String[] getU3P1(){
        String[]test ={
                "1. ¿En qué estado está un objeto que se ha hecho persistente pero su sesión ha sido cerrada?",
                "3",
                "Persistente",
                "Transitorio",
                "Separado"
        };
        return test;
    }

    public String[] getU3P2(){
        String[]test ={
                "2. El mapeo objeto relacional es una técnica que permite convertir datos del sistema de tipos utilizado en el lenguaje OO con el que se desarrolla la aplicación al utilizarlo en las bases de datos relacionales",
                "1",
                "VERDADERO",
                "FALSO"};
        return test;
    }

    public String[] getU3P3(){
        String[]test ={
                "3.¿Cuál de las siguientes es una ventaja de las herramientas ORM?",
                "4",
                "Abstacción de la base de datos",
                "Seguridad",
                "Rapidez del desarrollo",
                "Todas son verdaderas"};
        return test;
    }

    public String[] getU3P4(){
        String[]test ={
                "4. NHibernate sólo permite trabajar con el SGBDR Oracle",
                "2",
                "VERDADERO",
                "FALSO"};
        return test;
    }

    public String[] getU3P5(){
        String[]test ={
                "5. ¿Qué extensión tienen los archivos de mapeo?",
                "3",
                ".php",
                ".xml",
                ".hbm"};
        return test;
    }

    public String[] getU3P6(){
        String[]test ={
                "6. Los archivos de mapeo definen:",
                "3",
                "Cómo se generan las claves primarias",
                "Cómo se transforman las clases del modelo en tablas",
                "Ambas son verdaderas"
        };
        return test;
    }

    public String[] getU3P7(){
        String[]test ={
                "7. ¿Qué método de la clase Session ejecuta todas las instrucciones desde el último commit?",
                "1",
                "Commit",
                "Rollback",
                "Ninguna es verdadera"
        };
        return test;
    }

    public String[] getU3P8(){
        String[]test ={
                "8. HQL es case insensitive",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU3P9(){
        String[]test ={
                "9. ¿En qué estado está un objeto que se ha hecho persistente pero su sesión ha sido cerrada?",
                "3",
                "Persistente",
                "Transitorio",
                "Separado"
        };
        return test;
    }

    public String[] getU3P10(){
        String[]test ={
                "10. Una relación One-to-One es aquella donde una clase (A) tiene una referencia a una instancia de otra clase (B) y se encuentran relacionadas bajo una misma clave",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }





    /*
        "VERDADERO",
        "FALSO"
     */

    /* PLANTILLA
    public String[] getU3P(){
        String[]test ={
                "",
                "",
               };
        return test;
    }
 */




}
