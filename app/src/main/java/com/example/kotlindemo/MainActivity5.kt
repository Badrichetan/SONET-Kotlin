package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        
        var btn = findViewById<Button>(R.id.btn_5)
        var temp = findViewById<EditText>(R.id.ed1_5)
        var dirt = findViewById<EditText>(R.id.ed2_5)
        var DAY = findViewById<TextView>(R.id.tv1_5)
        var FOOD = findViewById<TextView>(R.id.tv2_5)
        var Change = findViewById<TextView>(R.id.tv3_5)

        btn.setOnClickListener(View.OnClickListener {

            var temp = temp.text.toString().toInt()
            var dirt = dirt.text.toString().toInt()
            var p:Int = temp.toInt()
            var o:Int = dirt.toInt()

            var x:String=randomDay()
            var y:String=fishFood(x)
            var z:Boolean=changeWaterOrNot(x,p,o)
            DAY.text = "today is ${x.toString()}"
            FOOD.text="feed to fishes is :- $y"

            if(z==true) {
                Change.text = "Need to change water"
            }
            else
            {
                Change.text = "No need to change water"
            }

        })

    }
}
fun randomDay():String{
    var day:String=""
    var arr= arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    day = arr[Random().nextInt(arr.size)]
    return day
}



fun fishFood(day:String):String{
    var food:String = ""
    when(day){
        "Monday" -> food = "flakes"
        "Tuesday" -> food ="Pellets"
        "Wednesday" -> food = "redworms"
        "Thursday" -> food = "granules"
        "Friday" -> food = "mosqutioes"
        "Saturday" -> food = "lettuce"
        "Sunday" -> food = "plankton"
    }
    return food
}

fun isHot(temp:Int) = temp > 30
fun isDirt(dirt :Int)= dirt>30
fun isSunday(day:String) = day == "Sunday"

fun changeWaterOrNot(x:String, temp:Int, dirt:Int):Boolean
{
    if(x=="Sunday")
        return true
    if(temp>30)
        return true
    if(dirt>30)
        return true
    else
        return false
}
