// Write a program which accept directory name from user and display files with its absolute path.
import java.util.Scanner;
import java.io.File;


class Assignment59_5
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

            for(File f: files)
            {
                String absolutePath = f.getAbsolutePath();
                if(f.isFile())
                {
                    System.out.println("Name: "+f.getName()+" | Absolute Path : "+absolutePath);
                }
            }
        }
        else
        {
            System.out.println("Directory not exists");
        }
    }

}