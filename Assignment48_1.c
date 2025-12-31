//Consider Singly linear Linked list to solve following problems
//Replace Even numbers with zero
//void ReplaceEven(PNODE head);

#include<stdio.h>
#include<stdlib.h>

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

void ReplaceEven(PNODE first)
{
    while(first != NULL)
    {
        if((first->data) % 2 == 0)
        {
            first->data = 0;
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

    InsertFirst(&head, 17);
    InsertFirst(&head, 115);
    InsertFirst(&head, 11);
    InsertFirst(&head, 4750);
    InsertFirst(&head, 65);
    InsertFirst(&head, 40);
    InsertFirst(&head, 305);
    InsertFirst(&head, 13);
    InsertFirst(&head, 45);

    Display(head);

    ReplaceEven(head);

    Display(head);


    return 0;
}
