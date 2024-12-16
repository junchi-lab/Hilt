package com.example.hilt.practice

import javax.inject.Inject

class MyName @Inject constructor(){

    override fun toString(): String {
        return "Hilt Test"
    }
}