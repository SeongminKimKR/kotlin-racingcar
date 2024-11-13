package step1.domain

class Operand(input: String?) {
    private val _value: Double

    val value: Double
        get() = _value

    init {
        requireNotNull(input)
        require(isNumeric(input))
        _value = input.toDouble()
    }

    private fun isNumeric(value: String): Boolean {
        return value.toDouble() != null
    }
}
