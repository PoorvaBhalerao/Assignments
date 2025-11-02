//Write a program to find number Pallindrome or not

import java.util.Scanner;

class Logic
{
    public boolean CheckPallindrome(int iNo)
    {
        int iDigit = 0, iReversenum = 0;
        boolean bFlag = false;
        


        if(iNo < 0)
        {
            iNo = -iNo;
        }

        int iNo1 = iNo;
        
        if(iNo == 0)
        {
            return true;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iReversenum = iReversenum * 10 + iDigit;
            iNo = iNo / 10;
        }

        if(iReversenum == iNo1)
        {
            bFlag = true;
        }

        return bFlag;
        
    }


}

class Assignment17_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckPallindrome(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Pallindrome");
        }
        else
        {
            System.out.println("Number is not Pallindrome");
        }
        
    }
    
}