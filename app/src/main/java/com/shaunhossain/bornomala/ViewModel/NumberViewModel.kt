package com.shaunhossain.bornomala.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shaunhossain.bornomala.Model.ModelNumber
import com.shaunhossain.bornomala.R

class NumberViewModel : ViewModel {

    var numberImage: Int? = null
    var relatedAudio: Int? = null
    var description: String = ""

    constructor() : super()

    constructor(modelNumber: ModelNumber):super() {
        this.numberImage = modelNumber.numberImage
        this.relatedAudio = modelNumber.relatedAudio
        this.description = modelNumber.description
    }

    var mutablelivedata = MutableLiveData<ArrayList<NumberViewModel>>()
    var numberDataList = ArrayList<NumberViewModel>()

    fun getArrayList(): MutableLiveData<ArrayList<NumberViewModel>> {

        val modelZero = ModelNumber(
            R.drawable.zero,
            R.raw.shunno,
            "শুন্য"
        )
        val modelOne = ModelNumber(
            R.drawable.one,
            R.raw.one,
            "এক"
        )
        val modelTwo = ModelNumber(
            R.drawable.two,
            R.raw.two,
            "দুই"
        )
        val modelThree = ModelNumber(
            R.drawable.three,
            R.raw.three,
            "তিন"
        )
        val modelFour = ModelNumber(
            R.drawable.four,
            R.raw.four,
            "চার"
        )
        val modelFive = ModelNumber(
            R.drawable.five,
            R.raw.five,
            "পাঁচ"
        )
        val modelSix = ModelNumber(
            R.drawable.six,
            R.raw.six,
            "ছয়"
        )
        val modelSeven = ModelNumber(
            R.drawable.seven,
            R.raw.seven,
            "সাত"
        )
        val modelEight = ModelNumber(
            R.drawable.eight,
            R.raw.eight,
            "আট"
        )
        val modelNine = ModelNumber(
            R.drawable.nine,
            R.raw.nine,
            "নয়"
        )
        val viewModelZero = NumberViewModel(modelZero)
        val viewModelOne = NumberViewModel(modelOne)
        val viewModelTwo = NumberViewModel(modelTwo)
        val viewModelThree = NumberViewModel(modelThree)
        val viewModelFour = NumberViewModel(modelFour)
        val viewModelFive = NumberViewModel(modelFive)
        val viewModelSix = NumberViewModel(modelSix)
        val viewModelSeven = NumberViewModel(modelSeven)
        val viewModelEight = NumberViewModel(modelEight)
        val viewModelNine = NumberViewModel(modelNine)


        numberDataList.add(viewModelZero)
        numberDataList.add(viewModelOne)
        numberDataList.add(viewModelTwo)
        numberDataList.add(viewModelThree)
        numberDataList.add(viewModelFour)
        numberDataList.add(viewModelFive)
        numberDataList.add(viewModelSix)
        numberDataList.add(viewModelSeven)
        numberDataList.add(viewModelEight)
        numberDataList.add(viewModelNine)

        mutablelivedata.value = numberDataList

        return mutablelivedata
    }

}
