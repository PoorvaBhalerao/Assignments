//Consider Singly linear Linked list to solve following problems
//Display Alternate Nodes
//void DisplayAlternate(PNODE head);

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

void DisplayAlternate(PNODE first)
{
    while(first != NULL)
    {
        printf("%d\t",first->data);
        first = first->next->next;
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

int Count(PNODE first)
{
    int iCount = 0;
    while(first != NULL)
    {
        iCount++;
        first = first->next;
    }
    return iCount;
}

int main()
{
    PNODE head = NULL;

    InsertFirst(&head, 1160);
    InsertFirst(&head, 1120);
    InsertFirst(&head, 575);
    InsertFirst(&head, 475);
    InsertFirst(&head, 65);
    InsertFirst(&head, 48);
    InsertFirst(&head, 35);
    InsertFirst(&head, 12);
    InsertFirst(&head, 4);

    Display(head);

    DisplayAlternate(head);

    return 0;
}
