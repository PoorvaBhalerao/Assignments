//Accept a Number from user and print factors of that number on screen

#include<stdio.h>

void DisplayEvenFactors(int iNo)
{
    int iCnt = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    for(iCnt = 2; iCnt <= (iNo/2); iCnt++)
    {

        if(iNo % iCnt == 0) 
        {
            printf("%d\t",iCnt);
        }
    }
}



int main()
{
    int iValue1 = 0;

    printf("Enter Number: \n");
    scanf("%d",&iValue1);

    DisplayEvenFactors(iValue1);
    
    return 0;
}