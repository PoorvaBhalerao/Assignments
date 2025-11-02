// Check number type and display Positive Negative or Zero.

#include<stdio.h>


void CheckNumberType(int iNo)
{
    if(iNo > 0)
    {
        printf("Number is Positive Number\n");
    }
    else if(iNo < 0)
    {
        printf("Number is Negative Number\n");
    }
    else
    {
        printf("Number is Zero\n");
    }    
}


int main()
{
    int iValue = 0;
    
    printf("Enter first number: ");
    scanf("%d", &iValue);

    CheckNumberType(iValue);

    return 0;
}