package com.example.calc_new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.calc_new.Interface.MyMainActiviteView
import com.example.calc_new.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), MyMainActiviteView {

    companion object {
        const val TAG = "TAG_MainActivity-> "
        const val CLEAR_STRING = ""
    }

    private val presenter = Presenter()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "ON_CREATE")


        presenter.bindView(this)
        listOfButtonListener()
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "ON_DESTROY")
        presenter.unBindView()
    }
    override fun onResult(str: String) {
        binding.resString.text = str
    }
    override fun withOutLastSymbol(str: String) {
        binding.mathString.text = str
    }
    override fun clearText() {
        binding.mathString.text = CLEAR_STRING
        binding.resString.text = CLEAR_STRING
    }
    override fun setTextFields(str: String) {
        Log.d(TAG, "setTextFields")
        binding.mathString.append(str)
    }
    override fun listOfButtonListener() {
        Log.d(TAG, "listOfButtonListener")
        binding.buttonNine.setOnClickListener() {
            setTextFields(
                binding.buttonNine.text.toString()
            )
        }
        binding.buttonEight.setOnClickListener() {
            setTextFields(
                binding.buttonEight.text.toString()
            )
        }
        binding.buttonSeven.setOnClickListener() {
            setTextFields(
                binding.buttonSeven.text.toString()
            )
        }
        binding.buttonSix.setOnClickListener() {
            setTextFields(
                binding.buttonSix.text.toString()
            )
        }
        binding.buttonFive.setOnClickListener() {
            setTextFields(
                binding.buttonFive.text.toString()
            )
        }
        binding.buttonFour.setOnClickListener() {
            setTextFields(
                binding.buttonFour.text.toString()
            )
        }
        binding.buttonThree.setOnClickListener() {
            setTextFields(
                binding.buttonThree.text.toString()
            )
        }
        binding.buttonTwo.setOnClickListener() {
            setTextFields(
                binding.buttonTwo.text.toString()
            )
        }
        binding.buttonOne.setOnClickListener() {
            setTextFields(
                binding.buttonOne.text.toString()
            )
        }
        binding.buttonZero.setOnClickListener() {
            setTextFields(
                binding.buttonZero.text.toString()
            )
        }
        binding.buttonOpen.setOnClickListener() {
            setTextFields(
                binding.buttonOpen.text.toString()
            )
        }
        binding.buttonClose.setOnClickListener() {
            setTextFields(
                binding.buttonClose.text.toString()
            )
        }
        binding.buttonPoint.setOnClickListener() {
            setTextFields(
                binding.buttonPoint.text.toString()
            )
        }
        binding.buttonDivide.setOnClickListener() {
            setTextFields(
                binding.buttonDivide.text.toString()
            )
        }
        binding.buttonMultiply.setOnClickListener() {
            setTextFields(
                binding.buttonMultiply.text.toString()
            )
        }
        binding.buttonPlus.setOnClickListener() {
            setTextFields(
                binding.buttonPlus.text.toString()
            )
        }
        binding.buttonMinus.setOnClickListener() {
            setTextFields(
                binding.buttonMinus.text.toString()
            )
        }
        binding.buttonClear.setOnClickListener() {
            clearText()
        }
        binding.buttonBack.setOnClickListener() {
            presenter.backEndSymbol(binding.mathString.text.toString())
        }
        binding.buttonRavno.setOnClickListener() {
            presenter.calculate(binding.mathString.text.toString())
        }
    }


}


