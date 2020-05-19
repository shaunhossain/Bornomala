package com.shaunhossain.bornomala

import android.os.Bundle
import android.os.Parcelable
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.shaunhossain.bornomala.Data.DataOfKobita

/**
 * A simple [Fragment] subclass.
 */
class KobitaFragment : Fragment() {

    lateinit var kobitaData : DataOfKobita

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        kobitaData = arguments!!.getParcelable("kobita_data")!!
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kobita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // Toast.makeText(context,kobitaData.relatedImage.toString(), Toast.LENGTH_SHORT).show()
       // Toast.makeText(context,kobitaData.kobita.toString(), Toast.LENGTH_SHORT).show()
        val kobitaImageView = view.findViewById<ImageView>(R.id.kobita_image_view)
        val kobitaName = view.findViewById<TextView>(R.id.kobita_name)
        val kobiName = view.findViewById<TextView>(R.id.kobi_name)
        val kobita = view.findViewById<TextView>(R.id.kobita)
        kobitaImageView.setImageResource(kobitaData.relatedImage!!)
        kobitaName.text = kobitaData.kobitaName
        kobiName.text = kobitaData.kobiName
        kobita.text = kobitaData.kobita
    }

}
