cmake_minimum_required(VERSION 3.0)

project(5-numeric-variables)

set(x 1)
set(y 2)
set(z 4)

#calculate (x+y)*z

math(EXPR result "(${x} + ${y})*${z}")
message("result = ${result}")
