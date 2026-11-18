package codadvent

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloWorldSpec extends AnyFlatSpec with Matchers:
  "HelloWorld" should "say hello world" in {
    HelloWorld.sayHello() shouldBe "Hello World!"
  }
