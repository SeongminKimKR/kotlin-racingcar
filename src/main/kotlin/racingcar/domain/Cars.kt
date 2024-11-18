package racingcar.domain

import racingcar.util.NumberGenerator

class Cars(private val cars: List<Car>) {
    fun tryMove(numberGenerator: NumberGenerator) {
        cars.forEach {
            if (CarMoveStrategy(numberGenerator).canMove()) {
                it.move()
            }
        }
    }

    fun getCars() = cars

    companion object {
        fun createCars(names: String?): Cars {
            require(!names.isNullOrBlank()) { "입력 값은 널이나 빈 값이 될 수 없습니다." }
            return Cars(names.split(",").map { Car(CarName(it), CarLocation(CarLocation.DEFAULT_VALUE)) })
        }

        fun toCarHistories(data: Cars) = data.cars.map { CarHistory(it.getNameValue(), it.getLocationValue()) }.toList()
    }
}
