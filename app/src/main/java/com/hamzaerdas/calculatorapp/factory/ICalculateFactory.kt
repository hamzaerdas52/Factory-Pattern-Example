package com.hamzaerdas.calculatorapp.factory

import com.hamzaerdas.calculatorapp.process.ICalculate

interface ICalculateFactory {
    fun create(): ICalculate
}