package com.hamzaerdas.calculatorapp

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.hamzaerdas.calculatorapp.databinding.ActivityMainBinding
import com.hamzaerdas.calculatorapp.factory.DivideFactory
import com.hamzaerdas.calculatorapp.factory.MinusFactory
import com.hamzaerdas.calculatorapp.factory.MultiplyFactory
import com.hamzaerdas.calculatorapp.factory.PlusFactory
import com.hamzaerdas.calculatorapp.process.Minus

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var number1: Float = 0f
    private var number2: Float = 0f
    private var res: Float = 0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        textViewClick()

        val plus = CalculateManager(PlusFactory())
        val minus = CalculateManager(MinusFactory())
        val divide = CalculateManager(DivideFactory())
        val multiply = CalculateManager(MultiplyFactory())

        plus(plus)
        minus(minus)
        divide(divide)
        multiply(multiply)


    }

    private fun plus(plus: CalculateManager) {
        binding.plusBtn.setOnClickListener {
            numberInit()
            res = plus.calculate(number1, number2)
            binding.resultText.text = res.toString()
        }
    }

    private fun minus(minus: CalculateManager) {
        binding.minusBtn.setOnClickListener {
            numberInit()
            res = minus.calculate(number1, number2)
            binding.resultText.text = res.toString()
        }
    }

    private fun multiply(multiply: CalculateManager) {
        binding.multiplyBtn.setOnClickListener {
            numberInit()
            res = multiply.calculate(number1, number2)
            binding.resultText.text = res.toString()
        }
    }

    private fun divide(divide: CalculateManager) {
        binding.divideBtn.setOnClickListener {
            numberInit()
            res = divide.calculate(number1, number2)
            binding.resultText.text = res.toString()
        }
    }

    private fun numberInit() {
        if (binding.numberOneText.text.isNullOrEmpty() || binding.numberTwoText.text.isNullOrEmpty()){
            number1 = 0f
            number2 = 0f
            Toast.makeText(this@MainActivity, "Sayı giriniz!!!", Toast.LENGTH_SHORT).show()
        } else {
            number1 = binding.numberOneText.text.toString().toFloat()
            number2 = binding.numberTwoText.text.toString().toFloat()
        }
    }

    private fun textViewClick() {
        binding.numberOneText.setOnFocusChangeListener { _, focus ->
            if (focus) {
                binding.root.setOnClickListener {
                    binding.numberOneText.clearFocus()
                    hideKeyboard()
                }
            }
        }

        binding.numberTwoText.setOnFocusChangeListener { _, focus ->
            if (focus) {
                binding.root.setOnClickListener {
                    binding.numberTwoText.clearFocus()
                    hideKeyboard()
                }
            }
        }
    }

    private fun hideKeyboard() {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.root.windowToken, 0)
    }
}