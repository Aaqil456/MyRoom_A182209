package com.example.myroom_a182209;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSave,btnUpdate;
    EditText etBrand,etPrice;
    TextView tvLaptopID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave=findViewById(R.id.btnSave);
        btnUpdate=findViewById(R.id.btnUpdate);
        etBrand=findViewById(R.id.et_brand);
        etPrice=findViewById(R.id.et_price);
        tvLaptopID=findViewById(R.id.tv_laptop_id);
    }
}