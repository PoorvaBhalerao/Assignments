//Accept filename from user and create new file of that name if it is not exists

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class Assignment56_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file: ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        try
        {
            if(fobj.createNewFile())
            {
                System.out.println("File is created successfully");
            }
            else
            {
                System.out.println("File is already exists");
            }
        }
        catch(IOException e)
        {
            System.out.println("Error: Not able to create file due to "+e);
        }
    
    }  


}