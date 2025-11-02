//Write  program to reverse a number.


import java.util.Scanner;

class Logic
{
    public int ReverseNumber(int iNo)
    {
        int iDigit = 0,iReversednum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iReversednum = iReversednum * 10 + iDigit;
            iNo = iNo / 10;
        }

        return iReversednum;
    }


}

class Assignment16_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.ReverseNumber(iValue);

        System.out.println("Reversed Number is: "+iRet);
    }
    
}