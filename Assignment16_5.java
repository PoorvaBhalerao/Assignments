//Write  program to count number of digits in given number


import java.util.Scanner;

class Logic
{
    public int CountDigits(int iNo)
    {
        int iCount= 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }
        
        if(iNo == 0)
        {
            return 1;
        }

        while(iNo != 0)
        {
            iCount++;
            iNo = iNo / 10;
        }

        return iCount;
    }


}

class Assignment16_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.CountDigits(iValue);

        System.out.println("No of Digits in Number is: "+iRet);
    }
    
}