package com.example.toasting_appclency

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //instantiate - giving it a name as a variable
    private lateinit var display_text:TextView
    private lateinit var edt_input_data:EditText
    private lateinit var submitbutton:Button
    private lateinit var buttontwo:Button
    private lateinit var btnclickhere:Button



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.txtdisplay)
        edt_input_data = findViewById(R.id.edtdata)
        submitbutton = findViewById(R.id.btnsubmit)
        buttontwo = findViewById(R.id.btnsecond)
        btnclickhere = findViewById(R.id.btnclick)

        btnclickhere.setOnClickListener {
            Toast.makeText(this, "Click to go to AI", Toast.LENGTH_SHORT).show()
        }

        buttontwo.setOnClickListener {
            Toast.makeText(this, "Clicked the second button", Toast.LENGTH_SHORT).show()
        }

        submitbutton.setOnClickListener {
            //grab info from edittext
            var user_data = edt_input_data.text.toString().trim()
            Toast.makeText(this, user_data, Toast.LENGTH_SHORT).show()

            Toast.makeText(this, "My first toast application", Toast.LENGTH_SHORT).show()
        }


    }
}