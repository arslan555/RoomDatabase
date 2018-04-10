package com.cyberinov8.doodhwala;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
@Entity
public class Customer {

    @PrimaryKey(autoGenerate = true)
    private   int id ;
    private   String name;
    private String address;
    private String cnic;
    private int contactNumber;
    public Customer( String name, String address, String cnic, int contactNumber) {

        this.name = name;
        this.address = address;
        this.cnic = cnic;
        this.contactNumber = contactNumber;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCnic() {
        return cnic;
    }

    public int getContactNumber() {
        return contactNumber;
    }
}
