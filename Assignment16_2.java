// Program to check whether given number is even or odd

import java.util.Scanner;

class Logic
{
    public boolean CheckEvenOdd(int iNo)
    {
        int iCnt = 0;
        boolean bFlag = false;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo % 2 == 0)
        {
            bFlag = true;
        }

        return bFlag;
    }


}

class Assignment16_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckEvenOdd(iValue);

        if(bRet
         == true)
        {
            System.out.println("Number is Even\n");
        }
        else
        {
            System.out.println("Number is Odd\n");

        }
        
    }
    
}