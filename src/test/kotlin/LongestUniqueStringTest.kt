import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LongestUniqueStringTest {

    @Test
    fun evaluateFirst() {
        assertEquals(3, LongestUniqueString.evaluate("abcabcbb"))
    }

    @Test
    fun evaluateSecond() {
        assertEquals(1, LongestUniqueString.evaluate("bbbbb"))
    }

    @Test
    fun evaluateThird() {
        assertEquals(3, LongestUniqueString.evaluate("pwwkew"))
    }

    @Test
    fun evaluateFourth() {
        assertEquals(2, LongestUniqueString.evaluate("au"))
    }
}