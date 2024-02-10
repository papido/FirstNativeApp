package edu.my.utem.ftmk.firstnativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import edu.my.utem.ftmk.firstnativeapp.databinding.ActivityFirstBinding;

public class FirstActivity extends AppCompatActivity {
    ActivityFirstBinding binding;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnGreet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String strFname = binding.edtFullName.getText().toString();
                String strPrograme = binding.edtProgramme.getText().toString();
                String strYear = binding.edtYearBirth.getText().toString();
                Toast.makeText(getApplicationContext(),
                        "Welcome " + strFname + " to mobile class of " + strPrograme,
                        Toast.LENGTH_LONG).show();
            }
        });
    }}