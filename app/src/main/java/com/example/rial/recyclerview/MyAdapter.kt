package com.example.rial.recyclerview
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rial.CardRenda
import com.example.rial.R

class MyAdapter(private val itemList: List<CardRenda>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
        
    // ViewHolder class
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView: TextView = itemView.findViewById(R.id.tituloText)
        val imageView: ImageView = itemView.findViewById(R.id.imageCard)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fonte_renda_card, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val cardRenda = itemList.get(position);
        holder.textView.setText(cardRenda.titulo)
        holder.imageView.setImageDrawable(cardRenda.image)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}