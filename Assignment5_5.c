// Write a program Which accepts three numbers from user and find Largest among three numbers.

#include<stdio.h>


int Maximum(int iNo1, int iNo2, int iNo3)
{
    int iMax = 0;
    iMax = iNo1;
    
    if(iNo2 > iMax)
    {
        if(iNo3 > iNo2)
        {
            iMax = iNo3;
        }
        else
        {
            iMax = iNo2;
        }
    }

    return iMax;
}


int main()
{
    int iValue1 = 0, iValue2 = 0 ,iValue3 = 0;
    int iRet = 0;

    printf("Enter first number: ");
    scanf("%d", &iValue1);

    printf("Enter Second number: ");
    scanf("%d", &iValue2);

    printf("Enter Third number: ");
    scanf("%d", &iValue3);

    iRet = Maximum(iValue1, iValue2, iValue3);

    printf("Largest number is: %d",iRet);

    return 0;
}