package racingcar.view

import racingcar.config.RacingCarConfig

class InputView {
    fun parse(): RacingCarConfig {
        println("자동차 대수는 몇 대인가요?")
        val carCount = readLine()
        println("시도할 횟수 몇 회인가요?")
        val playCount = readLine()

        return RacingCarConfig(carCountInput = carCount, playCountInput = playCount)
    }
}
