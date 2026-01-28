// Accept filename from user and check whether that file is regular file or not

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class Assignment57_2
{
    public static void main(String Args[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter file name : ");
        String FileName= sobj.nextLine();

        File fobj = new File(FileName);

       
        if(fobj.exists())
        {
            if(fobj.isFile())
            {
                System.out.println("It is regular file");
            }
            else
            {
                System.out.println("It is not a regular file");
            }
        }
        else
        {
            System.out.println("File not exists");
        }        
    }
}
    
