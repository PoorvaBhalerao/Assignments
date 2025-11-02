// Accept number from user and Count all factors of number

import java.util.Scanner;

class Demo
{
    public int CountFactors(int iNo)
    {
        int iCnt = 0, iCount = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}


// Time complexity: O(N/2)

class Assignment12_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet = dobj.CountFactors(iValue);

        System.out.println("Count of Factors is: "+iRet);

    }
}