//Write a program which accepts a number from user and return difference between summation of all its factors and non factors

import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public int DisplayDifference(int iNo)
    {
        int iCnt = 0;
        int iSum1 = 0, iSum2 = 0;
        for(iCnt = 1; iCnt < iNo ; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum1 = iSum1 + iCnt;
            }
            else
            {
                iSum2 = iSum2 + iCnt;
            }
        }
        
        return (iSum1 - iSum2);
    }
}

class Assignment4_5
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        System.out.println("Enter a number:");
        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        iRet = dobj.DisplayDifference(iValue);

        System.out.println("Difference between Summation of Factors and Non Factors is "+iRet);

    }
}

