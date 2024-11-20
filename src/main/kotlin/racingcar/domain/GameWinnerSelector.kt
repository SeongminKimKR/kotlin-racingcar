package racingcar.domain

object GameWinnerSelector {
    fun decideWinners(histories: List<CarHistory>): List<String> {
        val maxLocation = histories.maxOf { it.locationValue }
        return histories.filter { it.locationValue == maxLocation }.map { it.nameValue }
    }
}
