// //Write a java program which accept directorry name from user and Display name of largest file from directory (By size).

import java.util.Scanner;
import java.io.File;

class Assignment60_2
{
    public static void main(String[] args) 
    {
        long iMax = 0;
        String largName = "";
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
                    if(f.length() > iMax)
                    {
                        iMax = f.length();
                        largName = f.getName();
                    }
                }
            }
            System.out.println("Largest File is "+largName);
        }
        else
        {
            System.out.println("Directory not exists");
        }

    }
}