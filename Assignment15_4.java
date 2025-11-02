// Write program to accept number from user and return multiplicaion of all digits

import java.util.Scanner;

class Demo
{
    public int Multiplication(int iNo)
    {
        int iDigit = 0, iMult = 1;

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
            iMult = iMult * iDigit;
            iNo = iNo / 10;
        }

        return iMult;
    }


}

class Assignment15_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();
        int iRet = dobj.Multiplication(iValue);

        System.out.println("Multiplication is: "+iRet);
    }
    
}