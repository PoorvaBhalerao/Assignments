// //Consider Singly linear Linked list to solve following problems
//Display Elements greater than average
//void DisplayGreaterThanAvg(PNODE head);

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

void DisplayGreaterThanAvg(PNODE first)
{
    int iCount = 0, iSum = 0;
    float fAvg = 0.0f;
    PNODE temp = first;
    
    while(first != NULL)
    {
        iSum = iSum + first->data;
        first = first->next;
        iCount++;
    }  

    fAvg = (float)iSum/iCount;

    while(temp != NULL)
    {
        if(fAvg < temp->data)
        {
            printf("%d\t",temp->data);
        }
        temp = temp->next;
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

    InsertFirst(&head, 7);
    InsertFirst(&head, 115);
    InsertFirst(&head, 1111);
    InsertFirst(&head, 475);
    InsertFirst(&head, 65);
    InsertFirst(&head, 48);
    InsertFirst(&head, 35);
    InsertFirst(&head, 12);
    InsertFirst(&head, 45);

    Display(head);

    DisplayGreaterThanAvg(head);
    return 0;
}
