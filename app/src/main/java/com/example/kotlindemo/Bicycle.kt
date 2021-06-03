package com.example.kotlindemo

class Bicycle{
    var brandName: String = ""
    //getter
    get(){
        return field
    }
    //setter
    set(value){
        field=value.toUpperCase()
    }
    var modelYear: Int = 0
        get(){
            return field
        }
        set(value){
            if(value>1990){
                field = value
            }
            else{
                println("Model not in production")
            }
        }

    fun display(){
        println("$brandName -> $modelYear")
    }
}