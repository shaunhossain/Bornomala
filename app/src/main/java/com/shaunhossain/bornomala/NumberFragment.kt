package com.shaunhossain.bornomala

import android.annotation.SuppressLint
import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.core.view.get
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.shaunhossain.bornomala.Adapter.ViewNumberAdapter
import com.shaunhossain.bornomala.Model.ModelNumber
import com.shaunhossain.bornomala.ViewModel.NumberViewModel
import kotlinx.android.synthetic.main.number_fragment.*


class NumberFragment : Fragment(), AdapterView.OnItemClickListener {

    private lateinit var viewModel: NumberViewModel
    private var NumberViewCustomAdapter: ViewNumberAdapter? = null

    lateinit var soundPlay: MediaPlayer
    lateinit var numberItem : NumberViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.number_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(NumberViewModel::class.java)
        viewModel.getArrayList().observe(viewLifecycleOwner, Observer { NumberViewModels ->
            NumberViewCustomAdapter = context?.let { ViewNumberAdapter(it,NumberViewModels!!) }
            number_list_view.adapter = NumberViewCustomAdapter
            number_list_view?.onItemClickListener = this
        })

    }

    override fun onItemClick(parent: AdapterView<*>?, view : View?, position: Int, id: Long) {

        when(position){
            0 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.shunno)
            1 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.one)
            2 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.two)
            3 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.three)
            4 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.four)
            5 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.five)
            6 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.six)
            7 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.seven)
            8 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.eight)
            9 -> soundPlay = MediaPlayer.create(view!!.context, R.raw.nine)

        }
        soundPlay.start()
        if (soundPlay.isLooping){
            soundPlay.release()
        }

    }
}
