package com.shaunhossain.bornomala

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.shaunhossain.bornomala.Adapter.MainFramgentViewAdapter
import com.shaunhossain.bornomala.ViewModel.MainViewModel
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment(), View.OnClickListener, MainFramgentViewAdapter.OnItemClickListener  {

    lateinit var navController: NavController

    private lateinit var viewModel: MainViewModel
    private var MainViewCustomAdapter: MainFramgentViewAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.getArrayList().observe(viewLifecycleOwner, Observer { MainViewModels ->
            MainViewCustomAdapter = MainFramgentViewAdapter(MainViewModels!!,this)
            view_pager_main_fragment.adapter = MainViewCustomAdapter
        })
        navController = Navigation.findNavController(view)
        view.findViewById<ImageView>(R.id.leter_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.number_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.quiz_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.write_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.kobita_view).setOnClickListener(this)
        view.findViewById<ImageView>(R.id.namota_view).setOnClickListener(this)

    }


    override fun onClick(view: View?) {
        when(view!!.id){
            R.id.leter_view -> navController.navigate(R.id.action_mainFragment_to_alphabatSelectionFragment)
            R.id.number_view -> navController.navigate(R.id.action_mainFragment_to_numberFragment)
            R.id.quiz_view -> navController.navigate(R.id.action_mainFragment_to_gameFragment)
            R.id.write_view -> navController.navigate(R.id.action_mainFragment_to_writeFragment)
            R.id.kobita_view -> navController.navigate(R.id.action_mainFragment_to_kobitaListFragment)
            R.id.namota_view -> navController.navigate(R.id.action_mainFragment_to_namotaListFragment)
        }

    }

    override fun onItemClick(model: MainViewModel, position: Int) {
        navController!!.navigate(R.id.action_mainFragment_to_kobitaListFragment)
    }


}
