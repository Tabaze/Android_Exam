package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyDBProduit db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db =new MyDBProduit(this);
        //ArrayList<Produit> prds =new ArrayList<>();
        //prds.add(new Produit(1,"produit 1","liquide",12.4,22));
        //prds.add(new Produit(2,"produit 2","Epicerie",22,10));
        //prds.add(new Produit(3,"produit 3","liquide",15.4,22));
        //prds.add(new Produit(4,"produit 4","Epicerie",14,7));
        //prds.add(new Produit(5,"produit 5","liquide",17.4,30));
        //for(Produit p:prds)
           // MyDBProduit.insertProduit(db.getWritableDatabase(),p);
    }

    public void acceder(View view) {
        Intent i=null;
        switch (view.getId()){
            case R.id.btnListe:
                i=new Intent(this,MainActivity2.class);
                break;
            case R.id.btnFiche:
                i=new Intent(this,MainActivity3.class);
                break;
            case R.id.btnPro:
                i=new Intent(this,MainActivity4.class);
                break;
            case R.id.btnEdi:
                i=new Intent(this,MainActivity5.class);
                break;
        }
        startActivity(i);
    }
}