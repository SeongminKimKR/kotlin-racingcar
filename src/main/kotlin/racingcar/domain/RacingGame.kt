package racingcar.domain

import racingcar.util.NumberGenerator

class RacingGame(
    private val cars: Cars,
    private val gameRound: GameRound,
    private val numberGenerator: NumberGenerator,
) {
    val carHistories = mutableListOf<List<CarHistory>>()

    fun play() {
        while (!isEnd()) {
            cars.tryMove(numberGenerator)
            addHistory()
            gameRound.proceed()
        }
    }

    fun isEnd() = gameRound.count == 0

    fun getWinnerInfo(): List<String> = GameWinnerSelector.decideWinners(cars)

    private fun addHistory() {
        carHistories.add(Cars.toCarHistories(cars))
    }
}
