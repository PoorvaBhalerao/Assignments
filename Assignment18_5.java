// Write a program to check if number is positie, negative or zero

import java.util.Scanner;

class Logic
{
    public void Check(int iNo)
    {        
        if(iNo > 0)
        {            
            System.out.println("Number is Posittive");
        }
        else if(iNo < 0)
        {
            System.out.println("Number is Negative");
        }
        else 
        {
            System.out.println("Number is Zero");
        }        
    }
}

class Assignment18_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.Check(iValue1);
    }
    
}