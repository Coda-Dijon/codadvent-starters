from codadvent.hello_world import say_hello


def test_says_hello_world():
    assert say_hello() == "Hello World!"
