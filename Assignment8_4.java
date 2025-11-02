// Write a program which accepts a number from user and display table of that number
import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public void DisplayTable(int iNo)
    {
        int iCnt = 0;
        

        for(iCnt = 1; iCnt <=10; iCnt++)
        {
            System.out.print(iNo * iCnt+"\t");
        }
       
    }
}


class Assignment8_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number:");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.DisplayTable(iValue);        

    }
}