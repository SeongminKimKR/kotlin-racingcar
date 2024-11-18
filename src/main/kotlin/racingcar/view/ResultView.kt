package racingcar.view

import racingcar.domain.CarHistory

class ResultView {
    fun resolveTitle() {
        println("실행 결과")
    }

    fun resolveCarsInfo(data: List<CarHistory>) {
        data.forEach {
            print("${it.nameValue} : ")
            println("-".repeat(it.locationValue))
        }
        println()
    }

    fun resolveGameWinner(data: GameWinnerResultViewModel) {
        println("${data.winners.joinToString(", ")}가 최종 우승했습니다.")
    }
}
