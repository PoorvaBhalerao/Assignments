//Write  program to display sum of digits in given number


import java.util.Scanner;

class Logic
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        if(iNo == 0)
        {
            return 0;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum += iDigit;
            iNo = iNo / 10;
        }

        return iSum;
    }


}

class Assignment17_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.SumDigits(iValue);

        System.out.println("Sum of Digits in Number is: "+iRet);
    }
    
}