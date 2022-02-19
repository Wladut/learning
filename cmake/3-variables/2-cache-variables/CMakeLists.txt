cmake_minimum_required(VERSION 3.0)

#project(2-cache-variables)

message("NON_CACHE_VAR = ${NON_CACHE_VAR}")

set(NON_CACHE_VAR "Initial value")

message("NON_CACHE_VAR = ${NON_CACHE_VAR}")

message("CACHE_VAR = ${CACHE_VAR}")

set(CACHE_VAR "Initial value 2" CACHE STRING "Help me with this cache var" FORCE)

message("CACHE_VAR = ${CACHE_VAR}")
