package com.example.serene

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DATA
        val tvDate = findViewById<TextView>(R.id.tvDate)
        val dateFormat = SimpleDateFormat("EEEE · d 'de' MMMM", Locale("pt", "BR"))
        tvDate.text = dateFormat.format(Date())

        // BOTÃO
        val btnRegister = findViewById<Button>(R.id.button_subregister)
        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

//        // PROGRESS BARS
//        val progressCalculus = findViewById<ProgressBar>(R.id.progressCalculus)
//        val progressPhysics = findViewById<ProgressBar>(R.id.progressPhysics)
//        val progressAlgebra = findViewById<ProgressBar>(R.id.progressAlgebra)
//
//        // aplica cor dinâmica
//        applyColorToProgressBar(progressCalculus, progressCalculus.progress)
//        applyColorToProgressBar(progressPhysics, progressPhysics.progress)
//        applyColorToProgressBar(progressAlgebra, progressAlgebra.progress)
//    }

//    // DEFINE COR BASEADO NO PROGRESSO
//    fun getProgressColor(progress: Int): Int {
//        return when {
//            progress < 50 -> Color.parseColor("#6FD97A")   // verde
//            progress < 100 -> Color.parseColor("#48C8F0")  // azul
//            else -> Color.parseColor("#B888F0")            // roxo
//        }
//    }

//    // APLICA COR NA BARRA
//    fun applyColorToProgressBar(progressBar: ProgressBar, progress: Int) {
//        val color = getProgressColor(progress)
//
//        val drawable = progressBar.progressDrawable.mutate()
//        val progressLayer = drawable.findDrawableByLayerId(android.R.id.progress)
//
//        if (progressLayer is LayerDrawable) {
//            val shape = progressLayer.getDrawable(0)
//            if (shape is GradientDrawable) {
//                shape.setColor(color)
//            }
//        }
//    }
    }
}