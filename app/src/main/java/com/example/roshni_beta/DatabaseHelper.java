package com.example.roshni_beta;





import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="user";
    public static final String COL_1="c_id";
    public static final String COL_2="username";
    public static final String COL_3="password";
    public static final String COL_5="age";
    public static final String COL_4="gender";
    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table user(c_id integer primary key autoincrement,username text,password text,age integer,gender text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public long add_user(String username,String password,String age,String gender){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        contentValues.put("age",age);
        contentValues.put("gender",gender);
        long res = db.insert("user",null,contentValues);
        db.close();
        return res;
    }

    public boolean check_user(String username,String password){

        String columns[]={COL_1};
        SQLiteDatabase db=getReadableDatabase();
        String selection=COL_2+"=?"+" and "+COL_3+"=?";
        String selectionargs[]={username,password};
        Cursor cursor=db.query(TABLE_NAME,columns,selection,selectionargs,null,null,null);
        int count=cursor.getCount();
        cursor.close();
        db.close();
        if(count>0)
            return true;

        else
            return false;
    }

    public Cursor retrieve_data(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor cursor=db.rawQuery("select * from "+TABLE_NAME,null);
        return cursor;
    }
}

