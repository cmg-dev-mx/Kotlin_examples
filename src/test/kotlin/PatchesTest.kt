import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

internal class PatchesTest {

    @Test
    fun validateTwoZones() {
        val input1 = 2
        val input2 = 2
        val input3 = arrayOf(intArrayOf(1,0), intArrayOf(0,1))

        assertEquals(2, Patches.find(input1, input2, input3))
    }

    @Test
    fun validateOneZone() {
        val input1 = 2
        val input2 = 2
        val input3 = arrayOf(intArrayOf(1,0), intArrayOf(1,1))

        assertEquals(1, Patches.find(input1, input2, input3))
    }

    @Test
    fun validateOneBigZone() {
        val input1 = 4
        val input2 = 4
        val input3 = arrayOf(
            intArrayOf(1,1,1,1),
            intArrayOf(1,0,0,1),
            intArrayOf(0,0,0,1),
            intArrayOf(1,1,1,1)
        )

        assertEquals(1, Patches.find(input1, input2, input3))
    }
}