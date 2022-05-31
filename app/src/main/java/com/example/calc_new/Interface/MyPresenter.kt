package com.example.calc_new.Interface

interface MyPresenter {
    fun calculate(stringCalc: String)
    fun backEndSymbol(str: String)
    fun bindView(view: MyMainActiviteView)
    fun unBindView()
}