package com.example.kotlinassignment1

class Calculator {
    fun operate(num1: Double, num2: Double): Double {
        return
    }

    fun addOperation(num1: Double, num2: Double): Double {
        val add = AddOperation()
        return add.operate(num1, num2)
    }
    fun divideOperation(num1: Double,num2: Double): Double {
        val div = DivideOperation()
        return div.operate(num1, num2)
    }

    fun subStractOperation(num1: Double,num2: Double): Double {
        val suv = SubStractOperation()
        return suv.operate(num1,num2)
    }
    fun multiplyOperation(num1: Double, num2: Double): Double {
        val mul = MultiplyOperation()
        return mul.operate(num1,num2)
    }

}