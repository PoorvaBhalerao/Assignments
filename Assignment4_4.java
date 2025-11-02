// Wrrite a program which accepts a number from user and return summation of all its non factors

import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public int DisplaySumNonFactors(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}

class Assignment4_4
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        System.out.println("Enter a number:");
        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        iRet = dobj.DisplaySumNonFactors(iValue);

        System.out.println("Summation of Non Factors is "+iRet);

    }
}

