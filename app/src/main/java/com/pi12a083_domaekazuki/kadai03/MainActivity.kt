package com.pi12a083_domaekazuki.kadai03

import android.media.Image
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // 画像の配列
    // listは読み取り専用
    // Arrayは書き込み可能
    private val imageList = listOf(
        R.drawable.dog,
        R.drawable.horse,
        R.drawable.kitten
    )

    private val textList = listOf(
        "aaa",
        "bbb",
        "ccc"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnLeft: ImageButton = findViewById(R.id.btnLef)
        btnLeft.setOnClickListener{
            movePosition(0)
        }

    }
    private fun movePosition(num: Int){
        val textView: TextView = findViewById(R.id.textView)
        val imageView: ImageView = findViewById(R.id.imageView)

        textView.text = textList[0]
        imageView.setImageResource(imageList[0])
    }
}