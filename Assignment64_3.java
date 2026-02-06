//Write a program which checks whether 7th and 15th bit , 21st bit and 28th bit is ON or OFF.

import java.util.*;

class Logic
{
    public void ChkBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x08104040;     // => (0000  1000    0001    0010    0100    0000    0100    0000)

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
        else if(iResult == 0x0004000)
        {
            System.out.println("15th bit is ON and All other bits are OFF");
        }
        else if(iResult == 0x00100000)
        {
            System.out.println("21st bit is ON and All other bits are OFF");

        }
        else if(iResult == 0x08000000)
        {
            System.out.println("28th bit is ON and All other bits are OFF");

        }

    }
}
class Assignment64_3
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