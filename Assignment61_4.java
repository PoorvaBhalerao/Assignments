// Write a program which accepts two input file names and one output file name and merge that two files to output file.

import java.util.*;
import java.io.*;

class Assignment61_3
{
    public static void main(String[] args) 
    {
        int iRet = 0;
        FileOutputStream foobj = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of first file: ");
        String FileName1 = sobj.nextLine();

        System.out.println("Enter name of first file: ");
        String FileName2 = sobj.nextLine();

        System.out.println("Enter name of file to which you want contents: ");
        String FileName3 = sobj.nextLine();

        File fobj1 = new File(FileName1);
        File fobj2 = new File(FileName2);
        File fobj3 = new File(FileName3);

        try
        {
            if(fobj1.exists() && fobj1.isFile())
            {             
                byte[] buffer = new byte[1024];

                foobj = new FileOutputStream(fobj3, true);
                FileInputStream fiobj1 = new FileInputStream(fobj1);

                while((iRet = fiobj1.read(buffer)) != -1)
                {
                    foobj.write(buffer, 0, iRet);
                }                

                fiobj1.close();
            }
                
            else
            {
                System.out.println(FileName1+ " not exists");
            }

            if(fobj2.exists() && fobj2.isFile())
            { 
                iRet = 0;  
                byte[] buffer1 = new byte[1024];

                foobj = new FileOutputStream(fobj3, true);
                FileInputStream fiobj2 = new FileInputStream(fobj2);

                while((iRet = fiobj2.read(buffer1)) != -1)
                {
                    foobj.write(buffer1, 0, iRet);
                }                

                fiobj2.close();
            }
            else
            {
                System.out.println(FileName2+ " not exists");
            }
                
            foobj.close();
            System.out.println("Data transferred successfully."); 
        }
        catch(IOException e)
        {
            
            System.out.println("Error: " + e);
        
        }
        
    }
}