//Write a program which returns perfect number from singly linear linked list
//i/p linked list:|10|->|6|->|30|->|40|->|50|->|28|->|70|
//output: 6     28

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

void DisplayPerfect(PNODE first)
{
    int iCnt = 1;
    int iSum = 0;

    while(first != NULL)
    {
        iSum = 0;
        for(iCnt = 1; iCnt <= (first->data)/2; iCnt++)
        {
            if(((first->data) % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if((first ->data) == iSum)
        {
            printf("%d\t",first->data);
        }

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
    int iRet = 0;

    InsertFirst(&head, 70);
    InsertFirst(&head, 6);
    InsertFirst(&head, 50);
    InsertFirst(&head, 40);
    InsertFirst(&head, 28);
    InsertFirst(&head, 20);
    InsertFirst(&head, 10);

    DisplayPerfect(head);
    
    return 0;
}