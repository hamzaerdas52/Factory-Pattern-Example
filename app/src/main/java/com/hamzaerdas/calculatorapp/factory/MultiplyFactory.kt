package com.hamzaerdas.calculatorapp.factory

import com.hamzaerdas.calculatorapp.process.ICalculate
import com.hamzaerdas.calculatorapp.process.Multiply

class MultiplyFactory: ICalculateFactory {
    override fun create(): ICalculate {
        return Multiply()
    }
}