// //Consider Singly linear Linked list to solve following problems
//Display all negative elements absolute
//void MakeAbsolute(PNODE head);

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

void MakeAbsolute(PNODE first)
{
    while(first != NULL)
    {
        while((first->data) < 0)
        {
            first->data = -(first->data);
        }
        first = first->next;
    }  
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
    int iRet = 0;

    InsertFirst(&head, -7);
    InsertFirst(&head, 115);
    InsertFirst(&head, 1111);
    InsertFirst(&head, -4750);
    InsertFirst(&head, 65);
    InsertFirst(&head, 48);
    InsertFirst(&head, -305);
    InsertFirst(&head, 12);
    InsertFirst(&head, 45);

    Display(head);

    MakeAbsolute(head);

    Display(head);
    return 0;
}
