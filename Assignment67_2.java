//Write a program which accept two numbers and display posittion of common ON (1) bits from that numbers.
//Input: 10     15      (1010      1111)
//Output:2      4
import java.util.*;

class Logic
{
    public void CommonOnBits(int iNo1, int iNo2)
    {
        int iPos = 1, iCommon = 0;

        iCommon = iNo1 & iNo2;

        while (iCommon != 0)
        {
            if ((iCommon & 1) == 1)
            {
                System.out.print(+iPos+"  ");
            }
            iCommon= iCommon >> 1;
            iPos++;
        }
    }
}

class Assignment67_2
{
    public static void main(String[] args)
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        System.out.println("Enter first number:");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Second number:");
        iValue2 = sobj.nextInt();

        lobj.CommonOnBits(iValue1, iValue2);
    }
}
