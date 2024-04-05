package com.example.lab2_appiot;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ArrayList<String> resultados = getIntent().getStringArrayListExtra("resultados");
        TextView textView = findViewById(R.id.textView2);
        StringBuilder stringBuilder = new StringBuilder();

        for (String resultado : resultados) {
            stringBuilder.append(resultado).append("\n");
        }
        textView.setText("Resultados " + resultados.size()+" : " + stringBuilder.toString());

    }
}