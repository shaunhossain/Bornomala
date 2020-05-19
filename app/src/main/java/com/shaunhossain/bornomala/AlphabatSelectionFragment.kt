package com.shaunhossain.bornomala

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.shaunhossain.bornomala.ViewModel.AlphabatSelectionViewModel


class AlphabatSelectionFragment : Fragment(), View.OnClickListener {

    private lateinit var viewModel: AlphabatSelectionViewModel
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.alphabat_selection_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AlphabatSelectionViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<ImageView>(R.id.sorborno_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.benjonborno_view).setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.sorborno_view -> navController!!.navigate(R.id.action_alphabatSelectionFragment_to_sorbornoFragment)
            R.id.benjonborno_view -> navController!!.navigate(R.id.action_alphabatSelectionFragment_to_banjonbornoFragment)
        }
    }

}
