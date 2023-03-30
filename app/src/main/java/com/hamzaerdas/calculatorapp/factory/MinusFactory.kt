package com.hamzaerdas.calculatorapp.factory

import com.hamzaerdas.calculatorapp.process.ICalculate
import com.hamzaerdas.calculatorapp.process.Minus

class MinusFactory: ICalculateFactory {
    override fun create(): ICalculate {
        return Minus()
    }
}