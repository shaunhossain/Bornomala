package com.shaunhossain.bornomala.Model

class ModelNumber {
    var numberImage: Int
    var relatedAudio: Int
    var description: String = ""

    constructor(numberImage: Int, relatedAudio: Int, description: String) {
        this.numberImage = numberImage
        this.relatedAudio = relatedAudio
        this.description = description
    }
}