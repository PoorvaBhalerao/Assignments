// Write a program to find sum of even digits and sum of odd digits seperately in a number

import java.util.Scanner;

class Logic
{
    public void DisplaySum(int iNo)
    {
        int iDigit= 0, iSum1 = 0, iSum2 = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0)
        {
            System.out.println("Invalid Input");
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSum1 += iDigit;
            }
            else
            {
                iSum2 += iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Sum of even digits of number is: "+iSum1);
        System.out.println("Sum of odd digits of number is: "+iSum2);
    }

}

class Assignment18_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplaySum(iValue1);
    }
    
}