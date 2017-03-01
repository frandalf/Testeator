package com.example.frandalf.testeator1evaluacin;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EIE extends AppCompatActivity {

    private Button bU1, bU2, bU3, bU4, bU5, bFinal;
    private int asignatura=3,unidad=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eie);

        //Indicamos a la pantalla que se quede sólo en vertical:
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        bU1 = (Button) findViewById(R.id.BEIE_U1);
        bU2 = (Button) findViewById(R.id.BEIE_U2);
        bU3 = (Button) findViewById(R.id.BEIE_U3);
        bU4 = (Button) findViewById(R.id.BEIE_U4);
        bU5 = (Button) findViewById(R.id.BEIE_U5);
        bFinal = (Button) findViewById(R.id.BEIE_Final);

        bU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (EIE.this,Test.class);
                unidad=1;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (EIE.this,Test.class);
                unidad=2;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (EIE.this,Test.class);
                unidad=3;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (EIE.this,Test.class);
                unidad=4;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bU5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (EIE.this,Test.class);
                unidad=5;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });

        bFinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent test = new Intent (EIE.this,Test.class);
                unidad=6;
                test.putExtra("asignatura",asignatura);
                test.putExtra("unidad",unidad);
                startActivity(test);
            }
        });


    }

    /*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<UNIDADES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 */

    /*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<UNIDADES>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
 */
//UNIDAD 1
    public String[] getU1P1() {
        String[] test = {
                "1. ¿Qué significa un sistema empresarial?",
                "2",
                "Conjunto de departamentos de la empresa" ,
                "Conjunto de elementos interrelacionados entre sí y con el sistema económico global, diseñados para alcanzar un objetivo específico." ,
                "El modo de actuar sistemáticamente una empresa dentro de su entorno" ,
                "Todas las respuestas son correctas"
        };
        return test;
    }

    public String[] getU1P2() {
        String[] test = {
                "2. ¿Qué se entiende por cultura empresarial?",
                "4",
                "La formación cultural de los miembros de la empresa" ,
                "Lo que se percibe de una empresa, lo que significa" ,
                "La participación que tiene la empresa en proyectos culturales" ,
                "Lo que identifica la forma de ser de una empresa, su forma de pensar, vivir y actuar"
        };
        return test;
    }

    public String[] getU1P3() {
        String[] test = {
                "3. En el ámbito empresarial podemos distinguir los siguientes modelos de organización empresarial:",
                "2",
                "Organización general y específica" ,
                "Organización vertical u horizontal" ,
                "Organización vertical, horizontal o diagonal" ,
                "Organización vertical, horizontal y circular"
        };
        return test;
    }

    public String[] getU1P4() {
        String[] test = {
                "4. La imagen corporativa es:",
                "1",
                "Lo que se percibe de la empresa, su personalidad" ,
                "El logotipo de la empresa" ,
                "La persona que representa a la empresa" ,
                "Todo lo anterior es correcto"
        };
        return test;
    }

    public String[] getU1P5() {
        String[] test = {
                "5. Las empresas realizan una serie de funciones básicas para lograr sus objetivos. Estas funciones están en relación directa con:",
                "2",
                "Los departamentos o divisiones de la empresa" ,
                "El entorno general y específico" ,
                "La Administración" ,
                "Los clientes actuales y futuros"
        };
        return test;
    }

    public String[] getU1P6() {
        String[] test = {
                "6. La palabra DAFO corresponde a las iniciales de cuatro palabras:",
                "3",
                "Decisiones, Amenazas, Fortalezas y Objetivos" ,
                "Decisiones, Advertencias, Fortalezas y Oportunidades" ,
                "Debilidades, Amenazas, Fortalezas y Oportunidades" ,
                "Decisiones, Amenazas, Fortalezas y Oportunidades"
        };
        return test;
    }

    public String[] getU1P7() {
        String[] test = {
                "7. Los valores básicos de la ética empresarial son:",
                "4",
                "Conseguir beneficios" ,
                "Cumplir las leyes y respetar los derechos humanos" ,
                "Explotar al trabajador" ,
                "Igualdad, libertad, diálogo, respeto y solidaridad."
        };
        return test;
    }

    public String[] getU1P8() {
        String[] test = {
                "8. El entorno específico está formado por los siguientes factores:",
                "2",
                "Competencia actual, productos sustitutivos, proveedores y clientes." ,
                "Competencia actual y futura, productos sustitutivos, proveedores y clientes." ,
                "Factores político legales, demográficos y económicos" ,
                "Factores socioculturales, tecnológicos y medioambientales."
        };
        return test;
    }

    public String[] getU1P9() {
        String[] test = {
                "9. En función de la naturaleza del entorno en el que se desenvuelve la empresa, distinguimos las siguientes clases de entorno:",
                "4",
                "Entorno dinámico y complejo" ,
                "Entorno favorable y desfavorable" ,
                "Entorno general y específico" ,
                "Entorno Estable/dinámico, simple/complejo, hostil/favorable"
        };
        return test;
    }

    public String[] getU1P10() {
        String[] test = {
                "10.   El concepto de Sostenibilidad está conformado por tres pilares, que son:",
                "4",
                "Liquidez, solvencia y prestigio." ,
                "Los derechos de los trabajadores, los derechos humanos y los derechos de la sociedad" ,
                "El desarrollo económico, el entorno y las ventas" ,
                "Económico, social y ambiental"
        };
        return test;
    }
//FIN UNIDAD 1

    //UNIDAD 2
    public String[] getU2P1() {
        String[] test = {
                "1. La satisfacción de necesidades que plantea el mercado se concreta en el ofrecimiento de productos de los sectores primario, secundario y de servicios",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P2() {
        String[] test = {
                "2. La única motivación de una empresa es el beneficio",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P3() {
        String[] test = {
                "3. Los elementos que tienen en cuenta los consumidores, y por tanto deben valorarse para lanzar un producto son: económicos, estéticos, racionales y emocionales. ",
                "1",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P4() {
        String[] test = {
                "4. La matriz DAFO tiene en cuenta el análisis de Destrezas, Amenazas, Fortalezas y Oportunidades.",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P5() {
        String[] test = {
                "5. El análisis DAFO nos lleva a seguir unas determinadas estrategias, y las que se tendrán en cuenta para encontrar una salida a un grave problema son estrategias de reorientación",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P6() {
        String[] test = {
                "6. Las principales herramientas para implementar la imagen corporativa son la comunicación externa y el plan económico",
                "2",
                "VERDADERO",
                "FALSO"
        };
        return test;
    }

    public String[] getU2P7() {
        String[] test = {
                "7. ¿Qué elementos forman el microentorno o entorno específico de una empresa?",
                "1",
                "Factores que afectan directamente a la empresa, tales como proveedores, clientes y competencia." ,
                "Factores culturales, políticos y económicos, como los tipos de interés y la pertenencia a la UE." ,
                "Factores técnicos, jurídicos y sociales, tales como las nuevas tecnologías, las leyes y las modas."
        };
        return test;
    }

    public String[] getU2P8() {
        String[] test = {
                "8. La visión de empresa, su futuro deseado, debe tener las siguientes características",
                "1",
                "Ambas son correctas" ,
                "Factible y compartida" ,
                "Motivadora y de fácil comunicación"
        };
        return test;
    }

    public String[] getU2P9() {
        String[] test = {
                "9. Selecciona la afirmación incorrecta:",
                "3",
                "Es fundamental el análisis del entorno para que la empresa tenga éxito" ,
                "El entorno general hace referencia a factores externos de la empresa" ,
                "Una vez creada la empresa, ésta debe analizar su entorno" ,
                "Lo que sucede en el exterior de la empresa influye en sus decisiones"
        };
        return test;
    }

    public String[] getU2P10() {
        String[] test = {
                "10.   Señala cuál de estas prácticas no puede considerarse socialmente responsable",
                "3",
                "El mantenimiento de condiciones de trabajo seguras y saludables" ,
                "Adoptar medidas para conciliar vida laboral y familiar de las personas que forman parte de la empresa." ,
                "La utilización de fuentes de energía no renovables." ,
                "La igualdad de retribución para las mujeres"

        };
        return test;
    }
//FIN UNIDAD 2

//UNIDAD 3

    public String[] getU3P1() {
        String[] test = {
                "1. La competencia en el mercado es:",
                "4",
                "Técnica basada en imponer nuestro producto en un mercado de consumo." ,
                "Concurrencia de productos distintos en el mismo mercado" ,
                "Técnica basada en llevar a la quiebra a las empresas competidoras" ,
                "Concurrencia en el mismo mercado de distintos oferentes de bienes y servicios"
        };
        return test;
    }

    public String[] getU3P2() {
        String[] test = {
                "2. A la hora de distribuir un producto, ¿qué tendrías en cuenta?",
                "3",
                "Las características de la empresa" ,
                "El mercado al que se destina el producto" ,
                "Todas las respuestas son correctas"
        };
        return test;
    }

    public String[] getU3P3() {
        String[] test = {
                "3. La promoción de ventas:",
                "3",
                "Es indispensable para la fijación del precio" ,
                "Está muy relacionado con la distribución del producto" ,
                "Es un canal de ventas" ,
                "Todas las respuestas son correctas"
        };
        return test;
    }

    public String[] getU3P4() {
        String[] test = {
                "4. ¿Cómo se calcula la cuota del mercado?",
                "3",
                "Mercado actual total 100/mercado actual de una empresa" ,
                "Mercado actual de una empresa/Mercado actual total x 1000" ,
                "Mercado actual de una empresa/Mercado actual total x 100" ,
                "Mercado actual total/Mercado actual de una empresa x 100"
        };
        return test;
    }

    public String[] getU3P5() {
        String[] test = {
                "5. ¿Cuáles son los métodos que existen para la fijación de precios?",
                "2",
                "El método basado en la calidad del producto, el basado en la demanda del mismo y el basado en el precio que pagaría el comprador." ,
                "El método basado en los costes, el basado en la competencia y el basado en el precio que pagaría el comprador." ,
                "El método basado en el beneficio esperado, el basado en la competencia y el basado en el precio que pagaría el comprador." ,
                "El método basado en la renta de los consumidores, el basado en la competencia y el basado en el precio que pagaría el comprador."
        };
        return test;
    }

    public String[] getU3P6() {
        String[] test = {
                "6. ¿Qué es la oferta?",
                "1",
                "Cantidad de producto que están dispuestos a ofrecer los vendedores a un determinado precio." ,
                "Cantidad de producto que están dispuestos a comprar los oferentes a un determinado precio." ,
                "Número de unidades que los clientes están dispuestos a adquirir a un determinado precio." ,
                "Ninguna respuesta es correcta."
        };
        return test;
    }

    public String[] getU3P7() {
        String[] test = {
                "7. ¿Qué es la demanda?",
                "1",
                "Cantidad de producto que están dispuestos a comprar los compradores a un determinado precio." ,
                "La insatisfacción producida por no tener algo." ,
                "Cantidad del producto que están dispuestos a ofrecer los vendedores a un determinado precio." ,
                "Ninguna respuesta es correcta"
        };
        return test;
    }

    public String[] getU3P8() {
        String[] test = {
                "8. ¿Cuál es la estrategia principal para la venta de un producto?",
                "4",
                "Diferenciar nuestro producto de los demás" ,
                "Que el producto satisfaga una necesidad" ,
                "Una alta inversión en publicidad" ,
                "Diferenciar nuestro producto de los demás y que el producto satisfaga una necesidad."
        };
        return test;
    }

    public String[] getU3P9() {
        String[] test = {
                "9. Las fases del ciclo de vida de un producto son:",
                "4",
                "Introducción, madurez, declive" ,
                "Introducción, crecimiento, declive, madurez" ,
                "Introducción, declive" ,
                "Introducción, crecimiento, madurez, declive"
        };
        return test;
    }

    public String[] getU3P10() {
        String[] test = {
                "10.   El mercado meta es:",
                "3",
                "La cuota de mercado a la que se aspira" ,
                "El mercado a donde llega el producto en la etapa de declive" ,
                "El mercado donde se pueden tener más oportunidades para un determinado producto" ,
                "Todas las respuestas son correctas"
        };
        return test;
    }

//FIN UNIDAD 3

    //UNIDAD 4
    public String[] getU4P1() {
        String[] test = {
                "1. El mercado puede definirse como:",
                "3",
                "a. Un lugar donde se realizan intercambios" ,
                "b. Desde una perspectiva comercial, el conjunto de compradores y vendedores de un producto o servicio" ,
                "c. Todas las respuestas son correctas" ,
                "d. El conjunto de compradores reales y potenciales de un producto"
        };
        return test;
    }

    public String[] getU4P2() {
        String[] test = {
                "2. Segmentar un mercado es:",
                "2",
                "a. Priorizar a los compradores potenciales, utilizando una estrategia concentrada." ,
                "b. Dividir el mercado en grupos de compradores con características similares " ,
                "c. Utilizar una estrategia indiferenciada para proporcionar a todos los compradores el mismo producto."
        };
        return test;
    }

    public String[] getU4P3() {
        String[] test = {
                "3. Si consideramos importante adecuar el producto a las necesidades de cada segmento de mercado, estaremos utilizando una estrategia de segmentación:",
                "4",
                "a. Ninguna es correcta" ,
                "b. Concentrada" ,
                "c. Indiferenciada" ,
                "d. Diferenciada"
        };
        return test;
    }

    public String[] getU4P4() {
        String[] test = {
                "4. Cuando nos referimos a la estructura del mercado, ¿qué es un intermediario?",
                "1",
                "a. Actúa entre el fabricante o productor y el consumidor." ,
                "b. Un interlocutor que puede ayudar en caso de aparición de un conflicto" ,
                "c. Ninguna respuesta es correcta" ,
                "d. Es la mejor forma de influir en la cuota de mercado de un producto"
        };
        return test;
    }

    public String[] getU4P5() {
        String[] test = {
                "5. La ventaja competitiva de un producto puede residir en:",
                "1",
                "a. Todas son correctas " ,
                "b. Las ventajas en el producto ampliado" ,
                "c. La calidad" ,
                "d. El precio"
        };
        return test;
    }

    public String[] getU4P6() {
        String[] test = {
                "6. Para obtener información acerca de la competencia:",
                "4",
                "a. Podemos buscar en sus páginas web" ,
                "b. Podemos hacernos pasar por un posible cliente" ,
                "c. Podemos buscar información en organismos oficiales" ,
                "d. Todas las respuestas son correctas"
        };
        return test;
    }

    public String[] getU4P7() {
        String[] test = {
                "7. El Marketing es el desarrollo de una actividad organizada y planificada que enmarca actividades diversas, como el estudio o la investigación del mercado, fijar las características del producto o servicio que se presta, el precio, la distribución, la comunicación, la publicidad…",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU4P8() {
        String[] test = {
                "8. El marketing mix utiliza la combinación de cuatro variables para alcanzar los objetivos finales: producto, promoción, precio y participación.",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU4P9() {
        String[] test = {
                "9. Elegir el canal de distribución de un producto supone tener en cuenta las características del producto y las características de los compradores.",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU4P10() {
        String[] test = {
                "10.   En la política de precios de una empresa influyen los precios de la competencia, los costes del producto, los costes de comercialización y el conjunto de clientes.",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }
//FIN UNIDAD 4

    //UNIDAD 5
    public String[] getU5P1() {
        String[] test = {
                "1. La viabilidad económica de una empresa está relacionada con la capacidad de hacer frente a los gastos que supone poner en marcha un negocio.",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU5P2() {
        String[] test = {
                "2. No hablamos de un bien de inversión si nos referimos a:",
                "2",
                "a. El mobiliario" ,
                "b. El material de oficina" ,
                "c. Las mejoras en el local de una empresa"
        };
        return test;
    }

    public String[] getU5P3() {
        String[] test = {
                "3. La diferencia entre un inversor informal (FamilyFriendsFool) y un business angel es:",
                "1",
                "a. Todas son diferencias" ,
                "b. El inversor informal suele tener una relacion familiar o de amistad, mientras que no existe relación previa con el el business angel." ,
                "c. El business angel busca la rentabilidad económica dentro de unos años mientras que el inversor informal es más desinteresado." ,
                "d. El inversor informal aporta dinero, mientras que el business angel además de dinero, aporta sus conocimientos y experiencias en el mundo empresarial."
        };
        return test;
    }

    public String[] getU5P4() {
        String[] test = {
                "4. La aportación del propio empresario para la creación de una empresa debe fluctuar alrededor de 15% del total de la inversión.",
                "2",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU5P5() {
        String[] test = {
                "5. Para solicitar un crédito bancario, en más importante centrar la negociación sobre la Tasa Anual Equivalente que sobre el Tipo de Interés Nominal.",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU5P6() {
        String[] test = {
                "6. Diferencia entre leasing y renting",
                "2",
                "a. El leasing incluye mantenimiento y el renting no" ,
                "b. El renting incluye mantenimiento y el leasing no." ,
                "c. En uno se alquila un bien y en otro se compra directamente."
        };
        return test;
    }

    public String[] getU5P7() {
        String[] test = {
                "7. Las Sociedades de Garantía Recíproca tienen como principal función servir de avalista a las pymes.",
                "1",
                "VERDADERO",
                "FALSO"

        };
        return test;
    }

    public String[] getU5P8() {
        String[] test = {
                "8. Señala la respuesta incorrecta.  La Sociedad de Capital Riesgo:",
                "1",
                "a. El tiempo medio que la Sociedad de Capital Riesgo permanece en la empresa va de 2 a 3 años." ,
                "b. Su objetivo es vender su participación y obtener beneficios." ,
                "c. Su inversión no suele llegar al 50% del capital." ,
                "d. Invierte en empresas que presentan un gran potencial."
        };
        return test;
    }

    public String[] getU5P9() {
        String[] test = {
                "9. Existen criterios que favorecen la concesión de una subvención:",
                "3",
                "a. La incorporación de las nuevas tecnologías" ,
                "b. La pertenencia a colectivos vulnerables en materia de empleo." ,
                "c. Todas son correctas" ,
                "d. La creación de empleo"
        };
        return test;
    }

    public String[] getU5P10() {
        String[] test = {
                "10. Imposible de traer a la aplicación :D. Marca la primera opción",
                "1",
                "Esta sí",
                "Esta no",
                "Pincha aquí si eres Vera"
        };
        return test;
    }
//FIN UNIDAD 5

    //UNIDAD 6
    public String[] getU6P1() {
        String[] test = {
                "1.       El emprendedor:",
                "1",
                "a. Todas las respuestas son correctas" ,
                "b. Identifica las oportunidades" ,
                "c. Puede generar empleo" ,
                "d. Tiende a crear una idea que se expanda hacia el futuro"
        };
        return test;
    }

    public String[] getU6P2() {
        String[] test = {
                "2.       ¿Cuál de las siguientes cualidades no se corresponde con una persona emprendedora?",
                "2",
                "a. Iniciativa y autodisciplina" ,
                "b. Escasa tolerancia a la frustración" ,
                "c. Confianza en sí misma" ,
                "d. Empatía y espíritu positivo"
        };
        return test;
    }

    public String[] getU6P3() {
        String[] test = {
                "3.       Señala cuáles son los agentes económicos:",
                "2",
                "a. Economías domésticas, empresas y mercados" ,
                "b. Economías domésticas, sector público y empresas" ,
                "c. Sector privado: economías domésticas y empresas"
        };
        return test;
    }

    public String[] getU6P4() {
        String[] test = {
                "4.       Los hábitos de consumo de la población hacen referencia a uno de los siguientes factores de análisis:",
                "1",
                "a. Socioculturales" ,
                "b. Económicos" ,
                "c. Tecnológicos" ,
                "d. Políticolegales"
        };
        return test;
    }

    public String[] getU6P5() {
        String[] test = {
                "5.       ¿Qué elementos forman el microentorno o entorno específico de una empresa?",
                "2",
                "a. Factores técnicos, jurídicos y sociales, tales como las nuevas tecnologías, las leyes y las modas" ,
                "b. Factores que afectan directamente a la empresa, tales como proveedores, clientes y competencia" ,
                "c. Factores culturales, políticos y económicos, como los tipos de interés y la pertenencia a la UE"
        };
        return test;
    }

    public String[] getU6P6() {
        String[] test = {
                "6.       Para obtener información acerca de la competencia:",
                "4",
                "a. Podemos buscar información en organismos oficiales" ,
                "b. Podemos buscar en sus páginas web" ,
                "c. Podemos hacernos pasar por un posible cliente" ,
                "d. Todas son correctas"
        };
        return test;
    }

    public String[] getU6P7() {
        String[] test = {
                "7.       El marketing mix utiliza la combinación de cuatro variables para alcanzar los objetivos finales: producto, promoción, precio y participación.",
                "2",
                "VERDADERO" ,
                "FALSO"
        };
        return test;
    }

    public String[] getU6P8() {
        String[] test = {
                "8.       Las Sociedades de Garantía Recíproca tienen como principal función servir de avalista a las pymes.",
                "1",
                "VERDADERO" ,
                "FALSO"
        };
        return test;
    }

    public String[] getU6P9() {
        String[] test = {
                "9.       La aportación del propio empresario para la creación de una empresa debe fluctuar alrededor del 15% del total de la inversión.",
                "2",
                "VERDADERO" ,
                "FALSO"
        };
        return test;
    }

    public String[] getU6P10() {
        String[] test = {
                "10.   Entre las opciones de financiación para el día a día, vemos distintas alternativas.  Aquella que posibilita pagar a los proveedores con puntualidad, a pesar de no disponer de dinero",
                "2",
                "Factoring" ,
                "Confirming" ,
                "Cuenta de crédito"
        };
        return test;
    }
    //FIN UNIDAD 6




}
