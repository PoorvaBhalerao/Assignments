// Accept character from user and check whether it is digit or not

import java.util.*;

class Logic
{
    public boolean CheckDigit(char ch)
    {
        boolean bFlag = false;

        if((ch >= '0') && (ch <= '9'))
        {
            bFlag = true;
        }
        else
        {
            bFlag = false;
        }

        return bFlag;
        
    }
}

class Assignment33_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckDigit(cValue);

        if(bRet == true)
        {
            System.out.println("It is a Digit");
        }
        else 
        {
            System.out.println("It is not a Digit");
        }
    }
}