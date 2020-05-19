package com.shaunhossain.bornomala.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shaunhossain.bornomala.Model.ModelMainView
import com.shaunhossain.bornomala.R

class MainViewModel : ViewModel {
    var relatedImage: Int? = null
    var description: String = ""

    constructor() : super()

    constructor(modelmainview: ModelMainView):super() {
        this.relatedImage = modelmainview.kobitaImage
        this.description = modelmainview.description
    }
    var mutablelivedata = MutableLiveData<ArrayList<MainViewModel>>()
    var MainViewDataList = ArrayList<MainViewModel>()

    fun getArrayList(): MutableLiveData<ArrayList<MainViewModel>>{

        val modelOne = ModelMainView(
            R.drawable.aiai_tiye,
            "আতা গাছে তোতা পাখি")
        val modelTwo = ModelMainView(
            R.drawable.aiai_cadmama,
            "আয় আয় চাঁদ মামা")
        val modelThree = ModelMainView(
            R.drawable.aichelera_aimeyera,
            "মামার বাড়ি")
        val modelFour = ModelMainView(
            R.drawable.amader_sotonodi,
            "আমাদের ছোট নদী")
        val modelFive = ModelMainView(
            R.drawable.ampata_jorajora,
            "আম পাতা জোড়া জোড়া")
        val modelSix = ModelMainView(
            R.drawable.cadutheche_ful,
            "চাঁদ উঠেছে ফুল ফুটেছে")
        val modelSeven = ModelMainView(
            R.drawable.noton_noton,
            "নোটন নোটন পায়রাগুলি")
        val modelEight = ModelMainView(
            R.drawable.hattimattim_tim,
            "হাট্টিমাটিম টিম")
        val modelNine = ModelMainView(
            R.drawable.khokon_khokondak,
            "খোকন খোকন ডাক পাড়ি")
        val modelTen = ModelMainView(
            R.drawable.oidekha_jaital,
            "কানা বগীর ছা")
        val modelEleven = ModelMainView(
            R.drawable.vorholo_dorkholo,
            "ভোর হল দোর খোল")

        val viewModelOne = MainViewModel(modelOne)
        val viewModelTwo = MainViewModel(modelTwo)
        val viewModelThree = MainViewModel(modelThree)
        val viewModelFour = MainViewModel(modelFour)
        val viewModelFive = MainViewModel(modelFive)
        val viewModelSix = MainViewModel(modelSix)
        val viewModelSeven = MainViewModel(modelSeven)
        val viewModelEight = MainViewModel(modelEight)
        val viewModelNine = MainViewModel(modelNine)
        val viewModelTen = MainViewModel(modelTen)
        val viewModelEleven = MainViewModel(modelEleven)



        MainViewDataList.add(viewModelOne)
        MainViewDataList.add(viewModelTwo)
        MainViewDataList.add(viewModelThree)
        MainViewDataList.add(viewModelFour)
        MainViewDataList.add(viewModelFive)
        MainViewDataList.add(viewModelSix)
        MainViewDataList.add(viewModelSeven)
        MainViewDataList.add(viewModelEight)
        MainViewDataList.add(viewModelNine)
        MainViewDataList.add(viewModelTen)
        MainViewDataList.add(viewModelEleven)

        mutablelivedata.value = MainViewDataList

        return mutablelivedata
    }
}
