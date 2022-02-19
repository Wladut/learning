message("Hello message")

set(FOO "Foo value")
unset(FOO)
message("Foo = ${FOO}")

message("The  value of ON_EXISTENT_VARIABLE is : ${NON_EXISTENT_VARIABLE}")

#Semver = semantic versioning
#version 1.2.3
# major = 1 (we change the major when something is different and break the compatibility)
# minor = 2 (add feature but is not a breaking change, everything else backwards will be compatible)
# patch = 3 (patch is incremented when bug is fixed)

# - adding this will be the comment 

set(MY_PROJECT_MAJOR "1")
set(MY_PROJECT_MINOR "2")
set(MY_PROJECT_PATCH "3")

set(MY_PROJECT_VERSION ${MY_PROJECT_MAJOR}.${MY_PROJECT_MINOR}.${MY_PROJECT_PATCH})

message("MY_PROJECT_VERSION = ${MY_PROJECT_VERSION}")

######################################################
set(PLATFORM "WINDOWS")
#set(PLATFORM "UNIX")

set(HELLO_MESSAGE_WINDOWS "Hello, the platform is windows")
set(HELLO_MESSAGE_UNIX "Hello, the platform is Unix")

message(${HELLO_MESSAGE_${PLATFORM}})

set(HELLO_MESSAGE "Hello
World")
message(${HELLO_MESSAGE})

#we can use square format
set(COMMAND [[
echo "Hello world"
]])
message(${COMMAND})

