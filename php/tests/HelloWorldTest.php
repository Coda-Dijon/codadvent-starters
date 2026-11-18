<?php

declare(strict_types=1);

use Codadvent\HelloWorld;

it('says hello world', function () {
    expect(HelloWorld::sayHello())->toBe('Hello World!');
});
