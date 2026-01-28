// Accept filename from user and open that file and display contents on screen.

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Assignment56_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file: ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        try
        {
            Scanner fileReader = new Scanner(fobj);
            while(fileReader.hasNextLine())
            {
                System.out.println(fileReader.nextLine());
            }
            fileReader.close();
        }
        catch(java.io.FileNotFoundException e)
        {
            System.out.println("Error: " + FileName+ " not found due to "+e);
        }
    
    }  


}