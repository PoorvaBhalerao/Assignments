// Write a program which accepts one number from user and toggle 7th bit of that number

import java.util.*;

class Logic
{
    public long ChkBit(int iNo)
    {
        long iResult = 0;
        int iMask = 0x00000040;

        iResult = iNo ^ iMask;

        return iResult;
    }
}


class Assignment65_3
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        long Result = 0;

        Logic lobj = new Logic();
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        Result = lobj.ChkBit(iValue);

        System.out.println("Modified number is: "+Result);
    }
}