package racingcar.domain

import racingcar.util.NumberGenerator

class RacingGame(
    private val cars: Cars,
    private val gameRound: GameRound,
    private val numberGenerator: NumberGenerator,
) {
    fun play() {
        while (!isEnd()) {
            cars.tryMove(numberGenerator)
            gameRound.decrease()
        }
    }

    fun isEnd() = gameRound.count == 0

    fun getCarHistories() = Cars.toCarHistories(cars)

    fun getWinnerInfo() = GameWinnerSelector.decideWinners(cars)
}
