//Write a program which checks whether 7th and 8th bit and 9th bit is ON or OFF.

import java.util.*;

class Logic
{
    public void ChkBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x00001c0;     // => (0000  0000    0000    0000    0000    0001    1100    0000)
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("All mentioned bits are ON");
        }
        else if(iResult == 0)
        {
            System.out.println("All mentioned bits are OFF");
        }
        else if(iResult == 0x00000040)
        {
            System.out.println("7th bit is ON and All other bits are OFF");
        }
        else if(iResult == 0x0000080)
        {
            System.out.println("8th bit is ON and All other bits are OFF");
        }
        else if(iResult == 0x00000100)
        {
            System.out.println("9th bit is ON and All other bits are OFF");

        }

    }
}
class Assignment64_4
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

        lobj.ChkBit(iValue);

    }
}