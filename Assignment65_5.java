// Write a program which accepts one number from user and On its first four bits and return modified number

import java.util.*;

class Logic
{
    public long ChkBit(int iNo)
    {
        long iResult = 0;
        int iMask = 15;

        iResult = iNo | iMask;

        return iResult;
    }
}


class Assignment65_5
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