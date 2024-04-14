package com.techmania.bookshala

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.techmania.bookshala.databinding.ActivityMainBinding
import com.techmania.bookshala.databinding.LayoutHomeBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val activity = this
    val list:ArrayList<BooksModel> = ArrayList()
    val adapter = BooksAdapter(list, activity)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            mRecylerViewHo.adapter = adapter
            list.add(BooksModel(R.drawable.book_1,"Rich Dad Poor Dad",getString(R.string.description_1),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_2,"Atomic Habits",getString(R.string.description_2),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_3,"Best Self",getString(R.string.description_3),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_4,"How To Be Fine",getString(R.string.description_4),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_5,"Out of the Box",getString(R.string.description_5),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_6,"Stripped",getString(R.string.description_6),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_7,"12 Rules for Life",getString(R.string.description_7),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_8,"Readistan",getString(R.string.description_8),"mini_project.pdf"))
            list.add(BooksModel(R.drawable.book_9,"Reclaim Your Heart",getString(R.string.description_9),"mini_project.pdf"))


        }
    }
}