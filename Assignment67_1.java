//Write a program which accept one number and Count number of ON (1) bits in it without using % and /  operators.
import java.util.*;

class Logic
{
    public int CountOnBits(int iNo)
    {
        int iCount = 0;

        while (iNo != 0)
        {
            if ((iNo & 1) == 1)
            {
                iCount++;
            }
            iNo = iNo >> 1;
        }
        return iCount;
    }
}

class Assignment67_1
{
    public static void main(String[] args)
    {
        int iValue = 0;
        int iResult = 0;

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        iResult = lobj.CountOnBits(iValue);

        System.out.println("Number of ON bits: " + iResult);
    }
}
