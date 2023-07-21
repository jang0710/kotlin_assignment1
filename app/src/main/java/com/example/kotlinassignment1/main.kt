package com.example.kotlinassignment1

fun main() {
    val calc = Calculator()
    val num1 = readLine()!!.toDouble()
    val op = readLine()!!.toString() // 사칙연산 기호는 문자열이기에 toString
    val num2 = readLine()!!.toDouble()

    when (op) {
        "+" -> {
            val addResult = calc.addOperation(num1, num2)
            println("답은 ${addResult}입니다.")
        }
        "/" -> {
            val divResult = calc.divideOperation(num1, num2)
            println("${divResult}입니다.")
        }
        "-" -> {
            val subResult = calc.subStractOperation(num1, num2)
            println("${subResult}입니다.")
        }
        "*" -> {
            val mulResult = calc.multiplyOperation(num1, num2)
            println("${mulResult}입니다.")
        }
    }
    //    if (op == "+") {
//        var addResult = calc.addOperation(num1,num2)
//        println("답은 ${addResult}입니다.")
//    } else if (op == "/") {
//        var divResult = calc.divideOperation(num1,num2)
//        println("${divResult}입니다.")
//    } else if (op == "*") {
//        var mulResult = calc.multiplyOperation(num1,num2)
//        println("${mulResult}입니다.")
//    } else if (op == "-") {
//        var subResult = calc.subStractOperation(num1,num2)
//        println("${subResult}입니다.")
//    }

}