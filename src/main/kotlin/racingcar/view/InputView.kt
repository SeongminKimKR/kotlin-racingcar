package racingcar.view

import racingcar.view.attribute.InputViewAttribute

class InputView {
    fun parse(): InputViewAttribute {
        println(CAR_COUNT_SETTING_MESSAGE)
        val carCount = readLine()
        println(TRY_COUNT_SETTING_MESSAGE)
        val playCount = readLine()

        return InputViewAttribute(carCountInput = carCount, playCountInput = playCount)
    }

    companion object {
        private const val CAR_COUNT_SETTING_MESSAGE = "자동차 대수는 몇 대인가요?"
        private const val TRY_COUNT_SETTING_MESSAGE = "시도할 횟수 몇 회인가요?"
    }
}
