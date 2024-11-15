package racingcar.domain

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CarsTest : FunSpec({

    test("Cars는 생성시 인자로 받은 값의 크기를 갖고 있다") {
        Cars(4).getCars().size shouldBe 4
    }
})
