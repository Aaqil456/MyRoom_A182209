package com.example.myroom_a182209.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.myroom_a182209.entities.Laptop;

import java.util.List;
@Dao
public interface LaptopDao {

    @Insert
    void insertLaptop(Laptop laptop);

    @Update
    void updateLaptop(Laptop laptop);

    @Delete
    void deleteLaptop(Laptop laptop);

    @Query("SELECT * FROM Laptop")
    List<Laptop> getAllLaptop();


}
