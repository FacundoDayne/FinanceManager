package com.example.financemanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.widget.ArrayAdapter;
import android.widget.CalendarView;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.text.DateFormatSymbols;

public class ViewPrevious extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_previous);

        ListView list = (ListView) findViewById(R.id.lsv_expensesList);

        ArrayList<String> temp_list = new ArrayList<String>();
        temp_list.add("Item 1");
        temp_list.add("Item 2");
        temp_list.add("Item 3");
        temp_list.add("Item 4");
        temp_list.add("Item 5");
        temp_list.add("Item 6");
        temp_list.add("Item 7");
        temp_list.add("Item 8");
        temp_list.add("Item 9");
        temp_list.add("Item 10");
        temp_list.add("Item 11");
        temp_list.add("Item 12");
        temp_list.add("Item 13");

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.activity_listview, temp_list);
        list.setAdapter(adapter);

        CalendarView calendar = (CalendarView) findViewById(R.id.calendarView2);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                TextView txv_date = (TextView) findViewById(R.id.txv_date);

                String date_temp = String.valueOf(dayOfMonth) + " " + new DateFormatSymbols().getMonths()[month] + " " + String.valueOf(year);

                txv_date.setText(String.valueOf(date_temp));
            }
        });

    }
}