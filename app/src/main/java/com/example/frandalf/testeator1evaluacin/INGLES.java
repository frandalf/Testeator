package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class INGLES extends AppCompatActivity {
    private Button bU1, bU2;
    private int asignatura=7,unidad=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingles);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bU1 = (Button) findViewById(R.id.BT_Ing1);
        bU2 = (Button) findViewById(R.id.BT_Ing2);

        bU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (INGLES.this,Test.class);
                unidad=1;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (INGLES.this,Test.class);
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
                "1. ¿Cómo se pronuncian las siguientes palabras: the, this, that, there, through?",
                "1",
                "Con sonido ‘d’ de fricción" ,
                "Con sonido ‘t´’" ,
                "Con sonido ‘d’"
        };
        return test;
    }

    public String[] getU1P2() {
        String[] test = {
                "2. ¿Cómo se pronuncian las siguientes palabras: thigh, think, thought, theme?",
                "3",
                "Con sonido ‘d’ con fricción" ,
                "Con sonido ‘d’" ,
                "Con sonido ‘z’"
        };
        return test;
    }

    public String[] getU1P3() {
        String[] test = {
                "3. ¿Cómo se pronuncian las siguientes palabras: yes, you, young, year?",
                "1",
                "Con sonido ‘i’" ,
                "Con sonido ‘ll’ española" ,
                "Ambas son correctas"
        };
        return test;
    }

    public String[] getU1P4() {
        String[] test = {
                "4. Si pronunciamos de manera aislada las palabras car, far, tar,",
                "3",
                "La ‘r’ final suena" ,
                "La ‘r’ final suena pero muy suave" ,
                "La ‘r’ final no suena"
        };
        return test;
    }

    public String[] getU1P5() {
        String[] test = {
                "5. ¿Cuál es la diferencia de pronunciación entre las palabras ‘very’ y ‘bury’?",
                "3",
                "Las dos se pronuncian igual" ,
                "La primera se pronuncia ‘beri’ y la siguiente ‘buri’" ,
                "En ‘very’ hay fricción de la v y en ‘bury’ no hay fricción de la b"
        };
        return test;
    }

    public String[] getU1P6() {
        String[] test = {
                "6. ¿Suena la ‘r’ de la palabra ‘far’ en esta frase: ‘I live far from here.’?",
                "2",
                "Sí, suena" ,
                "No, no suena" ,
                "Suena pero levemente, no tan fuerte como la ‘r’ española."
        };
        return test;
    }

    public String[] getU1P7() {
        String[] test = {
                "7. ¿Suena la ‘r’ de la palabra ‘far’ en esta frase: ‘I live far away.’?",
                "2",
                "No, no suena" ,
                "Suena pero levemente, no tan fuerte como la ‘r’ española."
        };
        return test;
    }

    public String[] getU1P8() {
        String[] test = {
                "8. ¿Cómo se pronuncia ‘Spain’?",
                "1",
                "‘Spein’" ,
                "‘Spain’" ,
                "‘Espain’" ,
                "‘Espein’"
        };
        return test;
    }

    public String[] getU1P9() {
        String[] test = {
                "9. ¿Suena la ‘h’ en las palabras ‘hell’ y ‘ham’?",
                "2",
                "No, no suena. La ‘h’ es muda, como en castellano" ,
                "Sí, si suena."
        };
        return test;
    }

    public String[] getU1P10() {
        String[] test = {
                "10.  ¿Suena la ‘h’ en las palabras ‘honor’ y ‘honest’?",
                "2",
                "Sí, sí suena" ,
                "No, no suena. La ‘h’ es muda, como en castellano"
        };
        return test;
    }

    //FIN UNIDAD 1

    //UNIDAD 2
    public String[] getU2P1() {
        String[] test = {
                "1. Completa los huecos: _______cats are _______ beautiful animals",
                "4",
                "The / ------" ,
                "The / the" ,
                "----- / the" ,
                "----- / -----"
        };
        return test;
    }

    public String[] getU2P2() {
        String[] test = {
                "2. Completa los huecos: _______ and _______ frinend have done the work by _______",
                "2",
                "You / yours" ,
                "You / your" ,
                "Yours / you" ,
                "Yours / you"
        };
        return test;
    }

    public String[] getU2P3() {
        String[] test = {
                "3. Traduce: Son las tres y cuarto",
                "2",
                "It’s half past three" ,
                "It’s quarter past three" ,
                "It’s quarter to three" ,
                "It’s three o’clock"
        };
        return test;
    }

    public String[] getU2P4() {
        String[] test = {
                "4. Completa: My brother is studying hard to be _______",
                "1",
                "An architect" ,
                "Architect" ,
                "A architect" ,
                "The architect"
        };
        return test;
    }

    public String[] getU2P5() {
        String[] test = {
                "5. There _______ four cars in the street",
                "1",
                "Are" ,
                "Be" ,
                "Am" ,
                "Is"
        };
        return test;
    }

    public String[] getU2P6() {
        String[] test = {
                "6. Traduce: Esta es la casa de mis hermanos",
                "1",
                "This is my brothers’ house" ,
                "This is my brother’s house" ,
                "This is the house of my brother" ,
                "THis is my brothers’s house"
        };
        return test;
    }

    public String[] getU2P7() {
        String[] test = {
                "7. Traduce: Peter es el más alto",
                "2",
                "Peter is the more tall" ,
                "Peter is the tallest" ,
                "Petter is the taller" ,
                "Peter is the most tall"
        };
        return test;
    }

    public String[] getU2P8() {
        String[] test = {
                "8. Completa: How _______ money have you saved?",
                "4",
                "Any" ,
                "Some" ,
                "Many" ,
                "Much"
        };
        return test;
    }

    public String[] getU2P9() {
        String[] test = {
                "9. Completa: _______ open that door!",
                "2",
                "No" ,
                "Don’t" ,
                "Not" ,
                "Doesn’t"
        };
        return test;
    }

    public String[] getU2P10() {
        String[] test = {
                "10.  Completa: There _______ an accident yesterday",
                "4",
                "Were" ,
                "Are" ,
                "Is" ,
                "Was"
        };
        return test;
    }





}
