//Write a program which checks whether 15th bit is ON or OFF.

import java.util.*;

class Logic
{
    public boolean ChkBit(int iNo)
    {
        int iResult = 0;
        boolean bFlag = false;
        int iMask = 0x00004000;

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            bFlag = true;
        }

        return bFlag;
    }
}
class Assignment64_1 
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int iMask = 0; 
        boolean bRet= false;

        Logic lobj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        bRet = lobj.ChkBit(iValue);

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