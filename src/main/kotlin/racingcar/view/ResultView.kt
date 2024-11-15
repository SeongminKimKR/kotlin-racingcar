package racingcar.view

import racingcar.view.dto.ResultDto

class ResultView {
    fun resolve(request: ResultDto) {
        request.cars.getCars().forEach {
            println("-".repeat(it.location))
        }

        println()
    }
}
