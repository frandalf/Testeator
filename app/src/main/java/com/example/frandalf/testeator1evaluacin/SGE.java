package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SGE extends AppCompatActivity {
    private Button bU1, bU2, bU3;
    private int asignatura=6,unidad=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sge);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bU1 = (Button) findViewById(R.id.BSGE_U1);
        bU2 = (Button) findViewById(R.id.BSGE_U2);

        bU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (SGE.this,Test.class);
                unidad=1;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (SGE.this,Test.class);
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
                "1. ¿Cuál no es un objetivo de un ERP?",
                "3",
                "Reducir costes" ,
                "Ofrecer seguridad" ,
                "Quitar los virus del ordenador"
        };
        return test;
    }

    public String[] getU1P2() {
        String[] test = {
                "2. Hay que pagar para poder utilizar Sugar CRM",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU1P3() {
        String[] test = {
                "3. SAP es un software ERP",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU1P4() {
        String[] test = {
                "4. Con OpenERP es posible realizar copias de seguridad para después importar datos a otros sistemas.",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU1P5() {
        String[] test = {
                "5. SAP Business One es compatible con la mayoría de sistemas operativos y bases de datos:",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU1P6() {
        String[] test = {
                "6. ¿Cuáles son los requisitos mínimos para instalar OpenERP?",
                "1",
                "512 MB RAM mínimo y 150 MB de espacio libre en disco duro." ,
                "256 MB RAM mínimo y 150 MB de espacio libre en disco duro." ,
                "1 GB RAM mínimo y 250 MB de espacio libre en disco duro."
        };
        return test;
    }

    public String[] getU1P7() {
        String[] test = {
                "7. En la arquitectura cliente/servidor sólo puede haber un servidor que da servicio a varios clientes:",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU1P8() {
        String[] test = {
                "8. ¿Cuál de los siguientes ERP permite trabajar remotamente mediante interfaz web?",
                "3",
                "Microsoft Dynamic Nav" ,
                "OpernBravo" ,
                "OpenERP"
        };
        return test;
    }

    public String[] getU1P9() {
        String[] test = {
                "9. ¿Cuál de los siguientes es un software ERP?",
                "4",
                "Microsoft Dynamic Nav" ,
                "OpernBravo" ,
                "OpenERP" ,
                "Todos son software ERP"
        };
        return test;
    }

    public String[] getU1P10() {
        String[] test = {
                "10.  Solmicro es una solución de software de gestión ERP de Microsoft para pequeñas y medianas empresas basada en el sistema de roles que permite que un usuario acceda al sistema viendo así la información que necesita para realizar sus tareas diarias.",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }
//FIN UNIDAD 1

    //UNIDAD 2
    public String[] getU2P1() {
        String[] test = {
                "1. El software libre es siempre gratuito",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU2P2() {
        String[] test = {
                "2. ¿Cómo se denomina el software cuya copia, redistribución o modificación están en alguna medida, prohibidos por su propietario?",
                "1",
                "Propietario" ,
                "Trial" ,
                "Demo"
        };
        return test;
    }

    public String[] getU2P3() {
        String[] test = {
                "3. El software propietario es considerado lo contrario del software libre",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU2P4() {
        String[] test = {
                "4. ¿Cómo se denomina el software que se distribuye con menos funciones de las disponibles?",
                "3",
                "Propietario" ,
                "Trial" ,
                "Demo"
        };
        return test;
    }

    public String[] getU2P5() {
        String[] test = {
                "5. ¿Cuál de los siguientes es un modo de instalación de un software ERP-CRM?",
                "4",
                "Utilizando comandos" ,
                "Utilizando una interfaz gráfica" ,
                "Mediante una máquina virtual" ,
                "Todas son verdaderas"
        };
        return test;
    }

    public String[] getU2P6() {
        String[] test = {
                "6. ¿Cómo se denomina el modo de trabajo de un sistema ERP-CRM mediante el cual la base de datos, los programas necesarios para que funcione la aplicación y el ordenador donde se ejecuta la aplicación cliente se encuentran en el mismo equipo?",
                "2",
                "Cliente/servidor" ,
                "Monopuesto"
        };
        return test;
    }

    public String[] getU2P7() {
        String[] test = {
                "7. OpenERP está disponible para sistemas operativos Windows y Linux",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU2P8() {
        String[] test = {
                "8. ¿Cómo se denominan los Archivos o módulos que permiten adaptar el sistema a las leyes del país del usuario?",
                "1",
                "Archivos de localización del país",
                "Archivos de configuración",
                "Archivos de administración de localizaciones"

        };
        return test;
    }

    public String[] getU2P9() {
        String[] test = {
                "9. ¿Cómo se denomina la versión normal estable que es apoyada por un tiempo prologando bajo garantía del OpenERP Publisher?",
                "3",
                "TTS",
                "OP",
                "LTS"

        };
        return test;
    }

    public String[] getU2P10() {
        String[] test = {
                "10. Utilizamos el modelo de cliente-servidor cuando el ordenador donde se ejecuta la aplicación cliente es distinto del ordenador donde están almacenados los datos y donde se ejecutan los programas.",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }
//FIN UNIDAD 2

}
