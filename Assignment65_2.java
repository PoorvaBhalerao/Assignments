// Write a program which accepts number from user and off 7th bit if that number if it is On and return modifies number.

import java.util.*;

class Logic
{
    public long ChkBit(int iNo)
    {
        long iResult = 0;
        int iMask = 0;

        iMask = ~((1 << (7-1)) | (1 << (10-1)));
        iResult = iNo & iMask;

        return iResult;
    }
}


class Assignment65_2
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