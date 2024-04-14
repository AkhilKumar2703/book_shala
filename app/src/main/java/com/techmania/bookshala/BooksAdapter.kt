package com.techmania.bookshala

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.app.ActivityOptionsCompat
import androidx.recyclerview.widget.RecyclerView
import com.techmania.bookshala.databinding.ActivityDetailBinding
import com.techmania.bookshala.databinding.LayoutHomeBinding

class BooksAdapter(val list:ArrayList<BooksModel>,val context: Context):RecyclerView.Adapter<BooksAdapter.ViewHolder>() {
    class ViewHolder ( val binding: LayoutHomeBinding):RecyclerView.ViewHolder(binding.root)



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutHomeBinding.inflate(LayoutInflater.from(context),parent,false))
    }

    override fun getItemCount()=list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list[position]
        holder.binding.apply {
            imageView.setImageResource(model.image)
            cardView.setOnClickListener{
                val intent = Intent()
                intent.putExtra("book_title", model.title)
                intent.putExtra("book_desc", model.description)
                intent.putExtra("book_pdf", model.bookPdf)
                intent.putExtra("book_image", model.image)
                intent.setClass(context,DetailActivity::class.java)
                val option  =ActivityOptionsCompat.makeSceneTransitionAnimation(context as Activity,imageView,"BookTrans")
                context.startActivity(intent,option.toBundle())
            }
        }
    }
}