package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PMDM extends AppCompatActivity {

    private Button bU1, bU2, bU3;
    private int asignatura=5,unidad=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmdm);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bU1 = (Button) findViewById(R.id.BTPMDM_UD1);
        bU2 = (Button) findViewById(R.id.BTPMDM_UD2);

        bU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (PMDM.this,Test.class);
                unidad=1;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (PMDM.this,Test.class);
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
                "1. ¿Cómo se denomina la configuración utilizada para teléfonos móviles?",
                "1",
                "CLDC" ,
                "CDC" ,
                "CLC"
        };
        return test;
    }

    public String[] getU1P2() {
        String[] test = {
                "2. ¿Cómo se denomina la versión de Java creada para entornos más limitados como pueden ser los móviles?",
                "3",
                "J2EE" ,
                "Máquina Virtual" ,
                "J2ME"
        };
        return test;
    }

    public String[] getU1P3() {
        String[] test = {
                "3. Un perfil es una versión reducida de la máquina normal de Java a la que se le han añadido algunas librerías básicas",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P4() {
        String[] test = {
                "4. ¿Cómo se denominan las aplicaciones creadas utilizando perfiles MIDP?",
                "3",
                "No tienen ningún nombre específico" ,
                "Applets" ,
                "MIDlets"
        };
        return test;
    }

    public String[] getU1P5() {
        String[] test = {
                "5. Un entorno de ejecución J2ME está constituido por:",
                "2",
                "Máquina virtual, configuraciones y perfil" ,
                "Máquina virtual, configuraciones, perfil y paquetes opcionales" ,
                "Máquina virtual y paquetes opcionales"
        };
        return test;
    }

    public String[] getU1P6() {
        String[] test = {
                "6. El principal simulador para dispositivos móviles Windows Phone es Blackberry Smartphone Simulators",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P7() {
        String[] test = {
                "7. Google dispone de un emulador para dispositivos Android",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P8() {
        String[] test = {
                "8. ¿Cómo se denomina la herramienta de Microsoft para definir la interfaz de usuario de una aplicación móvil?",
                "3",
                "Windows Phone MarketPlace test tool" ,
                "Application Development Tool" ,
                "Microsoft Expression Blend"
        };
        return test;
    }

    public String[] getU1P9() {
        String[] test = {
                "9. Los dispositivos Apple sólo permiten aplicaciones firmadas por Apple",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P10() {
        String[] test = {
                "10.  ¿Cómo se denomina el sistema operativo desarrollado por Microsoft que ha sido desarrollado para ser similar a las versiones de escritorio de los sistemas operativos Windows?",
                "1",
                "Windows Phone" ,
                "IOs" ,
                "Android"
        };
        return test;
    }
//FIN UNIDAD 1

    //UNIDAD 2
    public String[] getU2P1() {
        String[] test = {
                "1. ¿Cuál es la forma recomendable de diseñar el interfaz de usuario en Android?",
                "3",
                "Utilizando código Java" ,
                "Utilizando lenguaje de marcado HTML" ,
                "Utilizando lenguaje de marcado XML"
        };
        return test;
    }

    public String[] getU2P2() {
        String[] test = {
                "2. ¿Cuál es la forma más fácil de incluir un vídeo en un Layout?",
                "4",
                "MediaControler" ,
                "SoundPool" ,
                "MediaPlayer" ,
                "VideoView"
        };
        return test;
    }

    public String[] getU2P3() {
        String[] test = {
                "3. ¿Qué método permite la comunicación entre procesos?",
                "1",
                "onBind" ,
                "onDestroy" ,
                "onCreate"
        };
        return test;
    }

    public String[] getU2P4() {
        String[] test = {
                "4. Un servicio simboliza una petición de realizar alguna acción, por ejemplo, lanzar una actividad o visualizar una página web.",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU2P5() {
        String[] test = {
                "5. ¿Cómo se denomina el componente que incluye todas las herramientas necesaria para desarrollar y depurar aplicaciones Android?",
                "3",
                "Eclipse" ,
                "SDK" ,
                "Plugin ADT"
        };
        return test;
    }

    public String[] getU2P6() {
        String[] test = {
                "6. ¿Qué manejador de eventos se llama cuando se pulsa en la pantalla táctil?",
                "1",
                "OnTouchEvent" ,
                "onKeyDown" ,
                "onKeyUp"
        };
        return test;
    }

    public String[] getU2P7() {
        String[] test = {
                "7. ¿Cuál de las siguientes NO es una característica de SQlite?",
                "4",
                "Es transaccional" ,
                "Es de código libre" ,
                "Precisa poca configuración" ,
                "Necesita servidor"
        };
        return test;
    }

    public String[] getU2P8() {
        String[] test = {
                "8. ¿Cómo se denominan los servicios que se ejecutan de manera indefinida hasta que se indique lo contrario?",
                "1",
                "startService" ,
                "Demonios" ,
                "bindService"
        };
        return test;
    }

    public String[] getU2P9() {
        String[] test = {
                "9. Una actividad es cada una de las pantallas que componen la aplicación:",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU2P10() {
        String[] test = {
                "10.  ¿Cómo se denomina la máquina virtual de Android?",
                "1",
                "Dalvik" ,
                "JVM" ,
                "Android no tiene ninguna máquina virtual"
        };
        return test;
    }
//FIN UNIDAD 2

}
