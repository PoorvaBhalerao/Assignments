//Write a program to accept year and check whether it is leap year or not

#include<stdio.h>
#include<stdbool.h>

bool CheckLeapYear(int year)
{
    bool bFlag = false;

    if(((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)))
    {
        bFlag = true;
    }

    return bFlag;
}


int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter year: ");
    scanf("%d", &iValue);

    bRet = CheckLeapYear(iValue);

    if(bRet == true)
    {
        printf("It is a Leap Year\n");
    }
    else
    {
        printf("It is not a Leap Year\n");
    }

    return 0;
}