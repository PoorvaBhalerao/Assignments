//Accept number of Rows and Columns from user and Display below Pattern
//Input: iRow = 5      iCol=5
/*
    $   *   *   *   *
    #   $   *   *   *
    #   #   $   *   *   
    #   #   #   $   *    
    #   #   #   #   $
*/

import java.util.*;

class Pattern
{
    public void Display(int iRow, int iCol)
    {
        int i = 0, j = 0;

        for(i = 1; i<=iRow; i++)
        {
            for(j = 1; j <= iCol;j++)
            {
                if(i == j)
                {
                    System.out.print("$\t");
                } 
                else if(i < j)
                {
                    System.out.print("*\t");
                } 
                else 
                {
                    System.out.print("#\t");
                }                
            }       
            
            System.out.println();
        }
        
    }
}

class Assignment31_3
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