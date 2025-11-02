//Accept amount i US $ and return its corresponding amount in Indian Currency
//Consider 1$ = 70 Rs

import java.util.Scanner;

class Demo
{
    public int Display(int iNo)
    {
        int iRupee = 0;

        if(iNo < 0)
        {
            System.out.println("Invalid Amount Entered");
            return 0;
        }

        iRupee = iNo * 70;
        return iRupee;
    }
}


class Assignment9_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Amount in US $:");
    
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        int iRet =dobj.Display(iValue);

        System.out.println("Amount in Rupees is: "+iRet);
    }
}