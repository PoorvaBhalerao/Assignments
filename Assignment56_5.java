//Accept directory name from user and print all the files from that directory

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class Assignment56_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Directory name: ");
        String DName = sobj.nextLine();

        File directory = new File(DName);

        if(directory.exists() && directory.isDirectory())
        {
            File[] files = directory.listFiles();

            if(files != null)
            {
                for(File f : files)
                {
                    System.out.println(f.getName());
                }

            }
        }
        else
        {
            System.out.println("Directory does not exits or it is not a directory");
        }
    
    }  
}