package com.example.kotlindemo

fun main(){
    var bicycle:Bicycle = Bicycle()
    bicycle.brandName = "Hero"
    bicycle.modelYear = 1896
    println("${bicycle.brandName} -> ${bicycle.modelYear}")
}