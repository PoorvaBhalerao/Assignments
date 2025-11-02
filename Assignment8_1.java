// Write a program which accepts a number from user and if number is less than 50 then print small if number is between 50  and 100 then print medium and if number is greater than 100 then print large

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
        if(iNo <= 50)
        {
            System.out.println("Small");
        }
        else if((iNo > 50) && (iNo < 100))
        {
            System.out.println("Medium");
        }
        else if(iNo >= 100)
        {
            System.out.println("Large");
        }
    }
}


class Assignment8_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a number:");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue);

    }
}