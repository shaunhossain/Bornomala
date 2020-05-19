package com.shaunhossain.bornomala.Model

class ModelKobita {
    var relatedImage: Int
    var kobitaName: String = ""
    var kobiName: String = ""
    var kobita: String = ""

    constructor(relatedImage: Int, kobitaName: String, kobiName: String, kobita: String) {
        this.relatedImage = relatedImage
        this.kobitaName = kobitaName
        this.kobiName = kobiName
        this.kobita = kobita
    }
}