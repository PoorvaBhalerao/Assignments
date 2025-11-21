// Accept a number from user and display below pattern
//Input: 5
//Output:   2   4   6   8   10

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;
    
        for(iCnt =1, iCount = 2; iCnt <= iNo ; iCnt++)
        {
            System.out.print(iCount+"\t");
            iCount = iCount+2;
        }
        System.out.println();
    }
}

class Assignment26_5
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