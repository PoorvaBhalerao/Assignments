// write a java program to accept filename from user and handle all file related exceptions properly

import java.util.Scanner;
import java.io.*;

class Assignment63_5
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String fileName = scan.nextLine();

        File fobj = new File(fileName);

        try
        {
            // Check whether file exists
            if(!fobj.exists())
            {
                throw new FileNotFoundException("File does not exist");
            }

            // Check whether it is a regular file
            if(!fobj.isFile())
            {
                throw new IOException("Not a regular file");
            }

            FileInputStream fiobj = new FileInputStream(fobj);

            System.out.println("File opened successfully");
            System.out.println("File size: " + fobj.length() + " bytes");

            fiobj.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println("IOException: " + e.getMessage());
        }
        catch(SecurityException e)
        {
            System.out.println("SecurityException: Permission denied");
        }
        catch(Exception e)
        {
            System.out.println("Unknown error: " + e);
        }
        finally
        {
            System.out.println("Program terminated safely");
        }
    }
}
