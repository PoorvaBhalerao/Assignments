//Accept number of Rows and Columns from user and Display below Pattern
//Input: iRow = 4       iCol=5
/*
    1       2       3       4       5
    6       7       8       9       10
    11      12      13      14      15
    16      17      18      19      20

*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCount=1;

        for(i = iRow; i >=1 ; i--)
        {
            for(j = 1; j <= iCol;j++)
            {
                System.out.print(iCount+"\t");
                iCount++;
            }
            
            System.out.println();
        }
        
    }
}

class Assignment28_5
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