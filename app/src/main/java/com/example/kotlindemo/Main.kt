package com.example.kotlindemo

fun  main(){
    var text:String = "Hello World"
    var i:Int=0;

    for(l in text){
        print("$l, ")
        ++i;
    }
    println("number of letters: $i")



}