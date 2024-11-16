package racingcar.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import racingcar.util.FakeRandomGenerator

class RacingGameTest : FunSpec({

    test("tryMove()는 난수 값이 최소 기준 값 이상이면 1칸 움직인다.") {
        val racingGame = RacingGame(2, FakeRandomGenerator())
        racingGame.tryMove()
        racingGame.getLocations().forEach { it shouldBe 1 }
    }
})
