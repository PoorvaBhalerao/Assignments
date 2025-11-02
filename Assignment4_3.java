//Write a program which accepts a number and display all its non factors

import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public void DisplayNonFactors(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if(iNo % iCnt != 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

class Assignment4_3
{
    public static void main(String[] args) 
    {
        
        System.out.println("Enter a number:");
        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.DisplayNonFactors(iValue);

    }
}

