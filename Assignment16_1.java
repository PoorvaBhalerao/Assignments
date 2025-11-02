//Write a program to calculate sum of N natural numbers

import java.util.Scanner;

class Logic
{
    public int CalculateSum(int iNo)
    {
        int iCnt = 0,iSum = 0;

        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return -1;
        }

        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        return iSum;
    }


}

class Assignment16_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.CalculateSum(iValue);

        System.out.println("Sum is: "+iRet);
    }
    
}