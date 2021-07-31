/* header files are not the same as  libraries
   headers contain function prototypes, definitions, macros and so on
   comiler warning appears if header is  missing

   libraries -> provide common c language functions, missing libraries
   generate linker errors

    Linker -> clang 01_01-math.c -lm 
              - clang : compiler name
              - 01_01-math.c : source file name
              - -lm : l -> link and m -> math library on the system

              GCC compiler:
              gcc file_name.c -o file_name -> compile
              .\file_name -> run exe
*/

#include <stdio.h>
#include <math.h>

int main
{
   int w;
   for(w=0; w<10; w++)
   {
      puts(w);
   }
   return 0;
}