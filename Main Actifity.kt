package com.example.ailindaaplikasi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        // inisialisasi komponen
        val edname = findViewById<EditText>(R.id.ed_name)
        val edLahir = findViewById<EditText>(R.id.ed_Ttl)
        val edbuttonTTL = findViewById<Button>(R.id.btnThn)
        val text = findViewById<TextView>(R.id.textView)

        edbuttonTTL.setOnClickListener {
            val input = edname.text.toString()
            val masukan = edLahir.text.toString()
            val generasi = try {
                when (masukan.toInt()) {
                    in 1981..1999 -> "Milenial"
                    in 2000..2010 -> "Z"
                    else -> "Tidak ada dalam kamus wukwukwuk"
                }
            } catch (e: NumberFormatException) {
                "Tahun lahir tidak valid"
            }

            text.text = "Kamu generasi: $generasi"
        }

    }
}
