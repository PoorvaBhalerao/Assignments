// Accept a number from user and display below pattern
//Input: 5
//Output:   A   B   C   D   E

import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <=iNo; iCnt++)
        {
            System.out.print(ch+"\t");
            ch++;
        }
        System.out.println();
    }
}

class Assignment26_1
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