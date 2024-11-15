package racingcar.view

import racingcar.view.attribute.ResultViewAttribute

class ResultView {
    fun resolve(request: ResultViewAttribute) {
        request.cars.getCars().forEach {
            println("-".repeat(it.location))
        }

        println()
    }
}
