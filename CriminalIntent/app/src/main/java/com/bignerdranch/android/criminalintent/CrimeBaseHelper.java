package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.bignerdranch.android.criminalintent.database.CrimeDbSchema;

/**
 * Created by bvz on 11/4/15.
 */
/* This class checks to see if db exists
 *  if not creates tables and initial data
 *  if does open and checks version
 *  updates old version
 */
public class CrimeBaseHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "crimeBase.db";

    public CrimeBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + CrimeDbSchema.CrimeTable.NAME + "(" +
                    "_id integer primary key autoincrement, " +
                CrimeDbSchema.CrimeTable.Cols.UUID + ", " +
                CrimeDbSchema.CrimeTable.Cols.TITLE + ", " +
                CrimeDbSchema.CrimeTable.Cols.DATE + ", " +
                CrimeDbSchema.CrimeTable.Cols.SOLVED +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
