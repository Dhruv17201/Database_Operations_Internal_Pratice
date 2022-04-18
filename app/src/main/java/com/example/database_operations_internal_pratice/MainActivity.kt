package com.example.database_operations_internal_pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var firstname:EditText = findViewById(R.id.fname)
        var lastname:EditText = findViewById(R.id.lname)
        var Age:EditText = findViewById(R.id.age)
        var insert:Button = findViewById(R.id.insertbtn)

        var convfname  = firstname.text.toString()
        var convlname  = lastname.text.toString()
        var convage  = Age.text.toString().toInt()

        var stud = Student(convfname,convlname,convage)
        var dbhelper = DBHepler(this)
        var check = dbhelper.insertdata(stud)
        if(check)
        {
            Toast.makeText(applicationContext, "Inserted Data Successfully", Toast.LENGTH_SHORT).show()
        }
        else
        {
            Toast.makeText(applicationContext, "Inserted Data Unsuccessfully", Toast.LENGTH_SHORT).show()
        }
    }
}