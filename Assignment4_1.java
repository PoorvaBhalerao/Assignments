//Accept a number from user and display multiplication of its factors.

import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public int DisplayFactorsMult(int iNo)
    {
        int Mult = 0;
        Mult = 1;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                Mult = Mult * iCnt;
            }
        }
        
        return Mult;
    }
}

class Assignment4_1
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        System.out.println("Enter a number:");
        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        iRet = dobj.DisplayFactorsMult(iValue);

        System.out.println("Multiplication of Factors of "+ iValue +" is "+ iRet);

    }
}

