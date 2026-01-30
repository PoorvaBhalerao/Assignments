// Write a java program which accepts file name and one string from user and append that string at the end of the file

import java.util.*;
import java.io.*;

class Assignment61_3
{
    public static void main(String[] args) 
    {
        int len = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file: ");
        String FileName = sobj.nextLine();

        System.out.println("Enter Content that you want to write to file: ");
        String str = sobj.nextLine();
        len = str.length();
        char[] ch = str.toCharArray();


        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isFile())
        {
            try
            {
                FileOutputStream foobj = new FileOutputStream(fobj,true);

                for(int i = 0; i < len; i++)
                {
                    foobj.write(ch[i]);
                    
                }
                
                foobj.close();
                System.out.println("Contents are successfully written to file");
            }
            catch(IOException e)
            {
                System.out.println("Error: Unable to copy "+e);
            }
            
        }
        else
        {
            System.out.println("File not exists");
        }
    }
}