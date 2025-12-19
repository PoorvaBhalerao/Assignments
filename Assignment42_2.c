//Write a program search last occurence of particular element from singly linear linked list
//Function should return position at which element is found

//i/p linked list:|10|->|20|->|30|->|40|->|50|->|30|->|70|
//element:30
//output: 6

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

int SearchLastOcc(PNODE first, int No)
{
    int iPos = 1;
    int lstocc = 0;

    while(first->next != NULL)
    {
        if((first->data) == No)
        {
            lstocc = iPos;
            
        }
        iPos++;
        first = first->next;
    }
    return lstocc;
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

    iRet = SearchLastOcc(head, 30);
    printf("Last occurence is: %d\n",iRet);
    
    return 0;
}