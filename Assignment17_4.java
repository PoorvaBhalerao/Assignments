// Write a program to find minimum of three numbers


import java.util.Scanner;

class Logic
{
    public int Minimum(int iNo1, int iNo2, int iNo3)
    {
        int iMin = 0;
        iMin = iNo1;

        if((iNo1 == iNo2)  && (iNo1 == iNo3))
        {
            return -1;
        }

        if(iNo2 < iNo1)
        {
            if(iNo2 < iNo3)
            {
                iMin = iNo2;
            }
            else
            {
                iMin = iNo3;
            }
        }
        

        return iMin;
    }

}

class Assignment17_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int iValue1 = sobj.nextInt();

        System.out.println("Enter second number: ");
        int iValue2 = sobj.nextInt();

        System.out.println("Enter third number: ");
        int iValue3 = sobj.nextInt();

        Logic lobj = new Logic();
        int iRet = lobj.Minimum(iValue1 , iValue2, iValue3);

        if(iRet == -1)
        {
            System.out.println("All numbers are same \nEnter valid input");
        }
        else
        {
            System.out.println("Minimum Number is: "+iRet);

        }
    }
    
}