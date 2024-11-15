package racingcar.view.attribute

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FunSpec
import java.lang.IllegalArgumentException

class InputAttributeTest : FunSpec({

    test("입력 값은 빈값이나 null이면 예외를 던진다.") {

        shouldThrow<IllegalArgumentException> { InputViewAttribute("", null) }
        shouldThrow<IllegalArgumentException> { InputViewAttribute("", "") }
        shouldThrow<IllegalArgumentException> { InputViewAttribute(null, "") }
        shouldThrow<IllegalArgumentException> { InputViewAttribute(null, null) }
    }

    test("입력 값은 양수가 아니면 예외를 던진다.") {

        shouldThrow<IllegalArgumentException> { InputViewAttribute("-1", "0") }
        shouldThrow<IllegalArgumentException> { InputViewAttribute("0", "-1") }
        shouldThrow<IllegalArgumentException> { InputViewAttribute("-1", "-1") }
        shouldThrow<IllegalArgumentException> { InputViewAttribute("0", "0") }
    }
})
