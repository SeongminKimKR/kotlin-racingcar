package step1.domain

import java.util.LinkedList

class ParsedExpression(input: String?) {
    private val elements: LinkedList<String>

    init {
        elements = InputParser.parse(input)
    }

    fun isCanCalculate() = elements.size >= 3

    fun getElement(): String = elements.poll()

    fun putElement(value: String) {
        elements.push(value)
    }
}
