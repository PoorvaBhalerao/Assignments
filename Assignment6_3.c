// Write a program which accepts two numbers and check whether they are equal or not

#include<stdio.h>
#include<stdbool.h>

bool Check(int iNo1, int iNo2)
{
    bool bFlag = false;

    if(iNo1 == iNo2)
    {
        bFlag = true;
    }

    return bFlag;
}


int main()
{
    int iValue1 = 0, iValue2 = 0;
    bool bRet = false;

    printf("Enter First Number: ");
    scanf("%d", &iValue1);

    printf("Enter Second Number: ");
    scanf("%d", &iValue2);

    bRet = Check(iValue1, iValue2);

    if(bRet == true)
    {
        printf("Numbers are equal\n");
    }
    else
    {
        printf("Numbers are not equal\n");
    }

    return 0;
}