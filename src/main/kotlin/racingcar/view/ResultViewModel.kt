package racingcar.view

import racingcar.domain.history.CarHistory

data class CarsInfoResultViewModel(val carsInfo: List<CarHistory>)

data class GameWinnerResultViewModel(val winners: List<String>)
