//Consider Singly linear Linked list to solve following problems
//Display Sum of digits of each node
//void SumDigits(PNODE head);

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

void SumDigits(PNODE first)
{
    int iDigit = 0,iSum= 0;
    while(first != NULL)
    {
        iSum = 0;
        while((first->data) != 0)
        {
            iDigit = (first->data) %10;
            iSum = iSum + iDigit;
            (first->data) = (first->data)/10;
        }
        printf("%d\t",iSum);
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

    InsertFirst(&head, 9);
    InsertFirst(&head, 115);
    InsertFirst(&head, 52);
    InsertFirst(&head, 4750);
    InsertFirst(&head, 65);
    InsertFirst(&head, 40);
    InsertFirst(&head, 305);
    InsertFirst(&head, 16);
    InsertFirst(&head, 45);

    Display(head);

    SumDigits(head);


    return 0;
}
