package com.shaunhossain.bornomala.Adapter

import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.bornomala.R
import com.shaunhossain.bornomala.ViewModel.BanjonbornoViewModel
import com.shaunhossain.bornomala.ViewModel.KobitaListViewModel
import com.shaunhossain.bornomala.ViewModel.MainViewModel

class MainFramgentViewAdapter (private val model: ArrayList<MainViewModel>, var itemClickListener: MainFramgentViewAdapter.OnItemClickListener): RecyclerView.Adapter<MainFramgentViewAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_main_view,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return model.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(model[position],itemClickListener)
    }

    inner class ViewPagerHolder( view: View): RecyclerView.ViewHolder(view) {
        private val kobitaImage = view.findViewById<ImageView>(R.id.kobita_view)
        private val kobitaName = view.findViewById<TextView>(R.id.kobita_name)

        fun bind (model: MainViewModel, itemReferance: MainFramgentViewAdapter.OnItemClickListener){
            kobitaImage.setImageResource(model.relatedImage!!)
            kobitaName.text = model.description

            itemView.setOnClickListener{
                itemReferance.onItemClick(model,adapterPosition)
            }
        }

    }
    interface OnItemClickListener{
        fun onItemClick(model: MainViewModel, position: Int)
    }

}