package racingcar.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeIn

class GameWinnerSelectorTest : StringSpec({

    "우승자는 위치 값이 가장 큰 자동차(들)이다." {
        val cars =
            Cars(
                listOf(
                    Car(CarName("a"), CarLocation(1)),
                    Car(CarName("b"), CarLocation(2)),
                    Car(CarName("c"), CarLocation(2)),
                    Car(CarName("d"), CarLocation(0)),
                ),
            )

        val actualResults = GameWinnerSelector.decideWinners(cars)
        val expectedResults = listOf("b", "c")

        actualResults.forEach { it shouldBeIn expectedResults }
    }
})
