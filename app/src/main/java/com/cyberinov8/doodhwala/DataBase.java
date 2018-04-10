package com.cyberinov8.doodhwala;

import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
@Database(entities = { Customer.class }, version = 2)
public  abstract  class DataBase extends RoomDatabase {
    private static final String DB_NAME = "doodhwala.db";
    private static volatile DataBase instance;

    static  synchronized DataBase getInstance(Context context){
           if (instance == null){
               instance = create(context);
           }
           return instance;
    }
   private static DataBase create(final Context  context){
        return Room.databaseBuilder(context,DataBase.class,DB_NAME).allowMainThreadQueries().fallbackToDestructiveMigration().build();
   }
  public abstract CustomerDao getCustomerDao();

}
