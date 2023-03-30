package com.hamzaerdas.calculatorapp.factory

import com.hamzaerdas.calculatorapp.process.Divide
import com.hamzaerdas.calculatorapp.process.ICalculate

class DivideFactory : ICalculateFactory {
    override fun create(): ICalculate {
        return Divide()
    }
}