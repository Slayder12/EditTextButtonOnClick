package com.example.edittextbuttononclick

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var inputText: EditText
    private lateinit var transformButton: Button
    private lateinit var resultText: TextView
    private lateinit var charCountText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.input_text)
        transformButton = findViewById(R.id.transform_button)
        resultText = findViewById(R.id.result_text)
        charCountText = findViewById(R.id.character_count_text)

        onButtonClick(transformButton)
    }

    fun onButtonClick(view: View) {
        val originalText = inputText.text.toString()
            val reversedText = originalText.reversed()
            val charCount = originalText.replace(" ", "").length

            resultText.text = reversedText
            charCountText.text = "Количество символов: $charCount"
    }
}