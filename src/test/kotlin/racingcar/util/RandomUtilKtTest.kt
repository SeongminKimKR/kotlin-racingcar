package racingcar.util

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.ranges.shouldBeIn

class RandomUtilKtTest : FunSpec({

    test("getRandom()은 입력 구간 사이의 난수를 반환한다.") {
        val range = 0..9
        getRandom(range) shouldBeIn range
    }
})
