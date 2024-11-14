package racingcar

import racingcar.domain.Cars
import racingcar.view.InputView
import racingcar.view.ResultView

object GameProcessor {
    fun play() {
        val config = InputView().parse()
        val cars = Cars(config.carCount)

        // TODO 한 회수 마다 움직이는 함수 구현

        ResultView().resolve(cars)
    }
}
