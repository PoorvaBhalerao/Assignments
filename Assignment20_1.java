// Write a program to find sum of all even numbers upto N

import java.util.Scanner;

class Logic
{
    public int SumEven(int iNo)
    {
        int iCnt = 0, iSum = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }

}

class Assignment20_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Limit: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.SumEven(iValue1);

        System.out.println("Sum of Even numbers is: "+iRet);
    }
    
}