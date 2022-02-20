cmake_minimum_required(VERSION 3.0)

set(listA 1 2 3 4)
set(listB a b c d)
set(listC ab cd de fg)
set(a 1)

foreach(currentElement ${a} b c d e f)
	message("currentElement = ${currentElement}")
endforeach()

foreach(element IN LISTS listA)
	message("element = ${element}")
endforeach()

foreach(elements IN LISTS listA listB ITEMS x y z) # equivalent with: foreach(elements IN LISTS listA ITEMS x y LISTS LISTB
	message("elements = ${elements}")
endforeach()

#combine elements first from listA second from listB we need to use ZIP_LISTS
foreach(elem IN ZIP_LISTS listA listB listC)
	message("elem = ${elem_0} and ${elem_1} and ${elem_2}")
endforeach()

#another option for ZIP_LISTS
foreach(elem1 elem2 IN ZIP_LISTS listA listB)
	message("elem1 = ${elem1} and elem2 = ${elem2}")
endforeach()

#for classic c/c++ for: for(int i = 0; i<10; i++) -> We need to use keyword: RANGE
foreach(index RANGE 0 9)
	message("index = ${index}")
endforeach()
