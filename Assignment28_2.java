//Accept number of Rows and Columns from user and Display below Pattern
//Input: iRow = 4       iCol=4
/*
    A   B   C   D
    a   b   c   d
    A   B   C   D
    a   b   c   d
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        char ch1 = 'A', ch2 = 'a';

        for(i = 1; i<=iRow; i++)
        {
            for(j = 1; j <= iCol;j++)
            {
                if((i % 2)==0)
                {
                    System.out.print(ch2+"\t");
                    ch2++;
                }
                else
                {
                    System.out.print(ch1+"\t");
                    ch1++;
                }
            }
            ch1 = 'A';
            ch2 = 'a';
            System.out.println();
        }
        
    }
}

class Assignment28_2
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number of Columns: ");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue1, iValue2);

    }
}