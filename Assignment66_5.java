//Write a program which accept one number and toggle first and last nibble of that number and return modified number.

import java.util.*;

class Logic
{
    public long ToggleNibble(int iNo, int Pos)
    {
        int iMask = 0xf000000f; 
        long iResult = 0;   

        iResult = iNo ^ iMask;

        return iResult;
    }
}
class Assignment66_5
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int ipos = 0;
        long iRet= 0;

        Logic lobj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        System.out.println("Enter the position of bit: ");
        ipos = sobj.nextInt();

        iRet =lobj.ToggleNibble(iValue, ipos);

        System.out.println("Modified number is: "+iRet);
    }
}