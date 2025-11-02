//Write a program to display all the numbers upto N which are divisible by 2 and 3.

import java.util.Scanner;

class Logic
{
    public boolean CheckDivisibility(int iNo)
    {
        boolean bFlag = false;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if((iNo % 2 == 0) && (iNo % 3 == 0))
        {
            bFlag = true;
        }
        
        return bFlag;
    }

}

class Assignment21_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckDivisibility(iValue1);

        if(bRet == true)
        {
            System.out.println("Number is divisible by 2 and 3");
        }
        else
        {
            System.out.println("Number is not divisible by 2 and 3");
        }
    }
    
}