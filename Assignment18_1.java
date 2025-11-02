//Write a program to check whether number is prime or not

import java.util.Scanner;

class Logic
{
    public boolean CheckPrime(int iNo)
    {
        boolean bFlag = false;
        int iCnt = 0;
        
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0 || iNo == 1)
        {
            return bFlag;
        }

        for(iCnt = 2; iCnt<=(iNo/2);iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                break;
            }
        }
        
        if(iCnt > (iNo/2))
        {
            bFlag = true;
        }

        return bFlag;
        
    }


}

class Assignment18_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckPrime(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not Prime");
        }
        
    }
    
}