package racingcar.domain

object GameWinnerSelector {
    fun decideWinners(cars: Cars): List<String> {
        val maxLocation = cars.getCars().maxOf { it.getLocationValue() }
        return cars.getCars().filter { it.getLocationValue() == maxLocation }.map { it.getNameValue() }
    }
}
