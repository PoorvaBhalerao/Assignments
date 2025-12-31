//Consider Singly linear Linked list to solve following problems
//Check hether List is soreted(Ascending order)
//bool CheckSorted(PNODE head);

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

bool CheckSorted(PNODE first)
{
    bool bFlag = true;
    // Empty list or single node is always sorted
    if(first == NULL || first->next == NULL)
    {
        return bFlag;
    }

    while(first->next != NULL)
    {
        if(first->data > first->next->data)
        {
            bFlag = false;
            break;
        }
        first = first->next;
    }
    return bFlag;
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
    bool bRet = false;

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

    bRet = CheckSorted(head);

    if(bRet == true)
    {
        printf("LL is sorted\n");
    }
    else
    {
        printf("LL is not sorted\n");
    }

    return 0;
}
