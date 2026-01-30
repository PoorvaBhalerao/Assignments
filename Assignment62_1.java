// Write a program which accepts a filename from user and return number of bytes read from that file

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class Assignment62_1
{
    public static void main(String[] args) 
    {
        int iRet=0, iCount=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter File Name: ");
        String source = scan.nextLine();

        File srcFile = new File(source);
        
        if(srcFile.exists() && srcFile.isFile())
        {
            try
            {
                FileInputStream reader = new FileInputStream(srcFile);

                byte[] buffer = new byte[1024];   // 1 KB buffer
                
                while((iRet = reader.read(buffer)) != -1)
                {
                    iCount += iRet;
                }
                
                reader.close();
                System.out.println("Number of bytes read from file are: "+ iCount);
            }
            catch(IOException e)
            {
                System.out.println("Error: Unable to read the file: "+e);
            }
            
        }
        else
        {
            System.out.println("Source File not exists");
        }

    }
}