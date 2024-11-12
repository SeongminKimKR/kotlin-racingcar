package step1.domain

import java.lang.IllegalArgumentException

enum class Operator(val operator: String) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"), ;

    companion object {
        fun getOperator(input: String): Operator {
            return values().firstOrNull { it.operator == input } ?: throw IllegalArgumentException("")
        }
    }
}
