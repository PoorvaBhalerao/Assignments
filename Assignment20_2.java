//Write a program to print numbers from N to 1 reverse order

import java.util.Scanner;

class Logic
{
    public void DisplayNum(int iNo)
    {
        int iCnt = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = iNo; iCnt>=1; iCnt--)
        {
            System.out.print(iCnt+" \t");
        }
        
    }

}

class Assignment20_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayNum(iValue1);
    }
    
}