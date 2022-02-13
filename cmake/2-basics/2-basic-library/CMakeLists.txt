cmake_minimum_required(VERSION 3.0)

project(basic-library)

add_library(mathLib Math.cpp)

add_executable(main main.cpp)
add_executable(main2 main2.cpp)

target_link_libraries(main mathLib)
target_link_libraries(main2 mathLib)
