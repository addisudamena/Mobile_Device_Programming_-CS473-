package com.miu.aalemu.assignment_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val version = editTextVersion.text.toString().trim();
            val codeName = editTextCodeName.text.toString().trim();

            if(version=="" || codeName=="")
                Toast.makeText(this, "Please fill all the inputs first", Toast.LENGTH_SHORT).show()
            else{

                val newRow = TableRow(this)
                val newText1 = TextView(this)
                val newText2 = TextView(this)

                newText1.text = editTextVersion.text.toString()
                newRow.addView(newText1)
                newText2.text = editTextCodeName.text.toString()
                newRow.addView(newText2, 1)
                tableLayout.addView(newRow)

                editTextVersion.setText("")
                editTextCodeName.setText("")

                Toast.makeText(this, "New version added", Toast.LENGTH_SHORT).show()

            }

        }


    }
}