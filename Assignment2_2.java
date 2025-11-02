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

        while(iCnt < iNo)
        {
            System.out.print("*\t");
            iCnt++;
        }
    }
}

class Assignment2_2
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