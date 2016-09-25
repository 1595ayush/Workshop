package com.example.vaibhavi.first_application;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Vaibhavi on 25-09-2016.
 */
public class Database {
    private static final int DATABASE_VERSION = 2;
    private static final String CREATE_TABLE_USERS = "create table if not " +
            "exists user_table(id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "name text not null,age text not null)";
    private static String DATABASE_NAME = "users";
    private SQLiteDatabase db;

    public Database(Context context) {
        MySqliteHelper helper = new MySqliteHelper(context);
        db = helper.getWritableDatabase();
    }

    class MySqliteHelper extends SQLiteOpenHelper {

        public MySqliteHelper(Context context) {
            super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE_TABLE_USERS);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }
    }
}