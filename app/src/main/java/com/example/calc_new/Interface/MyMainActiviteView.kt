package com.example.calc_new.Interface

interface MyMainActiviteView {
    fun onResult(str: String)
    fun withOutLastSymbol(str: String)
    fun clearText()
    fun setTextFields(str: String)
    fun listOfButtonListener()
}