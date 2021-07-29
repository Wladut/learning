/*
    C Preprocessor Directives

    #define -> used for substitution otherwise const in function can be used
    #error -> define error
    #include -> include  libraries/headers
    #elif -> this is used with #ifdef, #ifndef, #ifdef
    #if
    #line
    #else
    #ifdef
    #pragma
    #endif
    #ifndef
    #undef

*/


#include <stdio.h> //-> looks into default locations directories
#include <stdlib.h>
#include <time.h>
#include <math.h>

#define COUNT 10
#define GREETING "Hello! "
#define charout(a) putc(a,stdout) //-> define used to create macros
// it is like a function but it is expanded into putc function

// #include "myHeader.h" -> looks into local directory (same as the 
//source code)

//#error Error

int main()
{
    int a;

    srand((unsigned)time(NULL));
    for(a=0; a<COUNT; a++)
        printf("%3d ", rand()%100+1);
    putchar('\n');
   
    printf(GREETING);

    charout('V');
    charout('L');
    charout('A');
    charout('D');

 //   GREETING = "Hy"; -> error, cannot be modified same as final java keyword
    const char HELLO[] = "HELLO";
 //   HELLO = "HY"; -> error, cannot be modified same as final java keyword

    return 0;
}