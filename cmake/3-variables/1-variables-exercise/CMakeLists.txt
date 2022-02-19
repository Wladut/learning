cmake_minimum_required(VERSION 3.0)

#project(1-variables_exercise)

add_library(mathLib Math.cpp)

add_executable(main main.cpp)
add_executable(main2 main2.cpp)

target_link_libraries(main PUBLIC mathLib)
target_link_libraries(main2 PUBLIC mathLib)
