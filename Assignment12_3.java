// Accept number from user and Sum all factors of number

import java.util.Scanner;

class Demo
{
    public int SumFactors(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}


// Time complexity: O(N/2)

class Assignment12_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet = dobj.SumFactors(iValue);

        System.out.println("Sum of Factors is: "+iRet);

    }
}