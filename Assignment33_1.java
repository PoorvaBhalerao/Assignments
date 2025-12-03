// Accept character from user and check whether it is alphabet or not

import java.util.Scanner;

class Logic
{
    public boolean CheckAlpha(char ch)
    {
        boolean bFlag = false;

        if(((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z')))
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

class Assignment33_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckAlpha(cValue);

        if(bRet == true)
        {
            System.out.println("It is an Alphabet");
        }
        else 
        {
            System.out.println("It is not an Alphabet");
        }

    }
    
}