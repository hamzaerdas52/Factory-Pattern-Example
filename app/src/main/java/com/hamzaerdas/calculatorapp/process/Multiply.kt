package com.hamzaerdas.calculatorapp.process

class Multiply: ICalculate {
    override fun calculate(x: Float, y: Float): Float {
        // Çarpma işlemi
        return x * y
    }
}