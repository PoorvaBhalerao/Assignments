// Write a program which accepts two numbers as a range from user and print all even numbers between that range

#include<stdio.h>

void DisplayEvenRange(int iNo1, int iNo2)
{
    int iCnt = 0;

    if(iNo1 > iNo2)
    {
        printf("Invalid Range\n");
        return;
    }

    for(iCnt = iNo1; iCnt <= iNo2; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            printf("%d\t",iCnt);
        }
        
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

    DisplayEvenRange(iValue1, iValue2);

    return 0;
}