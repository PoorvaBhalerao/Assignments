// Write a program to print table of given number


import java.util.Scanner;

class Logic
{
    public void DisplayTable(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<=10; iCnt++)
        {
            System.out.print(iCnt*iNo+ " \t");
        }
    }

}

class Assignment17_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayTable(iValue1);
    }
    
}