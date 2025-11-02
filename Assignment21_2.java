// Write a program to count how many even and odd numbers between 1 to N

import java.util.Scanner;

class Logic
{
    public void Count(int iNo)
    {
        int iCount1 = 0, iCount2 = 0, iCnt = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <=iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCount1++;
            }
            else
            {
                iCount2++;
            }
        }

        System.out.println("Count of even numbers is: "+iCount1);
        System.out.println("COunt of odd numbers is: "+iCount2);
    }

}

class Assignment21_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.Count(iValue1);
    }
    
}