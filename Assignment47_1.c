//Consider Singly linear Linked list to solve following problems
//Print List in reverse order
//void DisplayReverse(PNODE head);

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

void DisplayReverse(PNODE first)
{
    if(first == NULL)
    {
        return;
    }

    DisplayReverse(first->next);
    printf("%d\t", first->data);
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

    InsertFirst(&head, 95);
    InsertFirst(&head, 115);
    InsertFirst(&head, 52);
    InsertFirst(&head, 40);
    InsertFirst(&head, 65);
    InsertFirst(&head, 40);
    InsertFirst(&head, 35);
    InsertFirst(&head, 16);
    InsertFirst(&head, 40);

    Display(head);

    DisplayReverse(head);


    return 0;
}
