//Write a program to accept a number and display its digits in reverse order

#include<stdio.h>

void Display(int iNo)
{
    int iDigit = 0;

    if(iNo == 0)
    {
        printf("Please enter valid number\n");
        return;
    }

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        printf("%d\t",iDigit);
        iNo = iNo / 10;
    }
}

int main()
{
    int iValue = 0;

    printf("Enter a Number: ");
    scanf("%d",&iValue);

    Display(iValue);

    return 0;
}