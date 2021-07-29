/*
    C Preprocessor Directives

    #define -> used for substitution
    #error
    #include
    #elif
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

#define COUNT 10
#define GREETING "Hello!"

// #include "myHeader.h" -> looks into local directory (same as the 
//source code)

int main()
{
    int a;

    srand((unsigned)time(NULL));
    for(a=0; a<COUNT; a++)
        printf("%3d ", rand()%100+1);
    putchar('\n');
   
    printf(GREETING);
    return 0;
}