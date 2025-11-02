// Write a program to find Smallest digit in given number

import java.util.Scanner;

class Logic
{
    public int SmallDigit(int iNo)
    {
        int iDigit = 0;
        int iMin = 0;
        iMin = iNo % 10;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            iNo = iNo/ 10;

        }
        return iMin;
    }

}

class Assignment20_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Limit: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.SmallDigit(iValue1);

        System.out.println("Smallest digit in number is: "+iRet);
    }
    
}