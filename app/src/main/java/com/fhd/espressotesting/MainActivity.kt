package com.fhd.espressotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    private var btnChange: Button? = null

    private var etTextToChange: EditText? = null

    private var tvChangedText: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnChange = findViewById(R.id.btnChange) as Button

        etTextToChange = findViewById(R.id.etTextToChange) as EditText

        tvChangedText = findViewById(R.id.tvChangedText) as TextView

        btnChange!!.setOnClickListener { tvChangedText!!.text = etTextToChange!!.text }


    }
}
