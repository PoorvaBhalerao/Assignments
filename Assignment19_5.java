// Write a program to display power of number using loop

import java.util.Scanner;

class Logic
{
    public void DisplayPower(int iNo, int power)
    {
        int iCnt = 0, iAns = 1;
        if(iNo < 0)
        {
            iNo = -iNo;
        }


        for(iCnt = 1; iCnt <= power; iCnt++)
        {
            iAns  = iAns * iNo; 
        }

        System.out.println(iNo+" raised to "+power+" = "+iAns);
    }

}

class Assignment19_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter Power: ");
        int iValue2 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayPower(iValue1, iValue2);
    }
    
}