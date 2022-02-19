cmake_minimum_required(VERSION 3.0)

project(3-strings)

string(FIND "abcdefghijkl" "abc" FIND_RESULT) # save 0 in FIND_RESULT
message(${FIND_RESULT})

string(FIND "abcdefghijkl" "def" FIND_RESULT) # save 3 in FIND_RESULT
message(${FIND_RESULT})

string(FIND "abcdefghijkl" "xxx" FIND_RESULT) # save -1 in FIND_RESULT
message(${FIND_RESULT})

#find the position of the last occuring
string(FIND "abcdefghijklabc" "abc" FIND_RESULT REVERSE) # save 12 in FIND_RESULT
message(${FIND_RESULT})

#replace command
string(REPLACE "abc" "ABC" REPLACE_RESULT "abcdefghijklabc")
message(${REPLACE_RESULT})

#append command
set(APPEND_INPUT "Append something to this")
string(APPEND APPEND_INPUT " now")
message(${APPEND_INPUT}) #there is no output variable

# make lower case string
string(TOLOWER "ABCDEF" TOLOWER_VAR)
message(${TOLOWER_VAR})

# make a variable to upper
string(TOUPPER ${APPEND_INPUT} TOUPPER_VAR)
message(${TOUPPER_VAR})
