cmake_minimum_required(VERSION 4.0)
project(codadvent C)

set(CMAKE_C_STANDARD 11)
set(CMAKE_RUNTIME_OUTPUT_DIRECTORY ${CMAKE_BINARY_DIR}/bin)

include_directories(.)

# main program
add_executable(codadvent
        hello_world.c
        hello_world.h
        main.c)

# unit tests
add_executable(codadvent_tests
        test_hello_world.c
        hello_world.c
        hello_world.h)
