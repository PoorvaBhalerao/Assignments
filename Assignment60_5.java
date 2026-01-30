// //Write a java program which accept path from user and display whether it exits or not.if exists display whether it is file or directory

import java.util.Scanner;
import java.io.File;

class Assignment60_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of directory: ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(!(fobj.isAbsolute()))
        {
            fobj.getAbsolutePath();
        }

        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("It is a File");
            }
            else if(fobj.isDirectory())
            {
                System.out.println("It is a Directory");
            }
            
        }
        else
        {
            System.out.println("File not exists");
        }

    }
}