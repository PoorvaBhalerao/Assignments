//Accept two numbers on screen and display first number in second number times.

import java.util.Scanner;



class Demo
{
    public int iNo1;
    public int iNo2;

    public Demo()
    {
        iNo1 = 0;
        iNo2 = 0;
    }
    
    
    public void Display(int iNo1, int iNo2)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <=iNo2; iCnt++)
        {
            System.out.print(iNo1+"\t");
        }
    }
}

class Assignment2_4
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);   
        System.out.println("Enter First number:");

        int iValue1 = sobj.nextInt();

        System.out.println("Enter Second number:");

        int iValue2 = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue1, iValue2);        
    }
    
}