//Write a java program which accept directorry name from user and calculate total size of all files from that directory.

import java.util.Scanner;
import java.io.File;

class Assignment60_1
{
    public static void main(String[] args) 
    {
        long TotalSize = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of dirctory: ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            for(File f: files)
            {
                if(f.isFile())
                {
                    TotalSize = TotalSize + f.length();
                }
            }
            System.out.println("Total size of all the files from directory is: "+TotalSize);
        }
        else
        {
            System.out.println("Directory not exists");
        }

    }
}