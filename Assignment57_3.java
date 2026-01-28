// Write a program to accept directoryname from user and create that directory

import java.util.Scanner;
import java.io.File;

class Assignment57_3
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter directory name : ");
        String DName= sobj.nextLine();

        File fobj = new File(DName);

        if(fobj.exists())
        {
            System.out.println("Directory already exists");
        }
        else
        {
            if(fobj.mkdir())
            {
                System.out.println("Directory created successfully");
            }
            else
            {
                System.out.println("Failed to create directory");
            }
        }
    }
}