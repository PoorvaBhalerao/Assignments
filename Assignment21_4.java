// Write a program to count how many factors of given number

import java.util.Scanner;

class Logic
{
    public int DisplayFactors(int iNo)
    {
        int iCount = 0, iCnt = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <=(iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }

}

class Assignment21_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.DisplayFactors(iValue1);

        System.out.println("Count of factors is: "+iRet);
    }
    
}