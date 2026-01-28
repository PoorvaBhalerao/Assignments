// Accept two file names from user and open first file and create new file(second file) copy contents of first file to newly created file.

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Assignment57_1
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter first file name you want to open: ");
        String FileName1 = sobj.nextLine();

        System.out.println("Enter second file name you want to create: ");
        String FileName2 = sobj.nextLine();
        

        try
        {

            FileInputStream fis = new FileInputStream(FileName1);
            FileOutputStream fos = new FileOutputStream(FileName2);
            int data;
            while((data = fis.read()) != -1)
            {
                fos.write(data);
            }

            fis.close();
            fos.close();

            System.out.println("Contents copies successfully");
            
        }
        catch(IOException e)
        {
            System.out.println("Error: Not able to create file due to "+e);
        }

        
    }
}
    
