package com.shaunhossain.bornomala

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.shaunhossain.bornomala.ViewModel.NamotaListViewModel


class NamotaListFragment : Fragment() {

    companion object {
        fun newInstance() = NamotaListFragment()
    }

    private lateinit var viewModel: NamotaListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.namota_list_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NamotaListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
