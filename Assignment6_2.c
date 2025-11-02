// Write a program which accepts a number from user and check whether that number is greater than 100 or not

#include<stdio.h>
#include<stdbool.h>

bool Check(int iNo)
{
    bool bFlag = false;

    if(iNo > 100)
    {
        bFlag = true;
    }

    return bFlag;
}


int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter Number: ");
    scanf("%d", &iValue);

    bRet = Check(iValue);

    if(bRet == true)
    {
        printf("Number is greater than 100\n");
    }
    else
    {
        printf("Number is not greater than 100\n");
    }

    return 0;
}