package racingcar.domain

class Car {
    var location: Int = 0
        private set

    fun move(randomValue: Int) {
        if (canMove(randomValue)) {
            location++
        }
    }

    private fun canMove(randomValue: Int) = randomValue >= MIN_VALUE_TO_MOVE_CAR

    companion object {
        private const val MIN_VALUE_TO_MOVE_CAR = 4
    }
}
