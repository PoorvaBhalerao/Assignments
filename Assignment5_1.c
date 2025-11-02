//Write a program to check Even or Odd.

#include<stdio.h>
#include<stdbool.h>

bool CheckEvenOdd(int iNo)
{
    bool bFlag = false;

    if(iNo % 2 == 0)
    {
        bFlag = true;
    }

    return bFlag;
}


int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter a number: ");
    scanf("%d", &iValue);

    bRet = CheckEvenOdd(iValue);

    if(bRet == true)
    {
        printf("Number is Even\n");
    }
    else
    {
        printf("Number is odd\n");
    }

    return 0;
}