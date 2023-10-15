package com.example.ourseproject999

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button = findViewById<Button>(R.id.Button)
        button.setOnClickListener {
            Toast.makeText(this, "ПРИВЕТИКИ!!!", Toast.LENGTH_SHORT).show()
        }

        Toast.makeText(this,"ПРИВЕТ МИР!!!",Toast.LENGTH_LONG).show()


        val button2 = findViewById<Button>(R.id.Button2)
        button2.setOnClickListener {
            Toast.makeText(this, "ПОКАШЕЧКИ!!!", Toast.LENGTH_SHORT).show()
        }




        val button3 = findViewById<Button>(R.id.Button3)
        val bannerTextView = findViewById<TextView>(R.id.Banner)

        button3.setOnClickListener {
            bannerTextView.text = "ЗДРАСТВУЙ МИР!!"
        }



        val button4 = findViewById<Button>(R.id.Button4)
        val banner2TextView = findViewById<TextView>(R.id.Banner)

        button4.setOnClickListener {
            bannerTextView.text = " Прощяй МИР!!"
        }

    }


    }