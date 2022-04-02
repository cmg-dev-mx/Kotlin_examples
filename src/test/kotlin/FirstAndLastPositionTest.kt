import kotlin.test.Test
import kotlin.test.assertContentEquals

class FirstAndLastPositionTest {

    @Test
    fun validateExistentTarget() {
        val arr = arrayOf(2, 4, 5, 5, 5, 5, 5, 7, 9, 9)
        val target = 5
        assertContentEquals(arrayOf(2, 6), FirstAndLastPosition.validate(arr, target))
    }

    @Test
    fun validateExistentTarget2() {
        val arr = arrayOf(2, 4, 4, 4, 5, 5, 5, 7, 9, 9)
        val target = 4
        assertContentEquals(arrayOf(1, 3), FirstAndLastPosition.validate(arr, target))
    }

    @Test
    fun validateNonExistentTarget() {
        val arr = arrayOf(2, 4, 4, 4, 5, 5, 5, 7, 9, 9)
        val target = 6
        assertContentEquals(arrayOf(-1, -1), FirstAndLastPosition.validate(arr, target))
    }

    @Test
    fun validateExistentTargetBinarySearch() {
        val arr = arrayOf(2, 4, 5, 5, 5, 5, 5, 7, 9, 9)
        val target = 5
        assertContentEquals(arrayOf(2, 6), FirstAndLastPosition.validateBinarySearch(arr, target))
    }

    @Test
    fun validateExistentTarget2BinarySearch() {
        val arr = arrayOf(2, 4, 4, 4, 5, 5, 5, 7, 9, 9)
        val target = 4
        assertContentEquals(arrayOf(1, 3), FirstAndLastPosition.validateBinarySearch(arr, target))
    }

    @Test
    fun validateNonExistentTargetBinarySearch() {
        val arr = arrayOf(2, 4, 4, 4, 5, 5, 5, 7, 9, 9)
        val target = 6
        assertContentEquals(arrayOf(-1, -1), FirstAndLastPosition.validateBinarySearch(arr, target))
    }
}