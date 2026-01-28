// Write a java program to accept directory name from user and display all names of the file from that directory and sizes of that file

import java.util.Scanner;
import java.io.File;

class Assignment57_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of Directory: ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            if(files != null && files.length > 0)
            {
                System.out.println("Files in Directory are: ");
                for(File f : files)
                {
                    if(f.isFile())
                    {
                        System.out.println("Name: "+f.getName()+" | size: "+f.length());
                    }
                }
            }
            else
            {
                System.out.println("Directory is empty");
            }
        }
        else
        {
            System.out.println("Invalid path entered");
        }
    }
}