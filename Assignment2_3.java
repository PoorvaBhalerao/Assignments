//Accept number from user and if number is less than 10 print "Hello" otherwise print "Demo".

import java.util.Scanner;



class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }
    
    
    public void Display(int iNo)
    {
        if(iNo < 10)
        {
            System.out.println("Hello");
        }
        else
        {
            System.out.println("Demo");
        }        
    }
}

class Assignment2_3
{
    public static void main(String arg[])
    {
        
        System.out.println("Enter number:");

        Scanner sobj = new Scanner(System.in);
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue);        
    }
    
}