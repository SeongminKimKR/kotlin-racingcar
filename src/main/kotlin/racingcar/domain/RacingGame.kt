package racingcar.domain

import racingcar.util.NumberGenerator

class RacingGame(
    private val cars: Cars,
    private val gameRound: GameRound,
    private val numberGenerator: NumberGenerator,
) {
    val carHistories = mutableListOf<List<CarHistory>>()

    fun play(): List<CarHistory> {
        while (!isEnd()) {
            cars.tryMove(numberGenerator)
            addHistory()
            gameRound.proceed()
        }

        return Cars.toCarHistories(cars)
    }

    fun isEnd() = gameRound.count == 0

    private fun addHistory() {
        carHistories.add(Cars.toCarHistories(cars))
    }
}
