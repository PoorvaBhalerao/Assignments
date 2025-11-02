// Print Sum of First N natural numbers

import java.util.Scanner;

class Demo
{
    public int Sum_N_EvenNumbers(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            System.out.println("Invalid Input");
            return -1;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum + iCnt;
            }
                    
        }

        return iSum;
    }
}


// Time complexity: O(N)

class Assignment13_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Limit: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet =dobj.Sum_N_EvenNumbers(iValue);

        System.out.println("Sum of Even Numbers is: "+iRet);

    }
}