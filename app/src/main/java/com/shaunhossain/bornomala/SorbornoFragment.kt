package com.shaunhossain.bornomala

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.airbnb.lottie.LottieAnimationView
import com.shaunhossain.bornomala.Adapter.SorbornoCustomAdapter
import com.shaunhossain.bornomala.ViewModel.SorbornoViewModel
import kotlinx.android.synthetic.main.sorborno_fragment.*


class SorbornoFragment : Fragment() {


    private lateinit var viewModel: SorbornoViewModel
    private var sorbornoCustomAdapter: SorbornoCustomAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sorborno_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SorbornoViewModel::class.java)
        viewModel.getArrayList().observe(viewLifecycleOwner, Observer { SorbornoViewModels ->
            sorbornoCustomAdapter = SorbornoCustomAdapter(SorbornoViewModels!!)
            view_pager_sorborno.adapter = sorbornoCustomAdapter
            var next: LottieAnimationView = view!!.findViewById<LottieAnimationView>(R.id.next)
            next.setOnClickListener(View.OnClickListener {
                view_pager_sorborno.setCurrentItem(
                    view_pager_sorborno.getCurrentItem() + 1,
                    true
                )
            })

            var previous: LottieAnimationView = view!!.findViewById<LottieAnimationView>(R.id.previous)
            previous.setOnClickListener(View.OnClickListener {
                view_pager_sorborno.setCurrentItem(
                    view_pager_sorborno.getCurrentItem() - 1,
                    true
                )
            })
        })
    }

}
