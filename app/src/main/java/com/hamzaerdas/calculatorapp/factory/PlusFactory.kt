package com.hamzaerdas.calculatorapp.factory

import com.hamzaerdas.calculatorapp.process.ICalculate
import com.hamzaerdas.calculatorapp.process.Plus

class PlusFactory: ICalculateFactory {
    override fun create(): ICalculate {
        return Plus()
    }
}