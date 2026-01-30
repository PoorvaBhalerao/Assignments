// Write a program in java which accepts source file and destination file from user and copy data from source to destionation(byte to byte).

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

class Assignment60_4
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Source File: ");
        String source = scan.nextLine();

        System.out.println("Enter desination File: ");
        String destination = scan.nextLine();

        File srcFile = new File(source);
        
        if(srcFile.exists() && srcFile.isFile())
        {
            try
            {
                FileInputStream reader = new FileInputStream(srcFile);
                FileOutputStream writer = new FileOutputStream(destination);

                int ch; 

                while((ch = reader.read()) != -1)
                {
                    writer.write(ch);
                }
                writer.close();
                System.out.println("File copied successfullys");
            }
            catch(IOException e)
            {
                System.out.println("Error: Error while copying file: "+e);
            }
            
        }
        else
        {
            System.out.println("Source File not exists");
        }

    }
}