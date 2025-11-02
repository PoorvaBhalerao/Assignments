//// Write a program which accepts two numbers as a range from user and Display addition of all even numbers between that range (Range should contains positive numbers only)

#include<stdio.h>

int RangeAddition(int iNo1, int iNo2)
{
    int iCnt = 0, iSum = 0;

    if((iNo1 > iNo2) || (iNo1 < 0) || (iNo2 < 0))
    {
        
        return -1;
    }


    for(iCnt = iNo1; iCnt <= iNo2; iCnt++)
    {
        if(iCnt % 2 == 0)
        {
            iSum = iSum + iCnt;
        }
    }
            

    return iSum;
}

//Time complexity : O(N)


int main()
{
    int iValue1 = 0, iValue2 = 0, iRet = 0;

    printf("Enter Starting point: ");
    scanf("%d",&iValue1);

    printf("Enter Ending point: ");
    scanf("%d",&iValue2);

    iRet = RangeAddition(iValue1, iValue2);

    if(iRet == -1)
    {
        printf("Please Enter Valid range\n");
    }
    else
    {
        printf("Addition of Even numbers between range is: %d\n",iRet);
    }

    return 0;
}