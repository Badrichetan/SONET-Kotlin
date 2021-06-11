package com.example.kotlindemo

class Person constructor(name:String, zz:Double){

    val name:String = name
    var weightlbs:Double = zz

    var weightKilo:Double
    get() = weightlbs/2.0
    set(value){
        weightlbs = value+2.0
    }

}