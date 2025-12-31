//Consider Singly linear Linked list to solve following problems
//Display Prime Numbers
//void DisplayPrime(PNODE head);

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

void DisplayPrime(PNODE first)
{
    int iCnt = 0;
    while(first != NULL)
    {
        for(iCnt = 2 ; iCnt <= (first->data)/2; iCnt++)
        {
            if((first->data) % iCnt == 0)
            {
                break;
            }
        }

        if(iCnt > (first->data)/2)
        {
            printf("%d\t", first->data);
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

    DisplayPrime(head);


    return 0;
}
