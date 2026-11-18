COBC       ?= cobc
COBCFLAGS  ?= -Wall -fstatic-call
BIN_DIR    := build/bin

.PHONY: all run test clean

all: $(BIN_DIR)/codadvent $(BIN_DIR)/codadvent_tests

$(BIN_DIR):
	mkdir -p $@

# main program
$(BIN_DIR)/codadvent: src/main.cbl src/hello-world.cbl | $(BIN_DIR)
	$(COBC) -x $(COBCFLAGS) -o $@ src/main.cbl src/hello-world.cbl

# unit tests
$(BIN_DIR)/codadvent_tests: tests/test-hello-world.cbl src/hello-world.cbl | $(BIN_DIR)
	$(COBC) -x $(COBCFLAGS) -o $@ tests/test-hello-world.cbl src/hello-world.cbl

run: $(BIN_DIR)/codadvent
	./$(BIN_DIR)/codadvent

test: $(BIN_DIR)/codadvent_tests
	./$(BIN_DIR)/codadvent_tests

clean:
	rm -rf build
