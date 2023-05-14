package com.example.financemanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button ViewPreviousButton;
    Button AddNewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPreviousButton = (Button)findViewById(R.id.btn_ViewExpenses);
        AddNewButton = (Button)findViewById(R.id.btn_AddExpenses);

        ConstraintLayout mainlayout = (ConstraintLayout) findViewById(R.id.Layout_mainactivity_parent);

        TextView txv_balance = (TextView) findViewById(R.id.txv_balance);
        TextView txv_spent = (TextView) findViewById(R.id.txv_expenses_peek);
        TextView txv_total = (TextView) findViewById(R.id.txv_totalmoney);

        String str_spent = txv_spent.getText().toString();
        String str_total = txv_total.getText().toString();

        if (str_spent.length() >= 9)
        {
            txv_spent.setText(str_spent.substring(0, str_spent.length() - 7) + "K");
        }
        if (str_total.length() >= 9)
        {
            txv_total.setText(str_total.substring(0, str_total.length() - 7) + "K");
        }

        PieChart pie_expenses = (PieChart) findViewById(R.id.pie_expensesCategories);
        PieData piedata_expenses = new PieData(getExpensesCategories());
        pie_expenses.setData(piedata_expenses);


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

    public PieDataSet getExpensesCategories()
    {
        List<PieEntry> entries = new ArrayList<PieEntry>();

        entries.add(new PieEntry(40.0f, "Transport"));
        entries.add(new PieEntry(45.0f, "Food"));
        entries.add(new PieEntry(15.0f, "Misc"));

        PieDataSet dataset = new PieDataSet(entries, "Expenses Categories");
        dataset.setColors(ColorTemplate.COLORFUL_COLORS);
        return dataset;
    }
}