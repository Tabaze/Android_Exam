package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    MyDBProduit db;
    ListView liste;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        db=new MyDBProduit(this);
        liste=findViewById(R.id.liste);
        ArrayList<Produit> prds=MyDBProduit.getAllProduits(db.getReadableDatabase());
        ArrayList<String> listeP=new ArrayList<>();
        for(Produit p: prds){
            listeP.add(p.getId()+" - "+ p.getLibelle());
        }
        ArrayAdapter<String> ad=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,listeP);
        liste.setAdapter(ad);
    }
}