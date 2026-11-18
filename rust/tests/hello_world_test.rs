use codadvent::hello_world::say_hello;

#[test]
fn says_hello_world() {
    assert_eq!(say_hello(), "Hello World!");
}
