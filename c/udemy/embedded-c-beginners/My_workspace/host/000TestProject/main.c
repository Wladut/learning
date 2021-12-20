/*
 * main.c
 *
 *  Created on: 20 sept. 2021
 *      Author: Vladut
 */

//#include <stdio.h>
//
//int a;
//
//int main()
//{
//    a = 25;
//
//    {
//        int my_var; // dies outside of brackets
//        my_var = 45;
//
//        printf("001Value of the local variable 'my_var' is %d\n", my_var); // print 45
//        printf("002Value of the local variable 'a' is %d\n", a); // 25
//    }
//
//    int my_var; // compilation took initial value as 0, but normally will nt be 0.
//    my_var = my_var + 10;
//    printf("003Value of the local variable 'my_var' is %d\n", my_var); // 10
//
//    return 0;
//}
#include <stdio.h>

int main ()
{
    char a1 = 'A'; // ASCII code for A
    /*char a2 = 'p';
    char a3 = 'p';
    char a4 = 'l';
    char a5 = 'e';
    char a6 = ':';
    char a7 = ')';*/

    printf("Address of variable a1 = %p\n", &a1);
//    printf("Address of variable a2 = %p\n", &a2);
//    printf("Address of variable a3 = %p\n", &a3);
//    printf("Address of variable a4 = %p\n", &a4);
//    printf("Address of variable a5 = %p\n", &a5);
//    printf("Address of variable a6 = %p\n", &a6);
//    printf("Address of variable a7 = %p\n", &a7);
//    unsigned long int addressOfa1 = &a1; // wrong, we should use point data type char*
    // we can use type casting like:
    unsigned long long int addressOfa1 = (unsigned long long int) &a1;
    printf("Address of variable a1 = %llX\n", addressOfa1);
    return 0;
}
