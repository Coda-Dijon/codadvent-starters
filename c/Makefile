CC      ?= cc
CFLAGS  ?= -std=c11 -Wall -Wextra -I.
BIN_DIR := build/bin

.PHONY: all run test clean

all: $(BIN_DIR)/codadvent $(BIN_DIR)/codadvent_tests

$(BIN_DIR):
	mkdir -p $@

# main program
$(BIN_DIR)/codadvent: main.c hello_world.c hello_world.h | $(BIN_DIR)
	$(CC) $(CFLAGS) main.c hello_world.c -o $@

# unit tests
$(BIN_DIR)/codadvent_tests: test_hello_world.c hello_world.c hello_world.h | $(BIN_DIR)
	$(CC) $(CFLAGS) test_hello_world.c hello_world.c -o $@

run: $(BIN_DIR)/codadvent
	./$(BIN_DIR)/codadvent

test: $(BIN_DIR)/codadvent_tests
	./$(BIN_DIR)/codadvent_tests

clean:
	rm -f $(BIN_DIR)/codadvent $(BIN_DIR)/codadvent_tests
