//Write a program to find Odd factorial of Number.

import java.util.Scanner;

class Demo
{
    public int OddFactorial(int iNo)
    {
        int iCnt= 0;
        int iAns = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = iNo; iCnt >=1; iCnt--)
        {
            if(iCnt % 2 != 0)
            {
                iAns = iAns * iCnt;
            }
        }
        return iAns;
    }
}


class Assignment9_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
    
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet =dobj.OddFactorial(iValue);

        System.out.println("Odd Factorial is: "+iRet);
    }
}