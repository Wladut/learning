cmake_minimum_required(VERSION 3.0)

project(4-lists)

set(MY_LIST a b c d eee fff g)
message("LIST = ${MY_LIST}")

list(LENGTH MY_LIST MY_LIST_LEN)
message("LIST_LEN = ${MY_LIST_LEN}")

#if e do this we will have 4 items
set(MY_LIST2 "a;b;c;def")
list(LENGTH MY_LIST2 MY_LIST2_LEN)
message("MY_LIST2_LEN = ${MY_LIST2_LEN}")

#print element with index 2 from the list notation starts from 0
list(GET MY_LIST 2 MY_LIST_GET_RESULT)
message("MY_LIST_GET_RESULT = ${MY_LIST_GET_RESULT}")

#the command join joins all elements of the list with specified char
list(JOIN MY_LIST "-" MY_LIST_JOIN)
message("MY_LIST_JOIN = ${MY_LIST_JOIN}")

#Append in list
list(APPEND MY_LIST "abcd")
message("MY_LIST = ${MY_LIST}")

#Append 2 elements  to the  list
list(APPEND  MY_LIST "abcdef" "hhh")
message("MY_LIST = ${MY_LIST}")
