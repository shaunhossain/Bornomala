package com.shaunhossain.bornomala.Model

class GameModel {
    var gameKeys: Array<String>
    var correctAnswer: String = ""
    var relatedImage: Int
    var maxPress: Int


    constructor(gameKeys: Array<String>,correctAnswer: String, relatedImage: Int, maxPress: Int) {
        this.gameKeys = gameKeys
        this.correctAnswer = correctAnswer
        this.relatedImage = relatedImage
        this.maxPress = maxPress
    }
}