// Write a program which accepts matrix from user and display transpose of that matrix
//transpose is interchanging rows and columns of matrix
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

    public void Transpose()
    {
        int i = 0, j = 0, temp = 0;

        for(i = 0; i< iRow; i++)
        {
            for(j = i+1; j < iCol; j++)
            {
                temp = Arr[i][j];
                Arr[i][j] = Arr[j][i];
                Arr[j][i] = temp;
            }
            
        }

        System.out.println("After transpose:");
        Display();
        
    }


}


class Assignment73_1
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

        mobj.Transpose();

        sobj.close();
    }

    



}