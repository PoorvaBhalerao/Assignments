// Accept one number from user and print that number of even numbers on screen

#include<stdio.h>

void DisplayEvenUsingWhile(int iNo)
{
    int iCnt = 0;
    iCnt = 2;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo > 0)
    {
        if(iCnt % 2 == 0)
        {
            printf("%d\t",iCnt);
            iNo--;
        }
        iCnt++;        
    }

}

// void DisplayEvenUsingFor(int iNo)
// {
//     int iCnt = 0;
//     int iCount = 0;
//     iCnt = 2;

//     if(iNo < 0)
//     {
//         iNo = -iNo;
//     }

//     for(iCount = iNo; iCount > 0;)
//     {
//         if(iCnt % 2 == 0)
//         {
//             printf("%d\t",iCnt);
//             iCount--;
//         }
//         iCnt++;        
//     }

// }


int main()
{
    int iValue1 = 0;

    printf("Enter Number: \n");
    scanf("%d",&iValue1);

    DisplayEvenUsingWhile(iValue1);
    //DisplayEvenUsingFor(iValue1);   

    return 0;
}