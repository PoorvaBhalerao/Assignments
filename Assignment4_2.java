// Write a program which accepts a number from user and display its factors in decreasing order.

import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;
        for(iCnt = (iNo/2); iCnt >=1 ; iCnt--)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt+"\t");
            }
        }
    }
}

class Assignment4_2
{
    public static void main(String[] args) 
    {
        
        System.out.println("Enter a number:");
        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        dobj.DisplayFactors(iValue);

    }
}

