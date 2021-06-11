package com.example.kotlindemo

class Person(var name:String, var weightLbs:Double) {
    init{
        print("Test")
    }
    init{
        println("Test1")
    }
    //Secodary constructor
    constructor(name:String): this("",0.0 ){
        println("Hello")
    }

    var weightKilo:Double
        get() = weightLbs/2.0
        set(value) {
            weightLbs =  value*2.0
        }

    fun eatSweet(addIcescream:Boolean){
        weightLbs += if(addIcescream) 4.0 else 2.0
    }

    fun calGoal(weightToLoos:Double):Double{
        return weightLbs - weightToLoos
    }
}