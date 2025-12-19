//Write a program which returns perfect number from singly linear linked list
//i/p linked list:|11|->|20|->|57|->|47|->|50|->|17|->|70|
//output: 272

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

#pragma pack(1)
struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

int Addition(PNODE first)
{
    int iSum = 0;

    while(first != NULL)
    {
        iSum = iSum + (first->data);
        first = first->next;
        
    }    
    return iSum;
}

void InsertFirst(PPNODE first, int no)
{
    PNODE newn = NULL;
    newn = (PNODE)malloc(sizeof(NODE));
    newn -> data = no;
    newn -> next = NULL;

    if(*first == NULL)                  
    {
        *first = newn;
    }
    else                                
    {
        newn -> next = (*first);
        (*first) = newn;
    }
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head, 70);
    InsertFirst(&head, 17);
    InsertFirst(&head, 50);
    InsertFirst(&head, 47);
    InsertFirst(&head, 57);
    InsertFirst(&head, 20);
    InsertFirst(&head, 11);

    iRet = Addition(head);
    printf("Addition of all elements is: %d\n",iRet);
    
    return 0;
}