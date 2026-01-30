// Write a program which accepts a filename and integer N from user and copy first N bytes into new file

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Assignment62_2
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

                byte[] buffer = new byte[No];   
                
                fiobj.read(buffer);

                foobj.write(buffer, 0,No);
            
                
                fiobj.close();
                foobj.close();
                System.out.println(No + " bytes copies successfully");
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