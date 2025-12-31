// Consider Singly Linear Linked List to solve following problems
//Count numbers less than no
// int CountLess(PNODE head, int no);

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

int CountLess(PNODE first, int no)
{
    int iCount = 0;
    while(first != NULL)
    {
        if((first->data) < no)
        {
            iCount++;
        }
        first = first->next;
    }
    return iCount;
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
    int iRet = 0, iValue = 0;
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

    printf("Enter a number: ");
    scanf("%d", &iValue);

    iRet = CountLess(head, iValue);

    printf("Count of Numbers less than %d is: %d", iValue, iRet);

    return 0;
}
