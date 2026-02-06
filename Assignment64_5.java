//Write a program which checks whether First bit(bit no 1) and last bit (bit no 32) is ON or OFF.

import java.util.*;

class Logic
{
    public void ChkBit(int iNo)
    {
        long iResult = 0;
        int iMask = 0x80000001;     // => (1000  0000    0000    0000    0000    0000    0000    0001)
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("All mentioned bits are ON");
        }
        else if(iResult == 0)
        {
            System.out.println("All mentioned bits are OFF");
        }
        else if(iResult == 0x00000001)
        {
            System.out.println("First bit is ON and Last bit is OFF");
        }
        else if(iResult == 0x8000000)
        {
            System.out.println("Last bit is ON and First bit is OFF");
        }

    }
}
class Assignment64_5
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