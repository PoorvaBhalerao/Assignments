// Write a program to display all factors of given number

import java.util.Scanner;

class Logic
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <=(iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt+" \t");
            }
        }
    }

}

class Assignment21_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayFactors(iValue1);
    }
    
}