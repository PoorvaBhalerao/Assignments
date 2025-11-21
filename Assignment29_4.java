//Accept number of Rows and Columns from user and Display below Pattern
//Input: iRow = 4       iCol=5
/*
    1       2       3       4       5
    -1      -2      -3      -4      -5
    1       2       3       4       5
    -1      -2      -3-     -4      -5

*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;
        int iCount1 = -1 , iCount2 = 1;

        for(i = 1; i<=iRow; i++)
        {
            for(j = 1; j <= iCol;j++)
            {
                if((i%2) == 0)
                {
                    System.out.print(iCount1+"\t");
                    iCount1--;
                }
                else
                {
                    System.out.print(iCount2+"\t");
                    iCount2++;
                }                
            } 
            iCount1= -1;
            iCount2 = 1;              
            
            System.out.println();
        }
        
    }
}

class Assignment29_4
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