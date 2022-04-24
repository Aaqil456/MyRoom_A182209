package com.example.myroom_a182209;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myroom_a182209.entities.Laptop;

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

                if(editTextIsEmpty()){
                    return;
                }
                saveLaptop();
            }
        });

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextIsEmpty()){
                    return;
                }
            }
        });

    }

    public void saveLaptop(){

        new Thread(new Runnable() {
            @Override
            public void run() {
                Laptop laptop = new Laptop(etBrand.getText().toString(),Float.parseFloat(etPrice.getText().toString()));
                myLaptopDB.laptopDao().insertLaptop(laptop);
                toast(getApplicationContext(),"Laptop added");
                getAllLaptop();
            }
        }).start();

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

    public void toast(final Context context, final String text){
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
            }
        });
    }

}