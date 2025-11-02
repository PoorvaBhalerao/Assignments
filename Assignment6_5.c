// Write a program which accepts total marks and obtained marks from student and display its percentage

#include<stdio.h>


float Percentage(int iNo1, int iNo2)
{
    float Percent = 0.0;
    printf("%d\n", iNo1);
    printf("%d\n", iNo2);
    Percent = ((iNo2*100) / iNo1);
    printf("%f\n", Percent);

    return Percent;
}


int main()
{
    int iValue1 = 0, iValue2 = 0;
    float fRet = 0.0;

    printf("Enter total marks: ");
    scanf("%d", &iValue1);

    printf("Enter Obtained marks: ");
    scanf("%d", &iValue2);

    fRet = Percentage(iValue1, iValue2);

    printf("Percentage is: %f",fRet);

    return 0;
}