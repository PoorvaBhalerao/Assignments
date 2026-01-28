// Write a program to accept directory name from user and display all names of files from directory which are regular files

import java.util.Scanner;
import java.io.File;

class Assignment58_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter name of Directory:");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            if(files != null && files.length > 0)
            {
                System.out.println("Files from Directory are: ");
                for(File f: files)
                {
                    if(f.isFile())
                    {
                        System.out.println("File Name: "+f.getName());
                    }
                     else
                    {
                        System.out.println("File is not regular file");
                    }                            
                }
            }           
        }
        else
        {
            System.out.println("Invalid Directory path");
        }
    }
}