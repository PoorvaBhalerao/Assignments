//Write a program which returns prime number from singly linear linked list
//i/p linked list:|11|->|20|->|50|->|47|->|50|->|17|->|70|
//output: 11  17

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

void DisplayPrime(PNODE first)
{
    int iCnt = 1;
    bool bFlag  = false;

    while(first != NULL)
    {
        if(first->data > 1)
        {
            bFlag = true;           //assume prime

            for(iCnt = 2; iCnt <= (first->data)/2; iCnt++)
            {
                
                if(((first->data) % iCnt) == 0)
                {
                    bFlag = false;
                    break;
                }
            }
            
            
            if(bFlag == true)
            {
                printf("%d\t",first->data);
            }
            
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
    InsertFirst(&head, 17);
    InsertFirst(&head, 50);
    InsertFirst(&head, 47);
    InsertFirst(&head, 57);
    InsertFirst(&head, 20);
    InsertFirst(&head, 11);

    DisplayPrime(head);
    
    return 0;
}