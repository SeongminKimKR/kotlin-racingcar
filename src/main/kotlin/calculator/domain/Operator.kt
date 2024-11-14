package calculator.domain

import java.lang.IllegalArgumentException

enum class Operator(val value: String) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"), ;

    private fun plus(
        operand1: Operand,
        operand2: Operand,
    ) = operand1.value + operand2.value

    private fun minus(
        operand1: Operand,
        operand2: Operand,
    ) = operand1.value - operand2.value

    private fun multiply(
        operand1: Operand,
        operand2: Operand,
    ) = operand1.value * operand2.value

    private fun divide(
        operand1: Operand,
        operand2: Operand,
    ) = operand1.value / operand2.value

    fun operate(
        operand1: Operand,
        operand2: Operand,
    ): Double {
        return when (this) {
            PLUS -> plus(operand1, operand2)
            MINUS -> minus(operand1, operand2)
            MULTIPLY -> multiply(operand1, operand2)
            DIVIDE -> divide(operand1, operand2)
        }
    }

    companion object {
        fun getOperator(input: String): Operator {
            return values().firstOrNull { it.value == input } ?: throw IllegalArgumentException("지원하지 않는 연산자 입니다. operator=$input")
        }
    }
}
