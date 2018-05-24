package edu.uni_pr.fiek.memorygame;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Fisnik on 5/19/2018.
 */

public class Database extends SQLiteOpenHelper {
    public  Database(Context context){super(context,"memorygamedb",null,1);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table highScore"+
        "(playerName varchar(30), score integer, level varchar (30))");
        db.execSQL("insert into highScore(playerName,score,level)" +
        "values ('Kaladuciii', 1 ,'Hard')");
        //Shtes
        db.execSQL("create table emri"+"(emri varchar(30))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
