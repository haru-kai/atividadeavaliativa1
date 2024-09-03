package br.com.anaflavia.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class secondatt extends AppCompatActivity {


    //tela q vai mostrar nossos dados recebidos da main (❁´◡`❁)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondatt);


    //intent para receber nossos dados
        Intent intent = getIntent();
        String name = intent.getStringExtra("NOME");
        String email = intent.getStringExtra("MAIL");
        String phone = intent.getStringExtra("CELULAR");

        //Texto q ira mostrar o dados coletados
        TextView resultDo = findViewById(R.id.resultDo);

        //no formato q ira mostrar
        resultDo.setText("Seu nome: "+name+"\nO seu email: "+email+"\ne seu zapzap: "+phone);


    }
}