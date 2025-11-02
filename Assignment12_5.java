//Accept number from user and check whether it is divisible by 5 or not

import java.util.Scanner;

class Demo
{
    public boolean Check(int iNo)
    {
        
        boolean bFlag = false;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo % 5 == 0)
        {
            bFlag = true;
            
        }
        return bFlag;
    }
}


class Assignment12_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        boolean bRet = dobj.Check(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Divisible by 5");
        }
        else
        {
            System.out.println("Number is not Divisible by 5");
        }

    }
}