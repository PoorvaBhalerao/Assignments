//Write a program which returns addition of digits of number from singly linear linked list
//i/p linked list:|11|->|20|->|57|->|47|->|50|->|17|->|70|
//output: 2   2  12   11  5   8   7

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

void DisplayAddition(PNODE first)
{
    int iDigit = 0, iSum = 0;

    while(first != NULL)
    {
        iSum = 0;
        while((first->data) != 0)
        {
            iDigit = (first->data)%10;
            iSum = iSum+ iDigit;
            (first->data) = (first->data)/10;
        }
        printf("%d\t",iSum);
        first = first->next;
    }

    
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

    InsertFirst(&head, 70);
    InsertFirst(&head, 17);
    InsertFirst(&head, 50);
    InsertFirst(&head, 47);
    InsertFirst(&head, 57);
    InsertFirst(&head, 20);
    InsertFirst(&head, 11);

    DisplayAddition(head);
    
    return 0;
}