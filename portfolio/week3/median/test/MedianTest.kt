// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    "Exception when size=1" {
        median(listOf(7f)) shouldBe 7f
    }

    "Exception when size=2" {
        median(listOf(2f, 6f)) shouldBe 4f
    }

    "Exception when size=3" {
        median(listOf(4f, 2f, 6f)) shouldBe 4f
    }

    "Exception when size=4" {
        median(listOf(5f, -2f, 6f, 8f)) shouldBe 5.5f
    }
    // Write four more tests here
})
