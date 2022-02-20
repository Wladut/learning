cmake_minimum_required(VERSION 3.0)

project(if_example)

set(USE_DEBUG_CODE TRUE) #or ON

#if(USE_DEBUG_CODE)
if(TRUE) # same as the above command
	message("Using debug code")
else()
	message("Using release code")
endif()

#in real project:

option(USE_DEBUG_CODE_OPTION "Debug code" OFF)

if(USE_DEBUG_CODE_OPTION)
	message("Debug code")
else()
	message("Release code")
endif()

###################################################################################################

set(A FALSE)
set(B FALSE)

if(A AND NOT B)
	message("True")
else()
	message("False") #will be false
endif()

if("") #equivalent with NON_EXISTING_VARIABLE
	message("This is not false")
else()
	message("This is false") #this will be printed because "" means false
endif()

message("NON_EXISTING_VARIABLE = [${NON_EXISTING_VARIABLE}]") # [] will be printed

###################################################################################################

find_package(Filesystem)

message("Filesystem_FOUND = ${Filesystem_FOUND} Filesystem_DIR = ${Filesystem_DIR} - package found")

if(Filesystem_FOUND) #we can also check this variable: Filesystem_DIR
	message("Package was found")
else()
	message("Package was not found")
endif()

####################################################################################################

set(A 1) # number different than 0 is true, something below 0 is also true or float X.X is also true also 0.0
set(B 0) # 0 is false

if(A)
	message("True")
else()
	message("False")
endif()

if(B)
	message("True")
else()
	message("False")
endif()





