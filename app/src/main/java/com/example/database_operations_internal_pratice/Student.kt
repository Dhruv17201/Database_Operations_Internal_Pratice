package com.example.database_operations_internal_pratice

class Student (var fname:String , var lname:String , var age:Int){

     var id:Int = 0
    constructor(id:Int, fname: String, lname: String ,age: Int):this(fname,lname,age){
        this.id = id
    }
}