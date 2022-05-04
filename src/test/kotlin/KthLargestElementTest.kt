import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class KthLargestElementTest {

    @Test
    fun test() {
        val arr = arrayOf(4, 2, 9, 7, 5,6,7,1,3)
        val k  = 3
        assertEquals(6, KthLargestElement.find(arr, k))
    }
}