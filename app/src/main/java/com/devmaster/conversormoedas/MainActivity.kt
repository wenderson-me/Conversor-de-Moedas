package com.devmaster.conversormoedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);

        EditText valor = findViewById(R.id.editValor);
        valor.getText();
    }

}
