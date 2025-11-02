// Write a program to find largest digit in given number

import java.util.Scanner;

class Logic
{
    public int LargeDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo/ 10;

        }
        return iMax;
    }

}

class Assignment20_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Limit: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.LargeDigit(iValue1);

        System.out.println("Largest digit in number is: "+iRet);
    }
    
}