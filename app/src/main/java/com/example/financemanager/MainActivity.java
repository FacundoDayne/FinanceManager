package com.example.financemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ViewPreviousButton;
    Button AddNewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPreviousButton = (Button)findViewById(R.id.ViewPreviousButton);
        AddNewButton = (Button)findViewById(R.id.AddNewButton);
    }

    public void ViewPrevious(View view){
        Intent intent = new Intent(this, ViewPrevious.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Now Viewing Previous Revenues and Expenses", Toast.LENGTH_SHORT).show();
    }

    public void AddNew(View view){
        Intent intent = new Intent(this, AddNew.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(),"Now Adding New Revenues and Expenses", Toast.LENGTH_SHORT).show();
    }
}