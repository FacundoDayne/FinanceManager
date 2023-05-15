package com.example.financemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.ArraySet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

public class AddNew extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);

        Spinner spn_ItemCategory = (Spinner) findViewById(R.id.spn_ItemCategory);
        List<String> categories = new ArrayList<String>();
        categories.add("Food");
        categories.add("Transportation");
        categories.add("Misc");

        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        spn_ItemCategory.setAdapter(adapt);
        adapt.notifyDataSetChanged();
    }
}