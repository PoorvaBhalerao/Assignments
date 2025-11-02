// Write a program which accepts two numbers as a range from user and print all the numbers between that range

#include<stdio.h>

void DisplayRange(int iNo1, int iNo2)
{
    int iCnt = 0;

    if(iNo1 > iNo2)
    {
        printf("Invalid Range\n");
        return;
    }

    for(iCnt = iNo1; iCnt <= iNo2; iCnt++)
    {
        printf("%d\t",iCnt);
    }
}

//Time complexity : O(N)

int main()
{
    int iValue1 = 0, iValue2 = 0;

    printf("Enter Starting point: ");
    scanf("%d",&iValue1);

    printf("Enter Ending point: ");
    scanf("%d",&iValue2);

    DisplayRange(iValue1, iValue2);

    return 0;
}