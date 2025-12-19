//Write a program which returns addition of all elements from singly linear linked list
//i/p linked list:|10|->|20|->|30|->|40|->|50|->|30|->|70|
//output: 250

#include<stdio.h>
#include<stdlib.h>

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
    InsertFirst(&head, 30);
    InsertFirst(&head, 50);
    InsertFirst(&head, 40);
    InsertFirst(&head, 30);
    InsertFirst(&head, 20);
    InsertFirst(&head, 10);

    iRet = Addition(head);
    printf("Addition is: %d\n",iRet);
    
    return 0;
}