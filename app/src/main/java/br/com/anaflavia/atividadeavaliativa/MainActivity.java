package br.com.anaflavia.atividadeavaliativa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //edit text
        EditText nomeEdit = findViewById(R.id.nomeEdit);
        EditText emailEdit = findViewById(R.id.emailEdit);
        EditText phoneEdit = findViewById(R.id.phoneEdit);


        //botao
        Button guardarBtn = findViewById(R.id.guardarBtn);


        //evento onClick
        guardarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //colocando nossos dados na intent ╰(*°▽°*)╯
                String name = nomeEdit.getText().toString();
                String email = emailEdit.getText().toString();
                String phone = phoneEdit.getText().toString();

                Intent intent = new Intent(MainActivity.this, secondatt.class);
                intent.putExtra("NOME", name);
                intent.putExtra("MAIL", email);
                intent.putExtra("CELULAR", phone);

                startActivity(intent);

            }
        });



            }
        }


