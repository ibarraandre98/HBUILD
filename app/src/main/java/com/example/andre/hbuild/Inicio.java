package com.example.andre.hbuild;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i = new Intent(Inicio.this, MainActivity.class);
                startActivity(i);
            }
        },3000);
    }
    public void opciones(View view){
        Intent intent=new Intent(this,Opciones.class);
        startActivity(intent);
    }
}
