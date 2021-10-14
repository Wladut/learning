#include <stdlib.h> //include dynamic memory management, random nr gen, sort, convert..
#include <stdio.h>  //perform input/output operations

void create();

struct node 
{
    int data;
    struct node *next;
};

struct node *start = NULL;

int main()
{
    create();
}

void create()
{
    struct node *temp, *pointer;
    //assign memory to struct
    temp=(struct node *) malloc(sizeof(struct node));
    if(temp == NULL)
    {
        printf("Out of memory");
        exit(0);
    }
    printf("Enter the data value for the node:");
    scanf("%d", &temp -> data);
    temp -> next = NULL;
    if(start == NULL){
        start = temp;
    }
    else
    {
        pointer = start;
        while (pointer -> next!=NULL)
        {
            pointer = pointer -> next;
        }
        pointer -> next = temp;
    }
}