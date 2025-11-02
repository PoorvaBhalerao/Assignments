//Accept number frm user and Print all factors of number

import java.util.Scanner;

class Demo
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.print(iCnt+" \t");
            }
        }
    }
}


// Time complexity: O(N/2)

class Assignment12_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.DisplayFactors(iValue);

    }
}