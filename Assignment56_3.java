//Accept filename from user and open it in write mode write some data onto the file

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

class Assignment56_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter name of file: ");
        String FileName = sobj.nextLine();

        try
        {
            FileWriter writer = new FileWriter(FileName, true);             // append: true, overwrite: false

            writer.write("I love my Country");
            writer.write("India is my Country");

            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Error: Not able to write data into file");
        }
    
    }  


}