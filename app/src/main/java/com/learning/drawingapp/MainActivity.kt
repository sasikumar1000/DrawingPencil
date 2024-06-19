package com.learning.drawingapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var drawingView: DrawingView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawingView = findViewById(R.id.drawing_view)
        val btnBrush: Button = findViewById(R.id.btn_brush)
        val btnEraser: Button = findViewById(R.id.btn_eraser)
        val btnClear: Button = findViewById(R.id.btn_clear)

        btnBrush.setOnClickListener {
            drawingView.enableEraser(false)
            drawingView.setBrushSize(10f)
            drawingView.setColor(Color.BLACK)
        }

        btnEraser.setOnClickListener {
            drawingView.enableEraser(true)
            drawingView.setBrushSize(40f) // Make the eraser a bit larger
        }

        btnClear.setOnClickListener {
            drawingView.clearCanvas()
        }
    }
}



