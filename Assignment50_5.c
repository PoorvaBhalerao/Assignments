//Consider Singly linear Linked list to solve following problems
//Count nodes at Nth position
//int CountNodes(PNODE head, int Pos);

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

int CountNodes(PNODE first, int Pos)
{
    int iSize = 0, iCnt = 0;
    iSize = Count(first);
    int iCount = 0;

    if(Pos < 1 || Pos > iSize)
    {
        printf("Invalid position\n");
        return -1;
    }

    if(Pos == 1)
    {
        iCount = 1;
    }
    else if(Pos == iSize)
    {
        iCount = iSize;        
    }
    else
    {
        for(iCnt = 1; iCnt <= Pos; iCnt++)
        {
            iCount++;
            first = first->next;
        }
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
    int ipos =0, iRet = 0;

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

    printf("Enter position of node: ");
    scanf("%d",&ipos);

    iRet =CountNodes(head, ipos);
    printf("Number of nodes till position are: %d\n",iRet);

    return 0;
}
