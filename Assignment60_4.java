// //Write a java program which accept directorry name and file extension from user and Display name  file having that extension

import java.util.Scanner;
import java.io.File;

class Assignment60_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of dirctory: ");
        String Dname = sobj.nextLine();

        System.out.println("Enter extention of file: ");
        String extension = sobj.nextLine();

        if(!extension.startsWith("."))
        {
            extension = "." + extension;
        }

        File fobj = new File(Dname);

        boolean bFlag = false;

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();
        
            for(File f: files)
            {
                if(f.isFile() && f.getName().endsWith(extension))
                {
                    System.out.println("File Name: "+f.getName());
                    bFlag = true;
                }
            }    
            
            if(bFlag == false)
            {
                System.out.println("There is no File with above extention");
            }
            
        }
        else
        {
            System.out.println("Directory not exists");
        }

    }
}