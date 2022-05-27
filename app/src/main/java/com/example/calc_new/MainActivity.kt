package com.example.calc_new

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import com.example.calc_new.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    companion object {
        const val TAG = "TAG_MainActivity -> "
        const val CLEAR_STRING = ""
    }

    private val presenter = Presenter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e(TAG, "ON_CREATE")

        listOfButtonListener(binding)
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "ON_START")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "ON_RESTART")
    }

    /**/    override fun onResume() {
        super.onResume()
        Log.e(TAG, "ON_RESUME")
    }

    /**/    override fun onPause() {
        super.onPause()
        Log.e(TAG, "ON_PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "ON_STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "ON_DESTROY")
    }


    private fun showResult(binding: ActivityMainBinding) {
        binding.resString.text = presenter.calculate(binding.mathString.text.toString())
    }

    private fun backEndSymbol(binding: ActivityMainBinding) {
        val str = binding.mathString.text.toString()
        if (str.isNotEmpty()) {
//            binding.mathString.text = str.substring(0, str.length - 1)
            binding.mathString.text = str.dropLast(1)
        }
    }

    private fun clearText(binding: ActivityMainBinding) {
        binding.mathString.text = CLEAR_STRING
        binding.resString.text = CLEAR_STRING
    }

    private fun setTextFields(str: String, binding: ActivityMainBinding) {
        Log.e(TAG, "setTextFields")
        binding.mathString.append(str)
    }

    private fun listOfButtonListener(binding: ActivityMainBinding) {
        Log.e(TAG, "listOfButtonListener")
        binding.buttonNine.setOnClickListener() {
            setTextFields(
                binding.buttonNine.text.toString(),
                binding
            )
        }
        binding.buttonEight.setOnClickListener() {
            setTextFields(
                binding.buttonEight.text.toString(),
                binding
            )
        }
        binding.buttonSeven.setOnClickListener() {
            setTextFields(
                binding.buttonSeven.text.toString(),
                binding
            )
        }
        binding.buttonSix.setOnClickListener() {
            setTextFields(
                binding.buttonSix.text.toString(),
                binding
            )
        }
        binding.buttonFive.setOnClickListener() {
            setTextFields(
                binding.buttonFive.text.toString(),
                binding
            )
        }
        binding.buttonFour.setOnClickListener() {
            setTextFields(
                binding.buttonFour.text.toString(),
                binding
            )
        }
        binding.buttonThree.setOnClickListener() {
            setTextFields(
                binding.buttonThree.text.toString(),
                binding
            )
        }
        binding.buttonTwo.setOnClickListener() {
            setTextFields(
                binding.buttonTwo.text.toString(),
                binding
            )
        }
        binding.buttonOne.setOnClickListener() {
            setTextFields(
                binding.buttonOne.text.toString(),
                binding
            )
        }
        binding.buttonZero.setOnClickListener() {
            setTextFields(
                binding.buttonZero.text.toString(),
                binding
            )
        }

        binding.buttonOpen.setOnClickListener() {
            setTextFields(
                binding.buttonOpen.text.toString(),
                binding
            )
        }
        binding.buttonClose.setOnClickListener() {
            setTextFields(
                binding.buttonClose.text.toString(),
                binding
            )
        }
        binding.buttonPoint.setOnClickListener() {
            setTextFields(
                binding.buttonPoint.text.toString(),
                binding
            )
        }

        binding.buttonDivide.setOnClickListener() {
            setTextFields(
                binding.buttonDivide.text.toString(),
                binding
            )
        }
        binding.buttonMultiply.setOnClickListener() {
            setTextFields(
                binding.buttonMultiply.text.toString(),
                binding
            )
        }
        binding.buttonPlus.setOnClickListener() {
            setTextFields(
                binding.buttonPlus.text.toString(),
                binding
            )
        }
        binding.buttonMinus.setOnClickListener() {
            setTextFields(
                binding.buttonMinus.text.toString(),
                binding
            )
        }
        binding.buttonClear.setOnClickListener() {
            clearText(binding)
        }
        binding.buttonBack.setOnClickListener() {
            backEndSymbol(binding)
        }

        binding.buttonRavno.setOnClickListener() {
            showResult(binding)
        }
    }
}


