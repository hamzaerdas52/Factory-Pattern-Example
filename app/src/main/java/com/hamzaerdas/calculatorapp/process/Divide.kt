package com.hamzaerdas.calculatorapp.process

class Divide: ICalculate {
    override fun calculate(x: Float, y: Float): Float {
        // Bölme işlemi
        return x / y
    }
}