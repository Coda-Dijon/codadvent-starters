package codadvent

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HelloWorldTest {
    @Test
    fun `says hello world`() {
        assertThat(HelloWorld.sayHello()).isEqualTo("Hello World!")
    }
}
