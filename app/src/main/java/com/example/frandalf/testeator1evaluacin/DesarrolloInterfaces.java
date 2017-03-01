package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DesarrolloInterfaces extends AppCompatActivity {

    private Button bU1, bU2, bU3, bU4;
    private int asignatura = 2, unidad = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desarrollo_interfaces);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bU1 = (Button) findViewById(R.id.BDI_U1);
        bU2 = (Button) findViewById(R.id.BDI_U2);
        bU3 = (Button) findViewById(R.id.BDI_U3);
        bU4 = (Button) findViewById(R.id.BDI_U4);


        bU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(DesarrolloInterfaces.this, Test.class);
                unidad = 1;
                test.putExtra("asignatura", asignatura);
                test.putExtra("unidad", unidad);
                startActivity(test);
            }
        });

        bU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(DesarrolloInterfaces.this, Test.class);
                unidad = 2;
                test.putExtra("asignatura", asignatura);
                test.putExtra("unidad", unidad);
                startActivity(test);
            }
        });

        bU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(DesarrolloInterfaces.this, Test.class);
                unidad = 3;
                test.putExtra("asignatura", asignatura);
                test.putExtra("unidad", unidad);
                startActivity(test);
            }
        });

        bU4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent(DesarrolloInterfaces.this, Test.class);
                unidad = 4;
                test.putExtra("asignatura", asignatura);
                test.putExtra("unidad", unidad);
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
                "1. ¿En qué paradigma de programación el flujo del programa está determinado por sucesos externos?",
                "3",
                "Declarativo",
                "Imperativo",
                "Dirigido por eventos"
        };
        return test;
    }

    public String[] getU1P2() {
        String[] test = {
                "2. ¿Qué lenguajes son los que se utilizan en la actualidad?",
                "2",
                "Lenguaje ensamblador",
                "Lenguaje de alto nivel",
                "Lenguaje Máquina"
        };
        return test;
    }

    public String[] getU1P3() {
        String[] test = {
                "3. ¿Qué lenguajes son los más cercanos a la máquina?",
                "2",
                "Lenguaje ensamblador",
                "Lenguaje máquina",
                "Lenguaje de alto nivel"
        };
        return test;
    }

    public String[] getU1P4() {
        String[] test = {
                "4. Las clases de Swing se parecen mucho a las de AWT. Así, la clase Panel de AWT tiene una clase JPanel en Swing. Esto se cumple para todas las clases menos para:",
                "1",
                "Choice, Canvas, FileDialog y ScrollPane",
                "Choice, FileDialog y ScrollPane",
                "Canvas, FileDialog y ScrollPane"
        };
        return test;
    }

    public String[] getU1P5() {
        String[] test = {
                "5. ¿Qué evento se crea al realizar cualquier acción con el ratón?",
                "2",
                "KeyEvent",
                "MouseEvent",
                "KeyPress"
        };
        return test;
    }

    public String[] getU1P6() {
        String[] test = {
                "6. ¿Cómo se denomina al objeto que gestiona los eventos?",
                "2",
                "Adapters",
                "Listeners",
                "Source"
        };
        return test;
    }

    public String[] getU1P7() {
        String[] test = {
                "7. Los eventos permiten al programa interactuar con el usuario. Siempre que se utiliza el ratón o el teclado, se genera un evento que describe de una manera exacta lo que ha ocurrido.",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU1P8() {
        String[] test = {
                "8. ¿Cómo se denominan los hijos del evento ComponentEvent?",
                "2",
                "Eventos Semánticos",
                "Eventos Físicos"
        };
        return test;
    }

    public String[] getU1P9() {
        String[] test = {
                "9. ¿Cómo se denomina a las barras de desplazamiento, horizontal o vertical?",
                "2",
                "Frame",
                "ScrollPane",
                "Windows"
        };
        return test;
    }

    public String[] getU1P10() {
        String[] test = {
                "10. ¿Qué método comprueba si el componente está o no activo?",
                "1",
                "getEnabled",
                "Paint",
                "SetEnabled"
        };
        return test;
    }
    //FIN UNIDAD 1

    //UNIDAD 2
    public String[] getU2P1() {
        String[] test = {
                "1. La primera línea de un archivo XML nos indica:",
                "3",
                "La versión",
                "El sistema de codificación",
                "Ambas son correctas"
        };
        return test;
    }

    public String[] getU2P2() {
        String[] test = {
                "2. Cuando una etiqueta en XML está vacía se puede indicar de la forma:",
                "3",
                "<etiqueta></etiqueta>",
                "<etiqueta/>",
                "Ambas son correctas"
        };
        return test;
    }

    public String[] getU2P3() {
        String[] test = {
                "3. En XML no es posible anidar una etiqueta dentro de otra",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P4() {
        String[] test = {
                "4. ¿Cuál de las siguientes herramientas para la generación de interfaces de usuario es propietaria?",
                "2",
                "Lazarus",
                "Visutal Studio",
                "Glade"
        };
        return test;
    }

    public String[] getU2P5() {
        String[] test = {
                "5. ¿Qué menú de Glade permite mostrar la paleta, el editor de propiedades y el Árbol de widgets?",
                "3",
                "Configurar",
                "Editar",
                "Ver"
        };
        return test;
    }

    public String[] getU2P6() {
        String[] test = {
                "6. ¿Cómo se denominan los eventos en Glade?",
                "2",
                "Event",
                "Señales",
                "Widgets"
        };
        return test;
    }

    public String[] getU2P7() {
        String[] test = {
                "7. ¿Cómo se denominan los controles en Glade?",
                "3",
                "Event",
                "Señales",
                "Widgets"
        };
        return test;
    }

    public String[] getU2P8() {
        String[] test = {
                "8. ¿Cuál de los siguientes es un editor de XML libre?",
                "2",
                "Notepad ++",
                "XMLQuire",
                "Liqued XML Studio"
        };
        return test;
    }

    public String[] getU2P9() {
        String[] test = {
                "9. En Glade, cada evento está relacionado con una función que se ejecuta cuando dicho evento acontece",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P10() {
        String[] test = {
                "10. Liquid XML Studio se puede utilizar en sistemas operativos Windows, Linux y Mac.",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }
    //FIN UNIDAD 2

    //UNIDAD 3

    public String[] getU3P1() {
        String[] test = {
                "1. En el AWT, todos los Componentes de la interface de usuario son instancias de la clase Container o uno de sus subtipos:",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU3P2() {
        String[] test = {
                "2. ¿Qué interfaz es la encargada de la representación y posicionamiento en pantalla de componentes AWT?",
                "3",
                "LayoutManager",
                "LayoutManager2",
                "Ambas son verdaderas"
        };
        return test;
    }

    public String[] getU3P3() {
        String[] test = {
                "3. ¿Qué interfaz permite gestionar varios componentes de los que sólo uno se visualiza a la vez, permaneciendo los demás invisibles debajo?",
                "2",
                "FlowLayout",
                "CardLayout",
                "NorthLayout"
        };
        return test;
    }

    public String[] getU3P4() {
        String[] test = {
                "4. ¿Qué evento avisa al programa que el usuario ha utilizado uno de los controles de ventana a nivel del sistema operativo, como los controles de minimizar o cerrar?",
                "2",
                "ContainerEvent",
                "WindowEvent",
                "InputEvent"
        };
        return test;
    }

    public String[] getU3P5() {
        String[] test = {
                "5. Los eventos permiten al programa interactuar con el usuario. Siempre que se utiliza el ratón o el teclado, se genera un evento que describe de una manera exacta lo que ha ocurrido.",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU3P6() {
        String[] test = {
                "6. ¿Cómo se denominan las pruebas que aseguran que un único componente de la aplicación produce una salida correcta de una determinada entrada?",
                "3",
                "Pruebas de integración",
                "Pruebas del sistema",
                "Pruebas unitarias"
        };
        return test;
    }

    public String[] getU3P7() {
        String[] test = {
                "7. ¿Cuál de los siguientes es un programa para la realización de pruebas automáticas?",
                "3",
                "Microsoft Expression Blend",
                "Serialization",
                "JUnit"
        };
        return test;
    }

    public String[] getU3P8() {
        String[] test = {
                "8. Uno de los inconvenientes del empaquetado de componentes es que se producen problemas de dependencia al utilizarlos.",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU3P9() {
        String[] test = {
                "9. ¿Qué método devuelve la anchura y altura del componente como un objeto de la clase Dimension?",
                "3",
                "setSize",
                "modifiedSize",
                "getSize"
        };
        return test;
    }

    public String[] getU3P10() {
        String[] test = {
                "10. El propósito de la clase Container es representar algo que tiene una posición y un tamaño, que pude ser dibujado en la pantalla y que puede recibir eventos de entrada",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    //FIN UNIDAD 3

    //UNIDAD 4
    public String[] getU4P1() {
        String[] test = {
                "1. ¿Cómo se conoce el al enfoque que parte de la regla del 80/20 que consiste en obtener el 80% de los resultados con el 20% de inversión?",
                "3",
                "No existe dicho enfoque",
                "Usabilidad",
                "Discount usability engneering"
        };
        return test;
    }

    public String[] getU4P2() {
        String[] test = {
                "2. ¿Cómo se conoce a la medida concreta y objetiva de la usabilidad de una herramienta o sistema tomada a partir de usuarios reales con tareas reales?",
                "1",
                "Test de usabilidad",
                "Evaluación heurística",
                "Técnica Nielsen"
        };
        return test;
    }

    public String[] getU4P3() {
        String[] test = {
                "3. Se debe utilizar un número reducido de imágenes para que la aplicación sea lo más rápida y ágil posible",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU4P4() {
        String[] test = {
                "4. ¿Cuál de los siguientes problemas debía ser resuelto en un tiempo intermedio según Licklider y Clark (1962)?",
                "3",
                "-Sistemas que faciliten la cooperación entre personas en el diseño y programación de grandes sistemas.",
                "-Sistemas para el almacenamiento masivo de información que permitan su rápida recuperación.",
                "-Reconocimiento por parte de los ordenadores de la voz, de la escritura manual impresa y de la introducción de datos a partir de escritura manual directa."
        };
        return test;
    }

    public String[] getU4P5() {
        String[] test = {
                "5. ¿Cuál de las siguientes características es un objetivo de la usabilidad?",
                "4",
                "Satisfacción" ,
                "Utilidad" ,
                "Efectividad" ,
                "Todas son verdaderas"
        };
        return test;
    }

    public String[] getU4P6() {
        String[] test = {
                "6.¿Qué porcentaje de la interfaz debe ocupar la cabecera?",
                "3",
                "50%" ,
                "25%" ,
                "15%" ,
                "Todas sin incorrectas"
        };
        return test;
    }

    public String[] getU4P7() {
        String[] test = {
                "7. Las técnicas para medir la usabilidad se diferencian en que el test toma medidas empíricas mientras que el análisis heurístico consiste en una evaluación teórica de los hechos observados",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU4P8() {
        String[] test = {
                "8. ¿Cuál de las siguientes opciones hay que tener en cuenta al diseñar menús de navegación?",
                "3",
                "Debe incluir obligatoriamente la opción de Archivo, Nuevo y Abrir.",
                "No se deben incluir más de tres opciones en el menú",
                "Las opciones pueden estar acompañadas por mensajes explicativos (tooltips)"
        };
        return test;
    }

    public String[] getU4P9() {
        String[] test = {
                "9. Se debe utilizar un número reducido de imágenes en la intefaz para que la aplicación sea lo más rápida posible",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU4P10() {
        String[] test = {
                "10. ¿Qué tipo de letra son más adecuadas para usar en nuestra interfaz de usuario?",
                "2",
                "Serif",
                "Sans Serif"
        };
        return test;
    }
    //FIN UNIDAD 4
}
