package com.shaunhossain.bornomala.Model

class ModelSorborno {
    var bornoImage: Int
    var relatedImage: Int
    var description: String = ""

    constructor(bornoImage: Int, relatedImage: Int, description: String) {
        this.bornoImage = bornoImage
        this.relatedImage = relatedImage
        this.description = description
    }

}