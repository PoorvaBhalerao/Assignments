// Write a program to accept number from user and return count of digits between 3 and 7

import java.util.Scanner;

class Demo
{
    public int Count(int iNo)
    {
        int iDigit = 0, iCount = 0;

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
            if((iDigit > 3) && (iDigit < 7))
            {
                iCount++;
            }
            iNo = iNo / 10;
        }

        return iCount;
    }


}

class Assignment15_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        int iRet = dobj.Count(iValue);

        System.out.println("Count of Digits between 3 and 7 is: "+iRet);
    }
    
}