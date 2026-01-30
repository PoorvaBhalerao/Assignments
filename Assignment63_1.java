//Wrie a program in java which accepts source and destination file from user and copy file using BufferedInputStream and BufferedOutputStream.
import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Assignment63_1
{
    public static void main(String[] args) 
    {
        int iRet=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Source File Name: ");
        String source = scan.nextLine();

        System.out.println("Enter Desination File Name: ");
        String destination = scan.nextLine();
    

        File srcFile = new File(source);
        File destFile = new File(destination);
        
        
        if(srcFile.exists() && srcFile.isFile())
        {
            try
            {
                FileInputStream fiobj = new FileInputStream(srcFile);
                BufferedInputStream biobj = new BufferedInputStream(fiobj);

                FileOutputStream foobj = new FileOutputStream(destFile);
                BufferedOutputStream boobj = new BufferedOutputStream(foobj);

                byte[] buffer = new byte[1024];   
                
                while((iRet = biobj.read(buffer)) !=-1)
                {
                    boobj.write(buffer, 0, iRet);
                }
            
                
                biobj.close();
                boobj.close();
                System.out.println("File copies successfully");
            }
            catch(FileNotFoundException e)
            {
                System.out.println("Error: File not found exception: "+e);

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