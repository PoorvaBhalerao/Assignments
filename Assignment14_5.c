//Write a program to accept number from user and count frequencyy of such a number which is less than 6 in it.

#include<stdio.h>


int CountFreq(int iNo)
{
    int iDigit = 0;
    int iCount = 0;

    if(iNo == 0)
    {
        return 1;
    }

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        if(iDigit < 6)
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

    printf("Frequency of digits less than 6 in number is %d\n",iRet);

    return 0;
}