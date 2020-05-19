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
import com.shaunhossain.bornomala.ViewModel.SorbornoViewModel

class BanjonbornoCustomAdapter (private val model: ArrayList<BanjonbornoViewModel>): RecyclerView.Adapter<BanjonbornoCustomAdapter.ViewPagerHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        return ViewPagerHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_banjonborno,parent,false
            )
        )
    }

    override fun getItemCount(): Int {
        return model.size
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        holder.bind(model[position])
    }

    inner class ViewPagerHolder( view: View): RecyclerView.ViewHolder(view), View.OnClickListener {
        private val bornoView = view.findViewById<ImageView>(R.id.banjonborno_view)
        private val photoView = view.findViewById<ImageView>(R.id.photo_view)
        private val photoName = view.findViewById<TextView>(R.id.photo_name)

        fun bind (model: BanjonbornoViewModel){
            bornoView.setImageResource(model.bornoImage!!)
            photoView.setImageResource(model.relatedImage!!)
            photoName.text = model.description
            bornoView.setOnClickListener(this)
            photoView.setOnClickListener(object : View.OnClickListener{
                override fun onClick(view: View?) {
                    var soundPlay : MediaPlayer? = null
                    when(adapterPosition){
                        0 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_12)
                        1 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_13)
                        2 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_14)
                        3 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_15)
                        4 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_16)
                        5 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_17)
                        6 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_18)
                        7 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_19)
                        8 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_20)
                        9 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_21)
                        10 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_22)
                        11 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_23)
                        12 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_24)
                        13 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_25)
                        14 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_26)
                        15 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_27)
                        16 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_28)
                        17 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_29)
                        18 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_30)
                        19 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_31)
                        20 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_32)
                        21 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_33)
                        22 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_34)
                        23 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_35)
                        24 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_36)
                        25 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_37)
                        26 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_38)
                        27 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_39)
                        28 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_40)
                        29 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_41)
                        30 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_42)
                        31 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_43)
                        32 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_44)
                        33 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_45)
                        34 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_46)
                        35 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_47)
                        36 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_48)
                        37 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_49)
                        38 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_r_50)

                    }
                    soundPlay!!.start()
                }})
        }

        override fun onClick(view: View?) {
            Log.v("test",adapterPosition.toString())

            var soundPlay : MediaPlayer? = null
            when(adapterPosition){
                0 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_12)
                1 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_13)
                2 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_14)
                3 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_15)
                4 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_16)
                5 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_17)
                6 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_18)
                7 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_19)
                8 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_20)
                9 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_21)
                10 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_22)
                11 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_23)
                12 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_24)
                13 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_25)
                14 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_26)
                15 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_27)
                16 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_28)
                17 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_29)
                18 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_30)
                19 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_31)
                20 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_32)
                21 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_33)
                22 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_34)
                23 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_35)
                24 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_36)
                25 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_37)
                26 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_38)
                27 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_39)
                28 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_40)
                29 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_41)
                30 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_42)
                31 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_43)
                32 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_44)
                33 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_45)
                34 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_46)
                35 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_47)
                36 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_48)
                37 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_49)
                38 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.b_50)

            }
            soundPlay!!.start()
        }

    }

}