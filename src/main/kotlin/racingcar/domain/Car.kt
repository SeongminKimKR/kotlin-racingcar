package racingcar.domain

class Car(
    private val name: CarName,
    private val location: CarLocation,
) {
    fun move() {
        location.increase()
    }

    fun getLocationValue() = location.value

    fun getNameValue() = name.value

    companion object {
        fun toCarHistory(car: Car) = CarHistory(car.name.value, car.location.value)
    }
}
