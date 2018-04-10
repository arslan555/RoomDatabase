package com.cyberinov8.doodhwala;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface CustomerDao {
    @Query("select * from customer")
    List<Customer> getAllCustomer();

    @Insert
    void inseret(Customer... customer);

    @Update
    void update(Customer... customers);

    @Delete
    void delete(Customer... customers);

    @Query("select * from customer where id=:id")
    Customer getCustomer(int id);

    @Query("select * from customer where name=:name")
    Customer getCustomersByName(String name);

}
