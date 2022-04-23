package com.example.myroom_a182209;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.myroom_a182209.dao.LaptopDao;
import com.example.myroom_a182209.entities.Laptop;

@Database(entities = {Laptop.class},version = 1)
public abstract class MyLaptopDB extends RoomDatabase {
     public abstract LaptopDao laptopDao();
}
