cmake_minimum_required(VERSION 3.0)

project(practical-example)

if(MVSC)
	#add_compile_options sets the flag for targets (executables and libraries) in the current directory or underneath it
	add_compile_options(/Wall)
else()
	add_compile_options(-Wall)
endif()
