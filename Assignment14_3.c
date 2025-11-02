//Write a program to accept number from user and count frequencyy of two in it.

#include<stdio.h>


int CountFreq(int iNo)
{
    int iDigit = 0;
    int iCount = 0;

    if(iNo == 0)
    {
        return 0;
    }

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit == 2)
        {
            iCount++;
        }
        iNo = iNo / 10;
    }

    return iCount;
}

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter a Number: ");
    scanf("%d",&iValue);

    iRet = CountFreq(iValue);

    printf("Frequency of 2 in number is %d\n",iRet);

    return 0;
}