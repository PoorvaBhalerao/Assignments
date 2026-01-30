// Write a program which accept directory name from user and display all the regular files (ignore direcories)
import java.util.Scanner;
import java.io.File;


class Assignment59_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name: ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            System.out.println("List of Files from "+Dname+" are:");
            for(File f: files)
            {
                if(f.isFile())
                {
                    System.out.println("Name: "+f.getName());
                }
            }
            
        }
        else
        {
            System.out.println("Directory not exists");
        }
    }

}