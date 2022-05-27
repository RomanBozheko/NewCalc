package com.example.calc_new


import android.util.Log
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception


class Presenter {

    companion object {
        const val TAG = "TAG_Presenter -> "
        const val  ERROR_MESSAGE = "< Error >"

    }


    fun calculate(stringCalc: String): String {
        Log.e(TAG,"Presenter.calculate")

        var res:String
        try {
            val calc = ExpressionBuilder(stringCalc).build()
            res = calc.evaluate().toLong().toString()
        } catch (e: Exception) {
            res = ERROR_MESSAGE
            Log.e(TAG, e.message.toString())
        }
        return res
    }
}