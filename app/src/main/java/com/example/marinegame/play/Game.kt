package com.example.marinegame.play

import kotlin.random.Random


object Game {

    fun getRandomWord(words : List<Word>): String {
        return words[Random.nextInt(0 , words.size)].name
    }

}