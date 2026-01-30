// Write a program which accepts a filename and integer N from user and copy last N bytes into new file

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Assignment62_3
{
    public static void main(String[] args) 
    {
        int iRet=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Source File Name: ");
        String source = scan.nextLine();

        System.out.println("Enter a number: ");
        int No = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter Desination File Name: ");
        String destination = scan.nextLine();
    

        File srcFile = new File(source);
        File destFile = new File(destination);
        
        
        if(srcFile.exists() && srcFile.isFile())
        {
            try
            {
                FileInputStream fiobj = new FileInputStream(srcFile);
                FileOutputStream foobj = new FileOutputStream(destFile);

                long fileSize = srcFile.length();

                // If N0 is larger than file size, copy entire file
                long bytesToSkip =0;
                
                if(No < fileSize)
                {
                    bytesToSkip = (fileSize - No);
                }
                else
                {
                    System.out.println("Number of bytes are greater than file size");
                    foobj.close();
                    fiobj.close();
                    return;
                }
                     
                fiobj.skip(bytesToSkip);

                byte[] buffer = new byte[1024];   
                
                while((iRet =fiobj.read(buffer)) != -1)
                {
                    foobj.write(buffer, 0,No);

                }
            
                fiobj.close();
                foobj.close();
                System.out.println("Last "+No + " bytes copies successfully");
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