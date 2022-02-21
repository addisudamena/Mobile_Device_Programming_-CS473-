package com.miu.aalemu.assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var menu = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    lateinit var selectedViewer: TextView
    lateinit var newFood: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun choose (v: View){
        selectedViewer = findViewById(R.id.selected_food);
        selectedViewer.text=menu.get(Random.nextInt(menu.size))
    }

    fun add (v: View){
        newFood = findViewById(R.id.new_food)
        val newFoodValue = newFood.text.toString().trim();
        if(newFoodValue == ""){
            Toast.makeText(applicationContext,"The input is empty", Toast.LENGTH_SHORT).show()
        }
        else if (menu.contains(newFoodValue)){
            Toast.makeText(applicationContext,"This food already exists in the menu", Toast.LENGTH_SHORT).show()
        }
        else{
            menu.add(newFoodValue)
            Toast.makeText(applicationContext,"$newFoodValue added", Toast.LENGTH_SHORT).show()
        }
    }
}