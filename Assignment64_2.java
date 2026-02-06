//Write a program which checks whether 5th and 18th bit is ON or OFF.

import java.util.*;

class Logic
{
    public void ChkBit(int iNo)
    {
        int iResult = 0;
        int iMask = 0x00020010;     // => (0000  0000    0000    0010    0000    0000    0001    0000)

        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("5th as well as 8th bit is ON");
        }
        else if(iResult == 0)
        {
            System.out.println("Both bits are OFF");
        }
        else if(iResult == 0x00000010)
        {
            System.out.println("5th bit is ON and 8th bit is OFF");
        }
        else if(iResult == 0x00020000)
        {
            System.out.println("5th bit is OFF and 8th bit is ON");
        }

    }
}
class Assignment64_2
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