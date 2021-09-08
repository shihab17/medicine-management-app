package com.example.medicinemanagement;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Medicine.db";
    private static final String ID = "_userID";
    private static final String FIRST_NAME = "_firstName";
    private static final String LAST_NAME = "_lastName";
    private static final String USERNAME = "_username";
    private static final String EMAIL = "_email";
    private static final String PASSWORD = "_password";
    private static final String TABLE_USERINFO = "tbl_user";
    private static final int VERSION_NUMBER = 1;
    private Context context;

    public MyDatabase(@Nullable Context context) {
        super(context, DATABASE_NAME, null, VERSION_NUMBER);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        try {
            Toast.makeText(context, "OnCreate is called: ", Toast.LENGTH_SHORT).show();
            sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_USERINFO + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + FIRST_NAME + " VARCHAR (255), " + LAST_NAME + " VARCHAR (255), " + USERNAME + " VARCHAR(255), " + EMAIL + " VARCHAR(255)," + PASSWORD + " VARCHAR(255)) ");

        } catch (Exception e) {
            Toast.makeText(context, "Exception: " + e, Toast.LENGTH_LONG).show();

        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        try {
            Toast.makeText(context, "onUpgrade is called: ", Toast.LENGTH_SHORT).show();
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_USERINFO + "");
            onCreate(sqLiteDatabase);
        } catch (Exception e) {
            Toast.makeText(context, "Exception: " + e, Toast.LENGTH_SHORT).show();
        }
    }
}




