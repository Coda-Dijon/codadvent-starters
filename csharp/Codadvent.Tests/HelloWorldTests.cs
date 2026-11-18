namespace Codadvent.Tests;

public class HelloWorldTests
{
    [Fact]
    public void Says_hello_world() => Assert.Equal("Hello World!", HelloWorld.SayHello());
}
