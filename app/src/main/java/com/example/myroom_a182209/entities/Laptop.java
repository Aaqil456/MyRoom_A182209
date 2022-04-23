package com.example.myroom_a182209.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "laptop")
public class Laptop {
    @NonNull @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "laptop_id")
    int laptopID;

    @NonNull
    @ColumnInfo(name = "laptop_brand")
    String laptopBrand;

    @NonNull
    @ColumnInfo(name = "laptop_price")
    float laptopPrice;

    public Laptop(int laptopID, @NonNull String laptopBrand, float laptopPrice) {
        this.laptopID = laptopID;
        this.laptopBrand = laptopBrand;
        this.laptopPrice = laptopPrice;
    }

    public Laptop() {
    }

    public int getLaptopID() {
        return laptopID;
    }

    public void setLaptopID(int laptopID) {
        this.laptopID = laptopID;
    }

    @NonNull
    public String getLaptopBrand() {
        return laptopBrand;
    }

    public void setLaptopBrand(@NonNull String laptopBrand) {
        this.laptopBrand = laptopBrand;
    }

    public float getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(float laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
}
