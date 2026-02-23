// Write a program which accepts a matrix and check whetheer that matrix is Sparse matrix or not

//Sparse matrix is matrix in which majority of elements are 0.
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

    public boolean CheckSparseMatrix()
    {
        int i = 0, j = 0;
        int iCount1 = 0, iCount2 = 0;

        for(i = 0; i< iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    iCount1++;
                }
                else
                {
                    iCount2++;
                }
            }
            
        }

        return (iCount1>iCount2);        
    }
}


class Assignment73_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int R = sobj.nextInt();

        System.out.println("Enter number of columns: ");
        int C = sobj.nextInt();

        Matrix mobj = new Matrix(R,C);

        mobj.Accept();
        mobj.Display();

        if(mobj.CheckSparseMatrix())
        {
            System.out.println("Matrix is Sparse matrix");
        }
        else
        {
            System.out.println("Matrix is not Sparse matrix");
        }

        sobj.close();
    }

    



}