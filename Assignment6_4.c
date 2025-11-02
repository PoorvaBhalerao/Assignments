//Write a program which accepts three numbers and print its multiplication

#include<stdio.h>


int Multiplication(int iNo1, int iNo2, int iNo3)
{
    int iMult = 0;
    
    iMult = iNo1 * iNo2 * iNo3;

    return iMult;
}


int main()
{
    int iValue1 = 0, iValue2 = 0 ,iValue3 = 0;
    int iRet = 0;

    printf("Enter first number: ");
    scanf("%d", &iValue1);

    printf("Enter Second number: ");
    scanf("%d", &iValue2);

    printf("Enter Third number: ");
    scanf("%d", &iValue3);

    iRet = Multiplication(iValue1, iValue2, iValue3);

    printf("Multiplication is: %d",iRet);

    return 0;
}