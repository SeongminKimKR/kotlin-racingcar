package racingcar.view

import racingcar.view.dto.InputDto

class InputView {
    fun parse(): InputDto {
        println("자동차 대수는 몇 대인가요?")
        val carCount = readLine()
        println("시도할 횟수 몇 회인가요?")
        val playCount = readLine()

        return InputDto(carCountInput = carCount, playCountInput = playCount)
    }
}
