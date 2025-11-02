//Accept number from user and display below pattern
//Input: 5
//Output: *   *   *   *   *   #   #   #   #   #

import java.util.Scanner;

class Demo
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t");
        }
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("#\t");
        }
    }
}


class Assignment9_1
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