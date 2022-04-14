package com.example.intentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DataParcellableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_parcellabnle)

        val viewData: TextView = findViewById(R.id.textView)

        val person = intent.getParcelableExtra<Person>(OBJECT_PERSON) as Person
        val text = "Name : ${person.nama.toString()}, \nUmur : ${person.umur}, \nEmail : ${person.email}, \nDomisili : ${person.domisili}, \nStatus : ${person.statusMenikah}"
        viewData.text = text
    }

    companion object {
        const val OBJECT_PERSON = "object_person"
    }
}