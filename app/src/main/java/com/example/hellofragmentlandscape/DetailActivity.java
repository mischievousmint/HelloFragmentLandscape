package com.example.hellofragmentlandscape;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView selectedEmail = findViewById(R.id.tvDetail);

        String contenidoRecuperado = getIntent().getStringExtra("selectedEmail");

        selectedEmail.setText(contenidoRecuperado);

    }
}
