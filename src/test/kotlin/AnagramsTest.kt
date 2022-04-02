import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class AnagramsTest {

    @Test
    fun testAnagramValid() {
        val s1 = "garden"
        val s2 = "danger"

        assertTrue(Anagrams.isValid(s1, s2))
    }

    @Test
    fun tesAnagramValid2() {
        val s1 = "salesmen"
        val s2 = "nameless"

        assertTrue(Anagrams.isValid(s1, s2))
    }

    @Test
    fun testAnagramInvalid() {
        val s1 = "coca"
        val s2 = "calo"

        assertFalse(Anagrams.isValid(s1, s2))
    }

    @Test
    fun testAnagramValidSort() {
        val s1 = "garden"
        val s2 = "danger"

        assertTrue(Anagrams.isValidSort(s1, s2))
    }

    @Test
    fun tesAnagramValid2Sort() {
        val s1 = "salesmen"
        val s2 = "nameless"

        assertTrue(Anagrams.isValidSort(s1, s2))
    }

    @Test
    fun testAnagramInvalidSort() {
        val s1 = "coca"
        val s2 = "calo"

        assertFalse(Anagrams.isValidSort(s1, s2))
    }
}