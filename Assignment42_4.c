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

int Largest(PNODE first)
{
    int iMax = 0;
    iMax = first->data;
    while(first != NULL)
    {
        if((first->data)>iMax)
        {
            iMax = (first->data);
        }
        first = first->next;
    }
    return iMax;
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

    iRet = Largest(head);
    printf("Largest element is: %d\n",iRet);
    
    return 0;
}