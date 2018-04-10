package com.cyberinov8.doodhwala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Customer> customer = new ArrayList<Customer>();
        for (int i =0 ; i< 10 ; i++){
            Customer customer1 = new Customer("Arslan","abc","234234324",243423424);
            DataBase.getInstance(this).getCustomerDao().inseret(customer1);
        }
        customer = DataBase.getInstance(this).getCustomerDao().getAllCustomer();




    }
}
