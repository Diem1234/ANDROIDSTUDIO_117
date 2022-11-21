package com.example.sqlite_117.Sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper2 extends SQLiteOpenHelper {
    public  static  final String DB_NAME = "Demo7";
    public static final int DB_VERSION = 2;

    public DBHelper2(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql ="CREATE TABLE cayxanh(tenkh text primary key,tentg text not null,dactinh text not null,maula text not null, "+"diemso real not null)";
        sqLiteDatabase.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String sql = "DROP TABLE IF EXISTS cayxanh";
        sqLiteDatabase.execSQL(sql);
        onCreate(sqLiteDatabase);
    }
}
