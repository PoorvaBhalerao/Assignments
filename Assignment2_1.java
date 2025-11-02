//Accept one number from user and display that number of times * on screen

import java.util.*;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }
    
    
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t");
        }
    }
}

class Assignment2_1
{
    public static void main(String arg[])
    {
        System.out.println("Enter number:");
        Scanner s = new Scanner(System.in);
        int iValue = s.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue);


    }
    
}