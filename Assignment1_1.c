//Accept Two numbers from user and Display Division of two numbers

#include<stdio.h>

float Division(int iNo1, int iNo2)
{
    float fAns = 0.0f;

    if (iNo2 == 0)
    {
        return -1;
    }

    fAns = iNo1/iNo2;

    return fAns;
}

int main()
{
    int iValue1 = 0, iValue2 = 0;
    float fRet = 0.0f;

    printf("Enter First number: \n");
    scanf("%d", &iValue1);

    printf("Enter second number: \n");
    scanf("%d", &iValue2);

    fRet = Division(iValue1, iValue2);

    printf("Division is: %f\n",fRet);

    return 0;
}
