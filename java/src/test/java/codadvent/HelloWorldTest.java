package codadvent;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HelloWorldTest {
    @Test
    void says_hello_world() {
        assertThat(HelloWorld.sayHello()).isEqualTo("Hello World!");
    }
}
