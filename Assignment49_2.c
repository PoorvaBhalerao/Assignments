//Consider Singly linear Linked list to solve following problems
//Check Whether all the elements are positive
//bool CheckAllPositive(PNODE head);

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE first, int no)
{
    PNODE newn = NULL;

    newn =(PNODE)malloc(sizeof(NODE));
    newn->data = no;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        newn->next = *first;
        *first = newn;
    }
}

bool CheckAllPositive(PNODE first)
{
    bool bFlag = true;
    while(first != NULL)
    {
        if((first->data) < 0)
        {
            bFlag = false;
            break;
        }
       
        first = first->next;
    }  
    return bFlag; 
}


void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first->next;
    }
    printf("NULL\n\n");
}

int main()
{
    PNODE head = NULL;
    bool bRet = false;

    InsertFirst(&head, 17);
    InsertFirst(&head, 115);
    InsertFirst(&head, 11);
    InsertFirst(&head, 4750);
    InsertFirst(&head, 65);
    InsertFirst(&head, 48);
    InsertFirst(&head, 305);
    InsertFirst(&head, 12);
    InsertFirst(&head, 45);

    Display(head);

    bRet = CheckAllPositive(head);

    if(bRet == true)
    {
        printf("All the elements are positve\n");
    }
    else
    {
        printf("All elements are not positive\n");
    }


    return 0;
}
