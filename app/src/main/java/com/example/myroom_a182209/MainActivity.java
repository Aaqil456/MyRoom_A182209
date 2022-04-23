package com.example.myroom_a182209;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnSave,btnUpdate;
    EditText etBrand,etPrice;
    TextView tvLaptopID;
    ListView lvLaptop;

    ArrayAdapter<String> laptopListAdapter;
    ArrayList<String> laptopArray;
    ArrayList<Integer>laptopID;

    public static  MyLaptopDB myLaptopDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave=findViewById(R.id.btnSave);
        btnUpdate=findViewById(R.id.btnUpdate);
        etBrand=findViewById(R.id.et_brand);
        etPrice=findViewById(R.id.et_price);
        tvLaptopID=findViewById(R.id.tv_laptop_id);
        lvLaptop=findViewById(R.id.lv_main);

        laptopListAdapter=new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1);
        laptopArray=new ArrayList<String>();
        laptopID=new ArrayList<Integer>();

        myLaptopDB= Room.databaseBuilder(MainActivity.this,MyLaptopDB.class,"laptopDB").build();

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextIsEmpty();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextIsEmpty();
            }
        });

    }

    public void saveLaptop(){

    }

    public void updateLaptop(){

    }

    public void deleteLaptop(){

    }

    public void getAllLaptop(){

    }

    public void showDataInListView(){

    }

    private Boolean editTextIsEmpty(){
        if(TextUtils.isEmpty(etBrand.getText().toString())){
            etBrand.setError("Brand cannot be empty");
        }
        if(TextUtils.isEmpty(etPrice.getText().toString())){
            etPrice.setError("Price cannot be empty");
        }
        if(TextUtils.isEmpty(etBrand.getText().toString())||TextUtils.isEmpty(etPrice.getText().toString())){
            return true;
        }
        else{return false;}

    }

}