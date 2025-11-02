//Print all numbers from 1 to N

import java.util.Scanner;

class Demo
{
    public void DisplayNum(int iNo)
    {
        int iCnt = 0;

        if(iNo < 1)
        {
            System.out.println("Invalid Input");
            return;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print(iCnt+ " \t");
        }
    }
}


// Time complexity: O(N)

class Assignment13_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Limit: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.DisplayNum(iValue);

    }
}