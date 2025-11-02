// Print all even numbers upto N

import java.util.Scanner;

class Demo
{
    public void Print_EvenNum(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt+ " \t");
            }            
        }
    }
}


// Time complexity: O(N)

class Assignment13_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Limit: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Print_EvenNum(iValue);

    }
}