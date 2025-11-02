//Write a program to find even factorial of given number
//Input: 5
//Output: 4 * 2 = 8
//Input: 10
//Output: 10*8*6*4*2 =3840

import java.util.Scanner;

class Demo
{
    public int EvenFactorial(int iNo)
    {
        int iCnt= 0;
        int iAns = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = iNo; iCnt >=2; iCnt--)
        {
            if(iCnt % 2 == 0)
            {
                iAns = iAns * iCnt;
            }
        }
        return iAns;
    }
}


class Assignment9_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number:");
    
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet =dobj.EvenFactorial(iValue);

        System.out.println("Even Factorial is: "+iRet);
    }
}