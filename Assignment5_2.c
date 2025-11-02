//Accpet Two numbers from user and display Maximum of two numbers

#include<stdio.h>


int Maximum(int iNo1, int iNo2)
{
    int iMax = 0;

    if(iNo1 > iNo2)
    {
        iMax = iNo1;
    }
    else
    {
        iMax = iNo2;
    }

    return iMax;
}


int main()
{
    int iValue1 = 0, iValue2 = 0;
    int iRet = 0;

    printf("Enter first number: ");
    scanf("%d", &iValue1);

    printf("Enter Second number: ");
    scanf("%d", &iValue2);

    iRet = Maximum(iValue1, iValue2);

    printf("Maximum number is: %d",iRet);

    return 0;
}