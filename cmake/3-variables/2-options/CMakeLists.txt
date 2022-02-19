cmake_minimum_required(VERSION 3.0)

project(2-options)

#different types of variables

set(CACHE_VAR "Initial value" CACHE STRING "Some documentation")

set(CACHE_VAR_FILE_PATH "D:\\git-projects\\learning\\cmake\\3-variables\\2-options\\CMakeLists.txt" CACHE FILEPATH "Some text FILE PATH")

set(CACHE_VAR_PATH "D:\\git-projects\\learning\\cmake\\3-variables\\2-options\\" CACHE PATH "Some text PATH")

#this internal variable cannot be seen, it is hidden from gui interface tools
set(CACHE_VAR_INTERNAL "Text" CACHE INTERNAL "Some text INTERNAL VAR")

#how to declare option
option(MY_OPTION "Help for MY_OPTION" OFF) #can be ON/OFF - cache and boolean variable

#it will be the same as option
set(MY_OPTION2 OFF CACHE BOOL "Help for MY_OPTION2")
