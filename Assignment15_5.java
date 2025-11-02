//Write a program to accept number from user and return difference between summation of even digits and summation of odd dogits

import java.util.Scanner;

class Demo
{
    public int Difference(int iNo)
    {
        int iDigit = 0, iSum1 = 0, iSum2 = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0)
        {
            return 0;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) == 0)
            {
                iSum1 = iSum1+iDigit;
            }
            else
            {
                iSum2 = iSum2+ iDigit;
            }
            iNo = iNo / 10;
        }

        return iSum1-iSum2;
    }


}

class Assignment15_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        int iRet = dobj.Difference(iValue);

        System.out.println("Difference between summation of even and Odd Digits in number is: "+iRet);
    }
    
}