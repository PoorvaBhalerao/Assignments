// Write a program to find number is perfect number or not

import java.util.Scanner;

class Logic
{
    public boolean CheckPerfect(int iNo)
    {
        int iCnt = 0, iSum = 0;
        boolean bFlag = false;
        
        for(iCnt = 1 ;iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            bFlag = true;
        }

        return bFlag;
        
    }


}

class Assignment20_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckPerfect(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Perfect Number");
        }
        else
        {
            System.out.println("Number is not Perfect Number");
        }
        
    }
    
}