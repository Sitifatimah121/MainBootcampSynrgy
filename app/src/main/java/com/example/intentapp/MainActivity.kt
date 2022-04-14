package com.example.intentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnForParcellable: Button = findViewById(R.id.button)
        btnForParcellable.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        when (p0.id) {
            R.id.button -> {
                val person = Person(
                    "Parcel",
                    5,
                    "parcelable@gmail.com",
                    "Malang",
                    false
                )

                val moveActivity = Intent(this@MainActivity, DataParcellableActivity::class.java)
                moveActivity.putExtra(DataParcellableActivity.OBJECT_PERSON, person)
                startActivity(moveActivity)
            }
        }
    }
}



