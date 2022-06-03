package com.example.calc_new


import android.util.Log
import com.example.calc_new.Interface.MyMainActiviteView
import com.example.calc_new.Interface.MyPresenter
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception


class Presenter : MyPresenter {

    companion object {
        const val TAG = "TAG_Presenter -> "
        const val ERROR_MESSAGE = "< Error >"

    }
    private var view:MyMainActiviteView? = null

    override fun bindView(view: MyMainActiviteView) {
        this.view = view
    }

    override fun unBindView() {
        this.view = null
    }

    override fun calculate(stringCalc: String){
        Log.d(TAG, "Presenter.calculate")

        var res: String
        try {
            val calc = ExpressionBuilder(stringCalc).build()
            res = calc.evaluate().toLong().toString()
        } catch (e: Exception) {
            res = ERROR_MESSAGE
            Log.e(TAG, e.message.toString())
        }
        view?.onResult(res)
    }

    override fun backEndSymbol(mathStr: String) {
        Log.d(TAG, "Presenter.backEndSymbol")

        val res = mathStr.dropLast(1)
        view?.withOutLastSymbol(res)
    }
}