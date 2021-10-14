#include <stdio.h>

struct Person{
    char* name;
    int age;
    char* born;
};

int main()
{
    //initialize struct #1
    struct Person person1;
    person1.name = "Vlad";
    person1.age = 26;
    person1.born = "1994";


    int a = 6;
    int *b = &a;

    printf("%d", b);  // address of a;
    printf("\n%d", *b); // value of a;
    printf("\n%d", &b); // address of pointer;

    int **c = &b;
    
    printf("\n%d", c); // address of b -> equivalent with &b
    printf("\n%d", *c); // address of a -> equivalent with b;
    printf("\n%d", **c); // value of a -> equivalent with *b;


    return 0;
}

