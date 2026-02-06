//Write a program which accept one number and bit position from user and check whether that bit from that number if ON ot OFF.

import java.util.*;

class Logic
{
    public boolean ChkBit(int iNo, int Pos)
    {
        int iResult = 0;
        int iMask = 0; 
        boolean bFlag = false;    

        iMask = 1 << (Pos-1);

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bFlag = true;
        }
        
        return bFlag;
    }
}
class Assignment66_1
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int ipos = 0;
        int iMask = 0; 
        boolean bRet= false;

        Logic lobj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        System.out.println("Enter the position of bit: ");
        ipos = sobj.nextInt();

        bRet =lobj.ChkBit(iValue, ipos);

        if(bRet == true)
        {
            System.out.println("Bit is ON");
        }
        else 
        {
            System.out.println("Bit is OFF");
        }

    }
}