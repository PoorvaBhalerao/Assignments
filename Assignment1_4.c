//Accept one number and check whether it is divisible by 5 or not

#include<stdio.h>
#include<stdbool.h>

bool Check(int iNo)
{
    bool bFlag = false;

    if(iNo % 5 == 0)
    {
        bFlag =true;
    }

    return bFlag;
}

int main()
{
    int iValue = 0;
    bool bRet = false;

    printf("Enter number: ");
    scanf("%d",&iValue);

    bRet=Check(iValue);

    if(bRet == true)
    {
        printf("%d is divisible by 5\n", iValue);
    }
    else
    {
        printf("%d is not divisible by 5\n", iValue);
    }

    
    return 0;
}