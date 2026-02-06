// Write a program which accepts a number from user and two positions from user and check whether bit at first position and bit at second position  is ON ot OFF

import java.util.*;

class Logic
{
    public long ChkBits(int iNo, int Pos1, int iPos2)
    {
        int iMask = 0; 
        long iResult = 0;   

        iMask = ((1 << (iPos1-1)) | (1<< (iPos2 -1)));
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("All mentioned bits are ON");
        }
        else if(iResult == 0)
        {
            System.out.println("All mentioned bits are OFF");
        }
        else 
        {
            System.out.println("One bit is ON and One bit is OFF");
        }
    }
}
class Assignment66_5
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int ipos1 = 0, ipos2 = 0;
        long iRet= 0;

        Logic lobj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        System.out.println("Enter first position of bit: ");
        ipos1 = sobj.nextInt();

        System.out.println("Enter second position of bit: ");
        ipos2 = sobj.nextInt();

        iRet =lobj.Chkbits(iValue, ipos);

    
    }
}