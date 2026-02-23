// Write a program which accepts a matrix and check whetheer that matrix is identity matrix or not


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

    public boolean CheckIdentityMatrix()
    {
        int i = 0, j = 0;
        boolean bFlag = false;

        for(i = 0; i< iRow; i++)
        {
            for(j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    if(Arr[i][j] == 1)
                    {
                        bFlag = true;
                    }
                    else
                    {
                        bFlag = false;
                        break;
                    }
                }
                else if(i != j)
                {
                    if(Arr[i][j] == 0)
                    {
                        bFlag = true;
                    }
                    else
                    {
                        bFlag = false;
                        break;
                    }
                }

            }
            
        }

        return bFlag;
        
    }


}


class Assignment73_4
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
            System.out.println("Invalid input\nPlease enter equal number of rows and columns");
            return;
        }

        Matrix mobj = new Matrix(R,C);

        mobj.Accept();
        mobj.Display();

        if(mobj.CheckIdentityMatrix())
        {
            System.out.println("Matrix is identity matrix");
        }
        else
        {
            System.out.println("Matrix is not identity matrix");
        }

        sobj.close();
    }

    



}