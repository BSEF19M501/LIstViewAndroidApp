package com.example.kidslearningapp;

import static android.content.Intent.ACTION_VIEW;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGitHub(View view) {
        Uri webpage = Uri.parse("https://github.com/bsef19m501");
        Intent intent = new Intent(ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void startLearning(View view) {
        Intent intent = new Intent(this, MainActivityLearn.class);
        startActivity(intent);
    }

    public void takeTest(View view) {
        Intent intent = new Intent(this, MainActivityTest.class);
        startActivity(intent);
    }
}