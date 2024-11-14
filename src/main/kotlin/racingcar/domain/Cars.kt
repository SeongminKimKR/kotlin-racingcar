package racingcar.domain

class Cars(size: Int) {
    private val cars: List<Car>

    init {
        val temp = mutableListOf<Car>()
        repeat(size) { temp.add(Car()) }
        cars = temp
    }

    fun getCars() = cars
}
