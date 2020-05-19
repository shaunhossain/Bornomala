package com.shaunhossain.bornomala

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.text.Layout
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.shaunhossain.bornomala.Adapter.KobitaListAdapter
import com.shaunhossain.bornomala.Adapter.MainFramgentViewAdapter
import com.shaunhossain.bornomala.Data.DataOfKobita
import com.shaunhossain.bornomala.ViewModel.KobitaListViewModel
import com.shaunhossain.bornomala.ViewModel.MainViewModel
import kotlinx.android.synthetic.main.main_fragment.*


class KobitaListFragment : Fragment(), KobitaListAdapter.OnItemClickListener {

    companion object {
        fun newInstance() = KobitaListFragment()
    }

    private lateinit var viewModel: KobitaListViewModel
    private var recyclerView: RecyclerView? = null
    private var kobitaListAdapter: KobitaListAdapter? = null
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.kobita_list_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(KobitaListViewModel::class.java)
        recyclerView = view?.findViewById<RecyclerView>(R.id.view_container)
        navController = Navigation.findNavController(view)

        var kobitaListViewModel: KobitaListViewModel = ViewModelProvider(this).get(KobitaListViewModel::class.java)
        kobitaListViewModel.getArrayList().observe(viewLifecycleOwner, Observer { kobitaListViewModels ->
            kobitaListAdapter = KobitaListAdapter(kobitaListViewModels!!,this)
            recyclerView!!.layoutManager = LinearLayoutManager(context)
            recyclerView!!.adapter = kobitaListAdapter

        })
    }

    override fun onItemClick(modelKobitaList: KobitaListViewModel, position: Int) {
        val kobitaItemData = DataOfKobita(modelKobitaList.relatedImage!!,modelKobitaList.kobitaName,modelKobitaList.kobiName,modelKobitaList.kobita)
        val bundle = bundleOf(
            "kobita_data" to kobitaItemData
        )
        navController!!.navigate(R.id.action_kobitaListFragment_to_kobitaFragment,bundle)

    }

}
