package com.example.lauramarra.novotestesql;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    EditText codigo, nome;
    TextView buckysText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codigo = (EditText) findViewById(R.id.codigo);
        nome = (EditText) findViewById(R.id.materia);
        buckysText = (TextView) findViewById(R.id.buckysText);

        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    //Add a product to the database
    public void addButtonClicked(View view){
        Fluxograma materia = new Fluxograma(codigo.getText().toString(), nome.getText().toString());
        dbHandler.addMateria(materia);
        printDatabase();
    }

    //Delete items
    public void deleteButtonClicked(View view){
        String inputText = codigo.getText().toString();
        dbHandler.delMateria(inputText);
        printDatabase();
    }

    //Print the database
    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        buckysText.setText(dbString);
        codigo.setText("");
        nome.setText("");
    }

}
