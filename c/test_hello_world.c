#include <assert.h>
#include <stdio.h>
#include <string.h>
#include "hello_world.h"

void says_hello_world(void) {
    assert(strcmp(codadvent_hello_world(), "Hello World!") == 0);
}

int main(void) {
    says_hello_world();

    printf("✅ All tests ran successfully\n");
    return 0;
}
