package com.techmania.bookshala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import com.techmania.bookshala.databinding.ActivityDetailBinding
import com.techmania.bookshala.databinding.ActivityPdfBinding

class PdfActivity : AppCompatActivity() {
    val activity = this
    lateinit var binding: ActivityPdfBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfBinding.inflate(layoutInflater)
        this.window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(binding.root)
        supportActionBar?.hide()



        binding.apply {
            val bookPDF = intent.getStringExtra("book_pdf").toString()
            pdfView.fromAsset(bookPDF)
                .swipeHorizontal(true)
                .enableSwipe(true)
                .load()

        }
    }
}