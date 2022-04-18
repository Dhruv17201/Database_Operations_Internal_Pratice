package com.example.database_operations_internal_pratice

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.SyncStateContract.Helpers.insert


class DBHepler(context: Context):SQLiteOpenHelper(context, DBNAME,null, DBVERSION){
    companion object{
        private var DBNAME="Mydatabase"
        private var TBNAME="Mytable"
        private var DBVERSION=1
        private var FNAME="fname"
        private var LNAME="lname"
        private var AGE="age"
        private var ID="id"
    }

    override fun onCreate(p0: SQLiteDatabase?) {
        TODO("Not yet implemented")
        var query = "CREATE TABLE $TBNAME $ID INTEGER AUTOINCREMENT PRIMARY KEY , $FNAME VARCHAR , $LNAME VARCHAR , $AGE INTEGER"
        p0?.execSQL(query)

    }


    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")

    }

    fun insertdata(stud:Student):Boolean {
     var db = writableDatabase
        var cv = ContentValues()
        cv.put(ID,stud.id)
        cv.put(FNAME,stud.fname)
        cv.put(LNAME,stud.lname)
        cv.put(AGE,stud.age)

        var result = db.insert(TBNAME,null,cv)
        if(result > 0)
        {
            return true
        }
        else
        {
            return false
        }
    }
}
