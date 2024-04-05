package com.example.lab2_appiot;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

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


        /*Le pregunte a chat gpt como se podria hacer cambio de color a un texto*/
        final int[] colores = {R.color.color1, R.color.color2, R.color.color3}; // Agrega tantos colores como desees

        final int[] colorIndex = {0};

        TextView textView = findViewById(R.id.textView3);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cambiar el color del texto al siguiente color en el array
                textView.setTextColor(getResources().getColor(colores[colorIndex[0]]));

                // Incrementar el índice del color
                colorIndex[0]++;

                // Si llegamos al final del array, volvemos al principio
                if (colorIndex[0] >= colores.length) {
                    colorIndex[0] = 0;
                }
            }
        });


    }




    public void irIndicaciones(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void irCalcular(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }


}