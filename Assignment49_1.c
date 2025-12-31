//Consider Singly linear Linked list to solve following problems
//Difference between maximum element and minimum element;
//int Difference(PNODE head);

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

int Difference(PNODE first)
{
    int iMax = first->data;
    int iMin = first->data;
    while(first != NULL)
    {
        if((first->data) > iMax)
        {
            iMax = first->data;
        }

        if((first->data) < iMin)
        {
            iMin = first->data;
        }
        
        first = first->next;
    }  
    return iMax-iMin; 
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
    InsertFirst(&head, 48);
    InsertFirst(&head, 305);
    InsertFirst(&head, 12);
    InsertFirst(&head, 45);

    Display(head);

    iRet = Difference(head);

    printf("Difference is: %d\n",iRet);

    return 0;
}
