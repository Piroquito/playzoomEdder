package com.edder.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.edder.playzoom.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Button btnGetStarted;

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnGetStarted.setOnClickListener(v -> {
            Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
        });
        binding.txtMoview.setText("Mira tu pelicula \n favoria ");

      //  btnGetStarted = findViewById(R.id.btn_get_started);
       // btnGetStarted.setOnClickListener(view -> {
        //    Toast.makeText(this, "Comenzar", Toast.LENGTH_SHORT).show();
      //  });
    }
}