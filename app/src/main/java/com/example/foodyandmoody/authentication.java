package com.example.foodyandmoody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class authentication extends AppCompatActivity {
    Button retourBtn,calculBtn;
    Intent i,intent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentication);

        // Configuration des insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.authentificationLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Instanciation
        retourBtn = findViewById(R.id.retourBtn);

        // Événement du bouton
        retourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = new Intent(authentication.this, MainActivity.class);
                startActivity(i);
            }

        });
        calculBtn = findViewById(R.id.calculBtn);
        calculBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent2 = new Intent(authentication.this, calculatrice.class);
                startActivity(intent2);
            }
        });
    }
}
