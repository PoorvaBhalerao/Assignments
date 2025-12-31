// Consider Singly Linear Linked List to solve following problems
//Search an Element
// Check whether number is present or not 
// bool Search(PNODE head,int No);

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

bool Search(PNODE first, int no)
{
    bool bFlag = false;
    while(first != NULL)
    {
        if((first->data) == no)
        {
            bFlag = true;
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
    int iValue = 0;
    bool bRet = false;
    PNODE head = NULL;

    InsertFirst(&head, 95);
    InsertFirst(&head, 115);
    InsertFirst(&head, 52);
    InsertFirst(&head, 40);
    InsertFirst(&head, 65);
    InsertFirst(&head, 80);
    InsertFirst(&head, 35);
    InsertFirst(&head, 16);
    InsertFirst(&head, 8);

    Display(head);

    printf("Enter the number that you want to search in Linked List: ");
    scanf("%d",&iValue);

    bRet = Search(head, iValue);

    if(bRet == true)
    {
        printf("%d is present\n", iValue);
    }
    else
    {
        printf("%d is not present\n", iValue);
    }

    return 0;
}
