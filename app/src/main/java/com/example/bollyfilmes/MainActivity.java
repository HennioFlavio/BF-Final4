package com.example.bollyfilmes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.list_filmes);

        ArrayList<ItemFilme> arrayList = new ArrayList<>();
        arrayList.add(new ItemFilme("Homem Aranha", "Filme de heroi picado por uma aranha", "10/04/2016", 4));
        arrayList.add(new ItemFilme("Homem Cobra", "Filme de heroi picado por uma cobra", "06/01/2016", 2));
        arrayList.add(new ItemFilme("Homem Javali", "Filme de heroi levou chifrada de um javali", "30/06/2016", 3));
        arrayList.add(new ItemFilme("Homem Passaro", "Filme de heroi picado por um passaro", "23/05/2016", 5));
        arrayList.add(new ItemFilme("Homem Cachorro", "Filme de heroi mordido por um cachorro", "14/02/2016", 3.5f));
        arrayList.add(new ItemFilme("Homem Gato", "Filme de heroi arranhado por um gato", "10/04/2016", 2.5f));

        FilmesAdapter adapter = new FilmesAdapter(this, arrayList);
        list.setAdapter(adapter);

    }
}
