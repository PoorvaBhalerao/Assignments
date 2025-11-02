// Write a program to find maximum of two numbers


import java.util.Scanner;

class Logic
{
    public int Maximum(int iNo1, int iNo2)
    {
        int iMax = 0;

        if(iNo1 == iNo2)
        {
            System.out.println("Both numbers are same");
            return -1;
        }

        if(iNo1 > iNo2)
        {
            iMax = iNo1;
        }
        else
        {
            iMax = iNo2;
        }

        return iMax;
    }

}

class Assignment17_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        int iValue2 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.Maximum(iValue1 , iValue2);

        if(iRet == -1)
        {
            System.out.println("Enter valid input");
        }
        else
        {
            System.out.println("Maximum Number is: "+iRet);

        }
    }
    
}