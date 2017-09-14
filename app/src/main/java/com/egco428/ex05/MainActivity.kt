package com.egco428.ex05

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitBtn.setOnClickListener{
//            val y = inputText.text.toString().toInt()
//            val x = 20
//            when(y % 2){
//                0 -> {
//                    Log.d("Result","x == $x")
//                    resultLabel.text = "Even Number"
//                }
//                else ->{
//                    Log.d("Result","x != $x")
//                    resultLabel.text = "Odd Number"
//                }
//            }

//            val items = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
//            for(index in items.indices)
//                Log.d("Debug","index : $index : ${items[index]}")

//            for((index, value) in items.withIndex())
//                Log.d("Debug","index: $index = $value")

            //for(i in 1..10) //1-10
            //for(i in 10 downTo 1 step 2) //10 8 6 4 2
//            for(i in 1 until 10) //1-9
//            Log.d("loop","i = $i")

            //val numbers = listOf(1,2,3,4,5)
//            val numbers = mutableListOf<Int>(1,2,3,4,5)
//            for(i in numbers)
//                Log.d("Number","$i")
//            numbers.add(6)
//            for(i in numbers)
//                Log.d("After Number","$i")
//
//            Log.d("First Number",numbers.first().toString())
//            Log.d("Last Number",numbers.last().toString())
//            Log.d("Odd Number",numbers.filter { it%2 != 0 }.toString())

//            val noDuplicate = hashSetOf<String>("a","b","c","c","d")
//            for(item in noDuplicate.toSortedSet())
//                Log.d("Item",item)

            val myHashMap = hashMapOf<String,Int>("First" to 1,"Second" to 2)
            Log.d("Item",myHashMap["First"].toString())
            Log.d("Item",myHashMap["Second"].toString())
        }
    }
}
