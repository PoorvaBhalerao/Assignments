// Write  program to check whether number is divisible by 5 and 11 or not

import java.util.Scanner;

class Logic
{
    public boolean CheckDivisibility(int iNo)
    {
        boolean bFlag = false;
        
        if((iNo % 5 == 0) && (iNo % 11 == 0))
        {
            bFlag = true;
        }

        return bFlag;
        
    }


}

class Assignment19_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckDivisibility(iValue);

        if(bRet == true)
        {
            System.out.println("Number is divisible by 5 and 11");
        }
        else
        {
            System.out.println("Number is not divisible by 5 and 11");
        }
        
    }
    
}