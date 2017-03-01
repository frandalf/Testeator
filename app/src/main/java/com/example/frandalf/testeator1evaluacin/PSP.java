package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PSP extends AppCompatActivity {

    private Button bU1, bU2;
    private int asignatura=4,unidad=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psp);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bU1 = (Button) findViewById(R.id.BPSP_UD1);
        bU2 = (Button) findViewById(R.id.BPSP_UD2);

        bU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (PSP.this,Test.class);
                unidad=1;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (PSP.this,Test.class);
                unidad=2;
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
    public String[] getU1P1() {
        String[] test = {
                "1. ¿Qué información almacena el bloque de control de proceso?",
                "3",
                "-Proceso padre, identificador, prioridad, ubicación y recursos utilizados" ,
                "-Estado, identificador, prioridad, ubicación y recursos utilizados, así como un puntero apunando a la posición de memoria donde se encuentra el proceso padre" ,
                "-estado, identificador, prioridad, ubicación y recursos utilizados"
        };
        return test;
    }

    public String[] getU1P2() {
        String[] test = {
                "2. Un proceso hijo puede terminar la ejecución de su proceso padre",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P3() {
        String[] test = {
                "3. Se denomina hebra o hilo a un punto de ejecución de un proceso",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P4() {
        String[] test = {
                "4. ¿Cómo se denomina el estado de un proceso que tiene asignado tiempo de CPU y está ejecutando las instrucciones que lo componen?",
                "3",
                "Bloqueado" ,
                "Preparado" ,
                "En ejecución"
        };
        return test;
    }

    public String[] getU1P5() {
        String[] test = {
                "5. Un proceso puede pasar del estado de nuevo al de ejecución directamente",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P6() {
        String[] test = {
                "6. Un proceso pasa del estado de ejecución a preparado cuando está esperando que se le asigne algún recurso que necesita para ejecutarse",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P7() {
        String[] test = {
                "7. ¿Cómo se conoce el proceso de comunicación por el que un proceso que suministra datos no tiene que esperarse a que el proceso que los necesita los coja?",
                "1",
                "Asíncrona" ,
                "Síncrona"
        };
        return test;
    }

    public String[] getU1P8() {
        String[] test = {
                "8. A los sistemas de memoria compartida se les conoce también con el nombre de:",
                "2",
                "Multicomputadores" ,
                "Multiprocesadores"

        };
        return test;
    }

    public String[] getU1P9() {
        String[] test = {
                "9. Los sistemas MIMD necesitan menos tiempo de inicio para la comunicación entre los procesadores",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P10() {
        String[] test = {
                "10. ¿Cuál de los modelos de la taxonomía de Flynn es el más utilizado en la computación paralela?",
                "1",
                "MIMD" ,
                "SISD" ,
                "SIMD"
        };
        return test;
    }
//FIN UNIDAD 1

    //UNIDAD 2
    public String[] getU2P1() {
        String[] test = {
                "1. Un hilo es un punto de ejecución de un proceso",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU2P2() {
        String[] test = {
                "2. Los hilos de un mismo proceso comparten el mismo espacio de direcciones y tienen acceso a los mismos datos",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P3() {
        String[] test = {
                "3. A los hilos también se los denomina",
                "3",
                "Threads" ,
                "Hebras" ,
                "Ambas son verdaderas"
        };
        return test;
    }

    public String[] getU2P4() {
        String[] test = {
                "4. ¿Qué método se utiliza para conocer el estado de un hilo?",
                "3",
                "Start" ,
                "Yield" ,
                "isAlive"
        };
        return test;
    }

    public String[] getU2P5() {
        String[] test = {
                "5. ¿Cuál de las siguientes definiciones de clase es correcta para programar multihilo en Java?",
                "3",
                "Public class nombre implements Runnable" ,
                "Public class nombre extends Threads" ,
                "Ambas son verdaderas"
        };
        return test;
    }

    public String[] getU2P6() {
        String[] test = {
                "6. ¿Qué método se utiliza para notificar que una condición ha cambiado?",
                "3",
                "Notify" ,
                "NotifyAll" ,
                "Ambas son verdaderas"
        };
        return test;
    }

    public String[] getU2P7() {
        String[] test = {
                "7. Un hilo pasa del estado de ejecución a preparado cuando está esperando que se le asigne algún recurso que necesita para ejecutarse",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU2P8() {
        String[] test = {
                "8. ¿Cómo se denomina el estado en el que se encuentra un proceso que está esperando que se le asignen los recursos que necesita para ejecutarse?",
                "2",
                "Preparado" ,
                "Bloqueado" ,
                "En ejecución"
        };
        return test;
    }

    public String[] getU2P9() {
        String[] test = {
                "9. ¿Qué método se utiliza para permutar la ejecución de una tarea y la siguiente disponible?",
                "1",
                "Yield" ,
                "Start" ,
                "isAlive"
        };
        return test;
    }

    public String[] getU2P10() {
        String[] test = {
                "10. ¿Qué método se utiliza para iniciar un hilo?",
                "2",
                "Yield" ,
                "Start" ,
                "isAlive"
        };
        return test;
    }
//FIN UNIDAD 2

}
