// Write a program to check whether year is leap year or not

import java.util.Scanner;

class Logic
{
    public boolean CheckLeapYear(int year)
    {
        boolean bFlag = false;
        
        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            bFlag = true;
        }

        return bFlag;
        
    }


}

class Assignment19_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckLeapYear(iValue);

        if(bRet == true)
        {
            System.out.println("Year is Leap Year");
        }
        else
        {
            System.out.println("Year is not Leap Year");
        }
        
    }
    
}