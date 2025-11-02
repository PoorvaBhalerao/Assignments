// Write a program to print all even numbers upto N


import java.util.Scanner;

class Logic
{
    public void DisplayOdd(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt+" \t");
            }
        }
    }

}

class Assignment18_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayOdd(iValue1);
    }
    
}