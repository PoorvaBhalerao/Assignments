//Accept number from user and check whether it is even or odd

import java.util.Scanner;



class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }
    
    
    public void CheckEvenOdd(int iNo)
    {
        if(iNo %2 == 0)
        {
            System.out.println("Number is even number");
        }
        else
        {
            System.out.println("Number is Odd number");
        }        
    }
}

class Assignment2_5
{
    public static void main(String arg[])
    {
        
        System.out.println("Enter number:");

        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.CheckEvenOdd(iValue);        
    }
    
}