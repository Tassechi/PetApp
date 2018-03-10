package petapp.com.petapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    ArrayList<PersonajesVo> listaPersonajes;
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        listaPersonajes=new ArrayList<>();
        recyclerPersonajes= (RecyclerView) findViewById(R.id.recyclerid);
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();

        AdaptadorPersonajes adapter=new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonajes.setAdapter(adapter);
        
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new PersonajesVo("Marx","Al gato manx se le asigna el nombre de su localidad de origen: la isla de Man (Reino Unido), también se le denomina Man´s cat o gato de la Isla de Man. Se caracterizan principalmente por la ausencia de cola.",R.drawable.manx));
        listaPersonajes.add(new PersonajesVo("Abisinio","Existen diferentes teorías acerca del origen del gato abisinio, algunos mantienen que procede del Antiguo Egipto, sus ancestros más directos serian felinos que habitaban en las orillas del Nilo; otros, en cambio, lo sitúan en Etiopía, supuestamente el primer ejemplar, al que apodaron Zulo.",R.drawable.abisinio));
        listaPersonajes.add(new PersonajesVo("Aleman pelo Largo","El gato alemán de pelo largo, también conocido como Deutsch Langhaar o German Longhair, es originario de Alemania; se trata de una raza muy antigua.\n" +
                "En 1929 el Prof. Dr. Friedrich Schwangart, apasionado por estos gatos, propuso el estándar que debería de llevar esta singular raza. Es reconocida oficialmente en el año 2012 por parte de la World Cat Federation.\n",R.drawable.aleman));
        listaPersonajes.add(new PersonajesVo("Bobtail Japonés","\n" +
                "El gato bobtail japonés desciende de China y Japón, prueba de ello son las numerosas representaciones de este gato aparecidas en objetos de arte provenientes del Extremo Oriente y que datan del Siglo XI; durante esa época solo la aristocracia podía poseer estos ejemplares.\n",R.drawable.bobtail));
        listaPersonajes.add(new PersonajesVo("Norwegian Forest Cat White","El bosque de Noruega o norwegian forest cat, es oriundo de los países nórdicos, al parecer fue introducido por el pueblo vikingo a finales del siglo VIII para exterminar las plagas de roedores existentes en la época. Su pelaje favorecería la adaptación al clima frió de aquellos países; en 1930 criadores noruegos comenzaron a seleccionar ejemplares para así perfeccionar la raza tal y como se conoce en la actualidad.",R.drawable.norwegian));


    }

}