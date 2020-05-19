package com.shaunhossain.bornomala.Adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.shaunhossain.bornomala.NumberFragment
import com.shaunhossain.bornomala.R
import com.shaunhossain.bornomala.ViewModel.NumberViewModel

class ViewNumberAdapter(var context: Context, private val model: ArrayList<NumberViewModel>):
    BaseAdapter() {

    override fun getView(position: Int, view: View?, viewgroup: ViewGroup?): View {
        var view: View = View.inflate(context,R.layout.item_number_view,null)
        val numberImage = view.findViewById<ImageView>(R.id.number_view)
        val numberText = view.findViewById<TextView>(R.id.number_text)
        val model: NumberViewModel = model[position]

        numberImage.setImageResource(model.numberImage!!)
        numberText.text = model.description

        return view
    }

    override fun getItem(position: Int): Any {
       return model[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return model.size
    }



    /*inner class ViewPagerHolder( view: View): RecyclerView.ViewHolder(view) {
        private val numberImage = view.findViewById<ImageView>(R.id.number_view)
        private val numberText = view.findViewById<TextView>(R.id.number_text)

        fun bind (model: NumberViewModel){
            numberImage.setImageResource(model.numberImage!!)
            numberText.text = model.description

        }

    }*/

}