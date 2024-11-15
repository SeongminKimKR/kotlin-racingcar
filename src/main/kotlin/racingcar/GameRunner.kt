package racingcar

import racingcar.domain.Cars
import racingcar.util.getRandom
import racingcar.view.ResultView
import racingcar.view.attribute.InputViewAttribute
import racingcar.view.attribute.ResultViewAttribute

object GameRunner {
    private const val MIN_VALUE_TO_MOVE_CAR = 4
    private val RANDOM_VALUE_RANGE = 0..9

    fun play(input: InputViewAttribute) {
        val cars = Cars(input.carCount)

        println("실행 결과")

        repeat(input.playCount) {
            cars.getCars().forEach { car ->
                if (canMove(getRandom(RANDOM_VALUE_RANGE))) {
                    car.move()
                }
            }
            ResultView().resolve(ResultViewAttribute(cars))
        }
    }

    private fun canMove(randomValue: Int) = randomValue >= MIN_VALUE_TO_MOVE_CAR
}
