cmake_minimum_required(VERSION 3.0)

project(cmake-commandline)

include("D:\\git-projects\\learning\\cmake\\cmake-commandline\\build\\conanbuildinfo.cmake")

add_executable(mainExec main.cpp)
target_link_libraries(mainExec ${CONAN_LIBS})