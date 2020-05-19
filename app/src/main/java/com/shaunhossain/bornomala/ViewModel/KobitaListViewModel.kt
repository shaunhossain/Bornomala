package com.shaunhossain.bornomala.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shaunhossain.bornomala.Model.ModelKobita
import com.shaunhossain.bornomala.R

class KobitaListViewModel : ViewModel {

    var relatedImage: Int? = null
    var kobitaName: String = ""
    var kobiName: String = ""
    var kobita: String = ""

    constructor() : super()

    constructor(modelKobita: ModelKobita):super() {
        this.relatedImage = modelKobita.relatedImage
        this.kobitaName = modelKobita.kobitaName
        this.kobiName = modelKobita.kobiName
        this.kobita = modelKobita.kobita
    }
    var mutablelivedata = MutableLiveData<ArrayList<KobitaListViewModel>>()
    var KobitaViewDataList = ArrayList<KobitaListViewModel>()

    fun getArrayList(): MutableLiveData<ArrayList<KobitaListViewModel>> {

        val modelOne = ModelKobita(
            R.drawable.aiai_tiye,
            "তোতা পাখি",
            "যোগীন্দ্রনাথ সরকার",
            "আতা গাছে তোত পাখি\n" +
                    "ডালিম গাছে মৌ,\n" +
                    "এত ডাকি তবু কথা\n" +
                    "কও না কেন বউ?\n" +
                    "কথা কব কী ছলে,\n" +
                    "কথা কইতে গা জ্বলে!")
        val modelTwo = ModelKobita(
            R.drawable.aiai_cadmama,
            "আয় আয় চাঁদ মামা",
            "প্রচলিত",
            "আয় আয় চাঁদ মামা\n" +
                    "টিপ দিয়ে যা\n" +
                    "চাঁদের কপালে চাঁদ\n" +
                    "টিপ দিয়ে যা।\n" +
                    "ধান ভানলে কুঁড়ো দেব\n" +
                    "মাছ কাটলে মুড়ো দেব\n" +
                    "কাল গাইয়ের দুধ দেব\n" +
                    "দুধ খাবার বাটি দেব\n" +
                    "চাঁদের কপালে চাঁদ\n" +
                    "টিপ দিয়ে যা।")
        val modelThree = ModelKobita(
            R.drawable.aichelera_aimeyera,
            "মামার বাড়ি",
            "জসীম উদ্দিন",
            "আয় ছেলেরা আয় মেয়েরা,\n" +
                    "ফুল তুলিতে যাই\n" +
                    "ফুলের মালা গলায় দিয়ে\n" +
                    "মামার বাড়ি যাই।\n" +
                    "মামার বাড়ি পদ্মপুকুর\n" +
                    "গলায় গলায় জল,\n" +
                    "এপার হতে ওপার গিয়ে\n" +
                    "নাচে ঢেউয়ের দল।")
        val modelFour = ModelKobita(
            R.drawable.amader_sotonodi,
            "আমাদের ছোট নদী",
            "রবীন্দ্রনাথ ঠাকুর",
            "আমাদের ছোটো নদী চলে বাঁকে বাঁকে \n" +
                    "বৈশাখ মাসে তার হাঁটু জল থাকে। \n" +
                    "পার হয়ে যায় গোরু, পার হয় গাড়ি, \n" +
                    "দুই ধার উঁচু তার, ঢালু তার পাড়ি। \n" +
                    "\n" +
                    "চিক্ চিক্ করে বালি, কোথা নাই কাদা, \n" +
                    "একধারে কাশবন ফুলে ফুলে সাদা। \n" +
                    "কিচিমিচি করে সেথা শালিকের ঝাঁক, \n" +
                    "রাতে ওঠে থেকে থেকে শেয়ালের হাঁক। ")
        val modelFive = ModelKobita(
            R.drawable.ampata_jorajora,
            "আম পাতা জোড়া জোড়া",
            "রফিকুল হক",
            "আম পাতা জোড়া জোড়া,\n" +
                    "মারবো চাবুক, চড়বো ঘোড়া।\n" +
                    "ওরে বুবু সরে দাঁড়া,\n" +
                    "আসছে আমার পাগলা ঘোড়া।\n" +
                    "পাগলা ঘোড়া খেপেছে,\n" +
                    "চাবুক ছুঁড়ে মেরেছে!")
        val modelSix = ModelKobita(
            R.drawable.cadutheche_ful,
            "চাঁদ উঠেছে ফুল ফুটেছে",
            "প্রচলিত",
            "চাদ উঠেছে ফুল ফুটেছে\n" +
                    "কদম তলায় কে ?\n" +
                    "হাতি নাচছে ঘোড়া নাচছে,\n" +
                    "সোনা মনির বে।")
        val modelSeven = ModelKobita(
            R.drawable.noton_noton,
            "নোটন নোটন পায়রাগুলি",
            "প্রচলিত",
            "নোটন নোটন পায়রাগুলি\n" +
                    "ঝোটন বেঁধেছে,\n" +
                    "ওপারেতে ছেলেমেয়ে\n" +
                    "নাইতে নেমেছে।\n" +
                    "দুই ধারে দুই রুই কাতলা\n" +
                    "ভেসে উঠেছে,\n" +
                    "কে দেখেছে কে দেখেছে\n" +
                    "দাদা দেখেছে।\n" +
                    "দাদার হাতে কলম ছিল\n" +
                    "ছুড়ে মেরেছে,\n" +
                    "উঃ বড্ড লেগেছে।")
        val modelEight = ModelKobita(
            R.drawable.hattimattim_tim,
            "হাট্টিমাটিম টিম",
            "রোকনুজ্জামান খান",
            "হাট্টিমাটিম টিম\n" +
                    "তারা মাঠে পারে ডিম\n" +
                    "তাদের খাড়া দুটো শিং\n" +
                    "তারা হাট্টিমাটিম টিম।")
        val modelNine = ModelKobita(
            R.drawable.khokon_khokondak,
            "খোকন খোকন ডাক পাড়ি",
            "রোকনুজ্জামান খান",
            "খোকন খোকন ডাক পাড়ি\n" +
                    "খোন মোদের কার\n" +
                    "বাড়ি ?\n" +
                    "আয় রে খোকন ঘরে আয়\n" +
                    "দুধ মাখা ভাত কাকে খায়।")
        val modelTen = ModelKobita(
            R.drawable.oidekha_jaital,
            "কানা বগীর ছা",
            "খান মুহাম্মদ মইনুদ্দীন",
            "ঐ দেখা যায় তাল গাছ\n" +
                    "ঐ আমাদের গাঁ।\n" +
                    "ঐ খানেতে বাস করে\n" +
                    "কানা বগীর ছা।\n" +
                    "ও বগী তুই খাস কি?\n" +
                    "পানতা ভাত চাস কি?\n" +
                    "পানতা আমি খাই না\n" +
                    "পুঁটি মাছ পাই না\n" +
                    "একটা যদি পাই\n" +
                    "অমনি ধরে গাপুস গুপুস খাই।")
        val modelEleven = ModelKobita(
            R.drawable.vorholo_dorkholo,
            "প্রভাতী",
            "কাজী নজরুল ইসলাম",
            "ভোর হলো দোর খোলো\n" +
                    "খুকুমণি ওঠ রে!\n" +
                    "ঐ ডাকে যুঁই-শাখে\n" +
                    "ফুল-খুকি ছোটরে!\n" +
                    "রবি মামা দেয় হামা\n" +
                    "গায়ে রাঙা জামা ঐ,\n" +
                    "দারোয়ান গায় গান\n" +
                    "শোন ঐ, রামা হৈ!'\n")

        val viewModelOne = KobitaListViewModel(modelOne)
        val viewModelTwo = KobitaListViewModel(modelTwo)
        val viewModelThree = KobitaListViewModel(modelThree)
        val viewModelFour = KobitaListViewModel(modelFour)
        val viewModelFive = KobitaListViewModel(modelFive)
        val viewModelSix = KobitaListViewModel(modelSix)
        val viewModelSeven = KobitaListViewModel(modelSeven)
        val viewModelEight = KobitaListViewModel(modelEight)
        val viewModelNine = KobitaListViewModel(modelNine)
        val viewModelTen = KobitaListViewModel(modelTen)
        val viewModelEleven = KobitaListViewModel(modelEleven)



        KobitaViewDataList.add(viewModelOne)
        KobitaViewDataList.add(viewModelTwo)
        KobitaViewDataList.add(viewModelThree)
        KobitaViewDataList.add(viewModelFour)
        KobitaViewDataList.add(viewModelFive)
        KobitaViewDataList.add(viewModelSix)
        KobitaViewDataList.add(viewModelSeven)
        KobitaViewDataList.add(viewModelEight)
        KobitaViewDataList.add(viewModelNine)
        KobitaViewDataList.add(viewModelTen)
        KobitaViewDataList.add(viewModelEleven)

        mutablelivedata.value = KobitaViewDataList

        return mutablelivedata
    }

}
