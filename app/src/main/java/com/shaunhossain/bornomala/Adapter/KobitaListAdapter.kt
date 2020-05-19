package com.shaunhossain.bornomala.Adapter

import android.media.MediaPlayer
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.bornomala.R
import com.shaunhossain.bornomala.ViewModel.KobitaListViewModel
import com.shaunhossain.bornomala.ViewModel.SorbornoViewModel

class KobitaListAdapter(private val modelKobita: ArrayList<KobitaListViewModel>, var itemClickListener: OnItemClickListener): RecyclerView.Adapter<KobitaListAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_recycle_view,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return modelKobita.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(modelKobita[position],itemClickListener)
    }

    inner class ViewPagerHolder( view: View): RecyclerView.ViewHolder(view) {
        private val kobitaImageView = view.findViewById<ImageView>(R.id.kobita_image_view)
        private val kobitaName = view.findViewById<TextView>(R.id.kobita_name)
        private val kobiName = view.findViewById<TextView>(R.id.kobi_name)

        fun bind (modelKobitaList: KobitaListViewModel, itemReferance: OnItemClickListener){
            kobitaImageView.setImageResource(modelKobitaList.relatedImage!!)
            kobitaName.text = modelKobitaList.kobitaName
            kobiName.text = modelKobitaList.kobiName

            itemView.setOnClickListener{
                itemReferance.onItemClick(modelKobitaList,adapterPosition)
            }

        }
    }

    interface OnItemClickListener{
        fun onItemClick(modelKobitaList: KobitaListViewModel, position: Int)
    }
}