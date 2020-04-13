package com.example.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView city;
    private Button buttonSetCity;
    private TextView textNameSetCity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.city_selection);

        city = findViewById(R.id.City);

        buttonSetCity = findViewById(R.id.buttonSetCity);
        textNameSetCity =findViewById(R.id.editTextNameCity);


        buttonSetCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameCity = textNameSetCity.getText().toString();
                //city.setText(nameCity);
                textNameSetCity.setText("Введен город " + nameCity);
            }
        });
    }

    //для ветки lesson01
}
