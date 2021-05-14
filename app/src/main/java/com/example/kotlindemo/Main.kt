package com.example.kotlindemo

fun  main(){
    var n = 11
    var res:String = if(n>10)"hello" else "world"

    res = when(n)
    {
        11 ->{
            "hello\n"+
            "abc"
        }
        in 2..10 -> "World"
        11,12,13 -> "Test"
        else -> "no data"
    }

    print(res)

}