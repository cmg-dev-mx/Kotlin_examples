import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

internal class ValidIpsTest {

    @Test
    fun validateIp1() {
        val s = "1111"
        val expected = listOf("1.1.1.1")
        assertContentEquals(expected, ValidIps.invoke(s))
    }

    @Test
    fun validateIp2() {
        val s = "25525511135"
        val expected = listOf("255.255.11.135", "255.255.111.35")
        assertContentEquals(expected, ValidIps.invoke(s))
    }

    @Test
    fun validateIp3() {
        val s = "25505011535"
        val expected = emptyList<String>()
        assertContentEquals(expected, ValidIps.invoke(s))
    }


}