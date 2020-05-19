package com.shaunhossain.bornomala.Adapter

import android.media.MediaPlayer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.bornomala.R
import com.shaunhossain.bornomala.ViewModel.SorbornoViewModel

class SorbornoCustomAdapter(private val modelSorborno: ArrayList<SorbornoViewModel>): RecyclerView.Adapter<SorbornoCustomAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_sonborno,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return modelSorborno.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(modelSorborno[position])
    }

    inner class ViewPagerHolder( view: View): RecyclerView.ViewHolder(view), View.OnClickListener {
        private val bornoView = view.findViewById<ImageView>(R.id.sorborno_view)
        private val photoView = view.findViewById<ImageView>(R.id.photo_view)
        private val photoName = view.findViewById<TextView>(R.id.photo_name)

         fun bind (modelSorborno: SorbornoViewModel){
            bornoView.setImageResource(modelSorborno.bornoImage!!)
            photoView.setImageResource(modelSorborno.relatedImage!!)
            photoName.text = modelSorborno.description
            bornoView.setOnClickListener(this)
            photoView.setOnClickListener(object : View.OnClickListener{
                override fun onClick(view: View?) {
                    var soundPlay : MediaPlayer? = null
                    when(adapterPosition){
                        0 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_1)
                        1 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_2)
                        2 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_3)
                        3 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_4)
                        4 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_5)
                        5 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_6)
                        6 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_7)
                        7 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_8)
                        8 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_9)
                        9 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_10)
                        10 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_11)

                    }
                    soundPlay!!.start()
                }})
        }

        override fun onClick(view: View?) {

            var soundPlay : MediaPlayer? = null
            when(adapterPosition){
                0 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_1)
                1 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_2)
                2 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_3)
                3 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_4)
                4 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_5)
                5 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_6)
                6 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_7)
                7 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_8)
                8 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_9)
                9 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_10)
                10 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_11)

            }
            soundPlay!!.start()
        }

    }

}