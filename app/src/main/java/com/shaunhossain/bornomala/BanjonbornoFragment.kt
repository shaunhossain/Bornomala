package com.shaunhossain.bornomala

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.airbnb.lottie.LottieAnimationView
import com.shaunhossain.bornomala.Adapter.BanjonbornoCustomAdapter
import com.shaunhossain.bornomala.ViewModel.BanjonbornoViewModel
import kotlinx.android.synthetic.main.banjonborno_fragment.*


class BanjonbornoFragment : Fragment() {


    private lateinit var viewModel: BanjonbornoViewModel
    private var banjonbornoCustomAdapter: BanjonbornoCustomAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.banjonborno_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BanjonbornoViewModel::class.java)
        viewModel.getArrayList().observe(viewLifecycleOwner, Observer { BanjonbornoViewModels ->
            banjonbornoCustomAdapter = BanjonbornoCustomAdapter(BanjonbornoViewModels!!)
            view_pager_banjonborno.adapter = banjonbornoCustomAdapter
            var next: LottieAnimationView = view!!.findViewById<LottieAnimationView>(R.id.next)
            next.setOnClickListener(View.OnClickListener {
                view_pager_banjonborno.setCurrentItem(
                    view_pager_banjonborno.getCurrentItem() + 1,
                    true
                )
            })

            var previous: LottieAnimationView = view!!.findViewById<LottieAnimationView>(R.id.previous)
            previous.setOnClickListener(View.OnClickListener {
                view_pager_banjonborno.setCurrentItem(
                    view_pager_banjonborno.getCurrentItem() - 1,
                    true
                )
            })
        })
    }

}
