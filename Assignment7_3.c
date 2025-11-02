// Write a program which accepts a number from user and print its number line

#include<stdio.h>


void Display(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = -iNo; iCnt <= iNo; iCnt++)
    {
        printf("%d\t",iCnt);
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