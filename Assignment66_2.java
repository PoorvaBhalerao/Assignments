//Write a program which accept one number and bit position from user and OFF that bit from that numberand return modified number.

import java.util.*;

class Logic
{
    public long ChkBit(int iNo, int Pos)
    {
        int iMask = 0; 
        long iResult = 0;   

        iMask = ~(1 << (Pos-1));

        iResult = iNo & iMask;

        return iResult;
    }
}
class Assignment66_2
{
    public static void main(String[] args) 
    {
        int iValue = 0;
        int ipos = 0;
        int iMask = 0;
        long iRet= 0;

        Logic lobj = new Logic();
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        System.out.println("Enter the position of bit: ");
        ipos = sobj.nextInt();

        iRet =lobj.ChkBit(iValue, ipos);

        System.out.println("Modified number is: "+iRet);
    }
}