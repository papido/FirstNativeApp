package edu.my.utem.ftmk.firstnativeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.my.utem.ftmk.firstnativeapp.databinding.ActivityStudentBinding;

public class StudentActivity extends AppCompatActivity {

    ActivityStudentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
    }
}