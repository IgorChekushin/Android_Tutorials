package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.lang.NumberFormatException


fun CheckNumber(src: String?) : Boolean{
    try{
        src.toString().toInt()
    }
    catch (e : NumberFormatException){
    return false
    }
    return true

}
fun CheckIntNumber(src: String?) : Boolean{
    return if(CheckNumber((src))){
        (src.toString().toDouble() - src.toString().toInt()) == 0.0
    } else{
        false
    }
}
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
            if(CheckIntNumber(arg1.text.toString()) and CheckIntNumber(arg2.text.toString()))
            {
                answer.text = (arg1.text.toString().toInt() + arg2.text.toString().toInt()).toString()
            }
            else
            {
                answer.text = "Input Error"
            }
        }
        subtr.setOnClickListener {
            if(CheckIntNumber(arg1.text.toString()) and CheckIntNumber(arg2.text.toString()))
            {
                answer.text = (arg1.text.toString().toInt() - arg2.text.toString().toInt()).toString()
            }
            else
            {
                answer.text = "Input Error"
            }
        }
        mul.setOnClickListener {
            if(CheckIntNumber(arg1.text.toString()) and CheckIntNumber(arg2.text.toString()))
            {
                answer.text = (arg1.text.toString().toInt() * arg2.text.toString().toInt()).toString()
            }
            else
            {
                answer.text = "Input Error"
            }
        }
        divide.setOnClickListener {
            if(CheckIntNumber(arg1.text.toString()) and CheckIntNumber(arg2.text.toString()))
            {
                try {
                    answer.text = (arg1.text.toString().toInt() / arg2.text.toString().toInt()).toString()
                }
                catch (e: ArithmeticException){
                    answer.text = "Div by zero"
                }
            }
            else
            {
                answer.text = "Input Error"
            }
        }
    }
}


