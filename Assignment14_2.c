//Write a program to accept a number and check whether it contains zero or not.

#include<stdio.h>
#include<stdbool.h>

bool Check(int iNo)
{
    int iDigit = 0;
    bool bFlag = false;

    if(iNo == 0)
    {
        bFlag = true;
        return bFlag;
    }

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 0)
        {
            bFlag = true;
            break;
        }
        iNo = iNo / 10;
    }

    return bFlag;
}

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter a Number: ");
    scanf("%d",&iValue);

    bRet = Check(iValue);

    if(bRet == true)
    {
        printf("Number contains zero\n");
    }
    else
    {
        printf("Number not contains zero\n");
    }

    return 0;
}