// Consider Singly Linear Linked List to solve following problems
//Replace negative number with zero and display
//void ReplaceNegative(PPNODE head);

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

void ReplaceNegative(PNODE first)
{
    while(first != NULL)
    {
        if(((first)->data) < 0)
        {
            (first)->data = 0;
        }
        first = (first)->next;
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
    bool bRet = false;
    PNODE head = NULL;

    InsertFirst(&head, 95);
    InsertFirst(&head, 115);
    InsertFirst(&head, -52);
    InsertFirst(&head, 40);
    InsertFirst(&head, 65);
    InsertFirst(&head, 40);
    InsertFirst(&head, -35);
    InsertFirst(&head, 16);
    InsertFirst(&head, -40);

    Display(head);

    ReplaceNegative(head);

    Display(head);

    return 0;
}
