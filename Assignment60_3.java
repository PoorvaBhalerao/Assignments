// //Write a java program which accept directorry name from user and Display name of Smallest file from directory (By size).

import java.util.Scanner;
import java.io.File;

class Assignment60_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of dirctory: ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            if(files == null)
            {
                System.out.println("Unable to access directory");
                return;
            }
            
            File smallestFile = null;
            
            for(File f: files)
            {
                if(f.isFile())
                {
                    if(smallestFile == null || f.length() < smallestFile.length())
                    {
                        smallestFile = f;
                    }
                }
            }
            if(smallestFile != null)
            {
                System.out.println("Smallest File is: " + smallestFile.getName());
            }         
            
        }
        else
        {
            System.out.println("Directory not exists");
        }

    }
}