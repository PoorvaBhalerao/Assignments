// Accept number from user and display all odd numbers upto that number

#include<stdio.h>


void Display(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        if(iCnt % 2 != 0)
        {
            printf("%d\t",iCnt);
        }
        
    }
}


int main()
{
    int iValue1 = 0;
    
    printf("Enter Number: ");
    scanf("%d", &iValue1);

    Display(iValue1);

    return 0;
}