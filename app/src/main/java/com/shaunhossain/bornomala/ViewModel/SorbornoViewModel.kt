package com.shaunhossain.bornomala.ViewModel

import androidx.lifecycle.MutableLiveData
import com.shaunhossain.bornomala.Model.ModelSorborno
import com.shaunhossain.bornomala.R
import androidx.lifecycle.ViewModel

class SorbornoViewModel : ViewModel {
    var bornoImage: Int? = null
    var relatedImage: Int? = null
    var description: String = ""

    constructor() : super()

    constructor(modelSorborno: ModelSorborno):super() {
        this.bornoImage = modelSorborno.bornoImage
        this.relatedImage = modelSorborno.relatedImage
        this.description = modelSorborno.description
    }
    var mutablelivedata = MutableLiveData<ArrayList<SorbornoViewModel>>()
    var SorbornoDataList = ArrayList<SorbornoViewModel>()

    fun getArrayList(): MutableLiveData<ArrayList<SorbornoViewModel>>{

        val modelOne = ModelSorborno(
            R.drawable.b_1,
            R.drawable.b_r_1,
            "অজগর")
        val modelTwo = ModelSorborno(
            R.drawable.b_2,
            R.drawable.b_r_2,
            "আম")
        val modelThree = ModelSorborno(
            R.drawable.b_3,
            R.drawable.b_r_3,
            "ইঁদুর")
        val modelFour = ModelSorborno(
            R.drawable.b_4,
            R.drawable.b_r_4,
            "ঈগল")
        val modelFive = ModelSorborno(
            R.drawable.b_5,
            R.drawable.b_r_5,
            "উট")
        val modelSix = ModelSorborno(
            R.drawable.b_6,
            R.drawable.b_r_6,
            "ঊষা")
        val modelSeven = ModelSorborno(
            R.drawable.b_7,
            R.drawable.b_r_7,
            "কৃষক")
        val modelEight = ModelSorborno(
            R.drawable.b_8,
            R.drawable.b_r_8,
            "একতারা")
        val modelNine = ModelSorborno(
            R.drawable.b_9,
            R.drawable.b_r_9,
            "ঐরাবত")
        val modelTen = ModelSorborno(
            R.drawable.b_10,
            R.drawable.b_r_10,
            "ওলকচু")
        val modelEleven = ModelSorborno(
            R.drawable.b_11,
            R.drawable.b_r_11,
            "ঔষধ")

        val viewModelOne = SorbornoViewModel(modelOne)
        val viewModelTwo = SorbornoViewModel(modelTwo)
        val viewModelThree = SorbornoViewModel(modelThree)
        val viewModelFour = SorbornoViewModel(modelFour)
        val viewModelFive = SorbornoViewModel(modelFive)
        val viewModelSix = SorbornoViewModel(modelSix)
        val viewModelSeven = SorbornoViewModel(modelSeven)
        val viewModelEight = SorbornoViewModel(modelEight)
        val viewModelNine = SorbornoViewModel(modelNine)
        val viewModelTen = SorbornoViewModel(modelTen)
        val viewModelEleven = SorbornoViewModel(modelEleven)



        SorbornoDataList.add(viewModelOne)
        SorbornoDataList.add(viewModelTwo)
        SorbornoDataList.add(viewModelThree)
        SorbornoDataList.add(viewModelFour)
        SorbornoDataList.add(viewModelFive)
        SorbornoDataList.add(viewModelSix)
        SorbornoDataList.add(viewModelSeven)
        SorbornoDataList.add(viewModelEight)
        SorbornoDataList.add(viewModelNine)
        SorbornoDataList.add(viewModelTen)
        SorbornoDataList.add(viewModelEleven)

        mutablelivedata.value = SorbornoDataList

        return mutablelivedata
    }
}
