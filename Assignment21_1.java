// Write a program to calculate product of digit in given number

import java.util.Scanner;

class Logic
{
    public int DigitProduct(int iNo)
    {
        int iDigit = 0;
        int iMult = 0;
        iMult = 1;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            iMult = iMult * iDigit;
            iNo = iNo/ 10;

        }
        return iMult;
    }

}

class Assignment21_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.DigitProduct(iValue1);

        System.out.println("Product of digits of number is: "+iRet);
    }
    
}