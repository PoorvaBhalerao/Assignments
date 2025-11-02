// Write a program which accepts a number from user and find factorial of that number.

import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public int Factorial(int iNo)
    {
        int iCnt = 0;
        int iMult = 1;

        for(iCnt = 1; iCnt <=iNo; iCnt++)
        {
            iMult = iMult * iCnt;
        }
        return iMult;
    }
}


class Assignment8_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number:");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet =dobj.Factorial(iValue);

        System.out.println("Factorial is: "+iRet);

    }
}