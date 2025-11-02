//Write a program to display grade of student based on marks

import java.util.Scanner;

class Logic
{
    public void DisplayGrade(int Marks)
    {
        if(Marks < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(Marks >= 75)
        {
            System.out.println("Distinction");
        }
        else if(Marks >= 60 && Marks < 75)
        {
            System.out.println("First class");
        }
        else if(Marks >= 35 && Marks < 60 )
        {
            System.out.println("Second class");
        }
        else if(Marks <=35)
        {
            System.out.println("Third Class");
        }
    }

}

class Assignment19_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int iValue1 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.DisplayGrade(iValue1);
    }
    
}