// Accept a number from user and display below pattern
//Input: 5
//Output:   5   #   4   #   3   #   2   #   1   #

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = iNo; iCnt >=1 ; iCnt--)
        {
            System.out.print(iCnt+"\t#\t");
        }
        System.out.println();
    }
}

class Assignment26_2
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}