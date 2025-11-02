//Accepts a number from user and print first 5 multiples of that number

#include<stdio.h>


void Display(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    for(iCnt = 1; iCnt <= 5; iCnt++)
    {
        printf("%d\t",iCnt*iNo);
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