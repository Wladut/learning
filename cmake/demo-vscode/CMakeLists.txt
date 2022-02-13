# CMakeList.txt : Top-level CMake project file, do global configuration
# and include sub-projects here.
#
cmake_minimum_required (VERSION 3.8)

project ("demo-vscode")
message("Hello, World")

# Include sub-projects.
add_subdirectory ("demo-vscode")
