package racingcar.view

import racingcar.domain.Cars

class ResultView {
    fun resolve(cars: Cars) {
        println("실행 결과")
        cars.getCars().forEach {
            println("-".repeat(it.location))
        }
    }
}
