package com.hamzaerdas.calculatorapp.process

class Minus: ICalculate {
    override fun calculate(x: Float, y: Float): Float {
        // Çıkarma işlemi
        return x - y
    }
}