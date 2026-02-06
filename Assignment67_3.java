// Write a program which accepts a number from user and check whether 9th or 12th bit is ON ot OFF

import java.util.*;

class Logic
{
    public void ChkBit(int iNo)
    {
        long iResult = 0;
        int iMask = 0x00000900;     // => (0000  0000    0000    0000    0000    1001    0000    0000)
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            System.out.println("All mentioned bits are ON");
        }
        else if(iResult == 0)
        {
            System.out.println("All mentioned bits are OFF");
        }
        else if(iResult == 0x00000100)
        {
            System.out.println("9th bit is ON and 12th bit is OFF");
        }
        else if(iResult == 0x00008000)
        {
            System.out.println("12th bit is ON and 9th bit is OFF");
        }

    }
}
class Assignment67_3
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int iMask = 0; 

        Logic lobj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        lobj.ChkBit(iValue);

    }
}