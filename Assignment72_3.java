// Write a program which accepts matrix from user and return Largest of two disgonals.

import java.util.*;

class Matrix
{
    public int iRow;
    public int iCol;
    public int Arr[][];

    public Matrix(int a, int b)
    {
        this.iRow = a;
        this.iCol = b;
        this.Arr = new int[iRow][iCol];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Enter the elements: ");

        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        int i = 0, j = 0;

        System.out.println("Elements of Matrix are: ");

        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int Largest()
    {
        int i = 0, j = 0, k = 0, iMax = 0;

        k = this.iCol-1;
        iMax = Arr[0][0];

        for(i = 0; i < this.iRow; i++)
        {
            for(j = 0; j < this.iCol && k >=0; j++)
            {
               if(i == j || j == k)
               {
                    if(Arr[i][j] > iMax)
                    {
                        iMax = Arr[i][j];
                    }
               }
            }
            k--;            
        }
        return iMax;
    }



}


class Assignment72_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int R = sobj.nextInt();

        System.out.println("Enter number of columns: ");
        int C = sobj.nextInt();

        if(R != C)
        {
            System.out.println("Invalid Input");
            System.out.println("Enter equal number of rows and columns");
            return;
        }

        Matrix mobj = new Matrix(R,C);

        mobj.Accept();
        mobj.Display();

        System.out.println("Largest number from both the diagonals is: "+mobj.Largest());

        sobj.close();
    }

    



}