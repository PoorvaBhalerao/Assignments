//Write a program which returns difference between even factorials and odd factorial of a number.
//Input: 5
//Output:8-15 = -7(4*2 - 5*3*1)

import java.util.Scanner;

class Demo
{
    public int DiffEvenOddFactorial(int iNo)
    {
        int iCnt= 0;
        int iAns1 = 1;
        int iAns2 = 1;


        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = iNo; iCnt >=1; iCnt--)
        {
            if(iCnt % 2 == 0)
            {
                iAns1 = iAns1 * iCnt;
            }
            else
            {
                iAns2 = iAns2 * iCnt;
            }
        }
        return iAns1-iAns2;
    }
}


class Assignment9_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
    
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet =dobj.DiffEvenOddFactorial(iValue);

        System.out.println("Difference between Even and Odd Factorial is: "+iRet);
    }
}