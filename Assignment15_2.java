//Write a program which accept number from user and return count of odd digits in number.

import java.util.Scanner;

class Demo
{
    public int CountOdd(int iNo)
    {
        int iDigit = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        return iCount;
    }


}

class Assignment15_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        int iRet = dobj.CountOdd(iValue);

        System.out.println("Count of Odd Digits in number is: "+iRet);
    }
    
}