// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun `Mark of 55 is a Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of 70 is a Distinction`() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun `Mark between 70 and 100 gives grade of Distinction`() {
        assertEquals("Distinction", grade(70), "mark=70")
        assertEquals("Distinction", grade(85), "mark=85")
        assertEquals("Distinction", grade(100), "mark=100")
    }
}
