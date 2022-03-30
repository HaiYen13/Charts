package com.yenvth.mycharts;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;
import java.util.Map;

public class LineChartActivity extends AppCompatActivity {
    LineChart lineChart;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart);
        lineChart = findViewById(R.id.lineChart);
        LineDataSet lineDataSet = new LineDataSet(lineChartDataSet(), "data set");
        ArrayList<ILineDataSet> iLineDataSets = new ArrayList<>();
        iLineDataSets.add(lineDataSet);
        LineData lineData = new LineData(iLineDataSets);
        lineChart.setData(lineData);
        lineChart.invalidate();
        //TODO: Set background color
        lineChart.setBackgroundColor(Color.RED);
        //TODO: set text if data are not available
        lineChart.setNoDataText("Data not available");


    }
    private ArrayList<Entry> lineChartDataSet(){
        ArrayList<Entry> dataSet = new ArrayList<Entry>();
        dataSet.add(new Entry(0,10));
        dataSet.add(new Entry(1,40));
        dataSet.add(new Entry(2,6));
        dataSet.add(new Entry(3,4));
        dataSet.add(new Entry(4,35));
        dataSet.add(new Entry(5,16));
        dataSet.add(new Entry(6,15));
        dataSet.add(new Entry(7,9));
        dataSet.add(new Entry(8,5));
        dataSet.add(new Entry(9,30));
        dataSet.add(new Entry(10,20));
        return dataSet;
    }
}
