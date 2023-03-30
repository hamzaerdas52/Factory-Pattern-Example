package com.hamzaerdas.calculatorapp.process

class Plus: ICalculate {
    override fun calculate(x: Float, y: Float): Float {
        // Toplama işlemi
        return x + y
    }
}