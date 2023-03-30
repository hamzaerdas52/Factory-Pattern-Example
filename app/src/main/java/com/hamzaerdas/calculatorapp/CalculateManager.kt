package com.hamzaerdas.calculatorapp

import com.hamzaerdas.calculatorapp.factory.ICalculateFactory
import com.hamzaerdas.calculatorapp.process.ICalculate
import java.text.DecimalFormat

class CalculateManager(
    factory: ICalculateFactory
) {
    private var calculate: ICalculate

    init {
        calculate = factory.create()
    }

    fun calculate(x: Float, y: Float): Float{
        return DecimalFormat("#.##").format(calculate.calculate(x, y)).toFloat()
    }

}