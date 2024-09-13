package com.viajesTour.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboard extends AppCompatActivity {

    Button btn_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btn_salir = findViewById(R.id.btn_salir);

        btn_salir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {irMainActivity();}
        });

    }

    public void irMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}