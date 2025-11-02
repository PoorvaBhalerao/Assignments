// Write a program to print each digit of number seperately


import java.util.Scanner;

class Logic
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        if(iNo < 0)
        {
            iNo = -iNo;
        }

        if(iNo == 0)
        {
            System.out.println(iNo);
        }

        while(iNo > 0)
        {
            iDigit = iNo % 10;
            System.out.print(iDigit+ " \t");
            iNo = iNo / 10;
        }
    }

}

class Assignment19_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayDigits(iValue1);
    }
    
}