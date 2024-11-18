package racingcar.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldBeIn
import io.kotest.matchers.equality.shouldBeEqualToComparingFields
import io.kotest.matchers.shouldBe
import racingcar.util.FakeRandomGenerator

class RacingGameTest : StringSpec({

    "경주게임은 참가한 게임이 끝날 때 까지 자동차들을 전진에 대한 조작을 할 수 있다." {
        val cars = Cars.createCars("a,b,c")
        val racingGame = RacingGame(cars, GameRound("2"), FakeRandomGenerator(mutableListOf(1, 2, 4, 4, 4, 4)))

        racingGame.play()

        racingGame.isEnd() shouldBe true
    }

    "경주게임은 자동차 정보를 조회할 수 있다." {
        val cars = Cars.createCars("a,b,c")
        val racingGame = RacingGame(cars, GameRound("1"), FakeRandomGenerator(mutableListOf()))

        val expectedResults = listOf(CarHistory("a", 0), CarHistory("b", 0), CarHistory("c", 0))
        val actualResults = racingGame.getCarHistories()

        actualResults.zip(expectedResults).forEach { (actual, expected) ->
            actual shouldBeEqualToComparingFields expected
        }
    }

    "경주게임은 우승자 정보를 조회할 수 있다." {
        val cars = Cars.createCars("a,b,c")
        val racingGame = RacingGame(cars, GameRound("1"), FakeRandomGenerator(mutableListOf()))
        val expectedResults = listOf("a", "b", "c")

        val winners = racingGame.getWinnerInfo()

        winners.forEach { it shouldBeIn expectedResults }
    }
})
