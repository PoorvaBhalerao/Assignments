//Write  program to find factorial using for loop


import java.util.Scanner;

class Logic
{
    public int findFactorial(int iNo)
    {
        int iCnt = 0,iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt<=iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }


}

class Assignment16_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.findFactorial(iValue);

        System.out.println("Factorial is: "+iRet);
    }
    
}