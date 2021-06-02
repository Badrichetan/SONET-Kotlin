package com.example.kotlindemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var input1 = findViewById<EditText>(R.id.ed1_4)
        var input2 = findViewById<EditText>(R.id.ed2_4)
        var sp = findViewById<Spinner>(R.id.spinner_4)
        var btn = findViewById<Button>(R.id.btn_4)
        var result = findViewById<TextView>(R.id.tv_4)

        btn.setOnClickListener(View.OnClickListener {
            var a:Float=input1.text.toString().toFloat()
            var b:Float=input2.text.toString().toFloat()
            var s=sp.selectedItem.toString()
            when(s){
                "+"-> result.setText("result: "+ add(a,b))
                "-"-> result.setText("result: "+ sub(a,b))
                "*"-> result.setText("result: "+ mul(a,b))
                "/"-> result.setText("result: "+ div(a,b))
            }
        })

    }
}
fun add(a:Float,b:Float):Float = a+b

fun sub(a:Float,b:Float):Float = a-b

fun mul(a:Float,b:Float):Float = a*b

fun div(a:Float,b:Float):Float = a/b