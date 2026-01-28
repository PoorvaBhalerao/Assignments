// Write a program to accept filename from user and open that file

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class Assignment56_1
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name you want to open: ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

       try
       {
            Scanner fileReader = new Scanner(fobj);
            while (fileReader.hasNextLine()) 
            {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + FileName);
        }
    }
}
    
