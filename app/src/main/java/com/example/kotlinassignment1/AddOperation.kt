package com.example.kotlinassignment1

class AddOperation : AbstractOperation() { // AddOperation:자식 클래스 AbstractOperation: 부모 클래스
    override fun operate(num1: Double, num2: Double): Double = (num1 + num2)
}