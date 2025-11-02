//Write a program which accepts a number from user and Print that number times $ * on screen

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
        printf("$\t*\t");
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