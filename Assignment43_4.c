//Write a program which returns second maximum number from singly linear linked list
//i/p linked list:|11|->|20|->|57|->|47|->|50|->|17|->|70|
//output: 57

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

int SecondMax(PNODE first)
{
    int iMax1 = 0;
    int iMax2 = 0;

    if(first == NULL || first->next == NULL)
    {
        return -1;   // not possible
    }

    iMax1 = first->data;
    iMax2 = first->data;
    first = first->next;

    while(first != NULL)
    {
        if(first->data > iMax1)
        {
            iMax2 = iMax1;
            iMax1 = first->data;
        }
        else if(first->data > iMax2 && first->data < iMax1)
        {
            iMax2 = first->data;
        }
        first = first->next;
    }

    return iMax2;
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

    iRet = SecondMax(head);
    printf("Second Maximum element is: %d\n",iRet);
    
    return 0;
}