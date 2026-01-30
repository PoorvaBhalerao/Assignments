// Write a program which accept directory name from user and display count of number of files and folders.
import java.util.Scanner;
import java.io.File;


class Assignment59_4
{
    public static void main(String[] args) 
    {
        int iCountFiles = 0, iCountFolders = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name: ");
        String Dname = sobj.nextLine();

        File fobj = new File(Dname);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            for(File f: files)
            {
                if(f.isDirectory())
                {
                    iCountFolders++;
                }
                else if(f.isFile())
                {
                    iCountFiles++;
                }
            }
            System.out.println("Number of Files are: "+iCountFiles);
            System.out.println("Number of Folders are: "+iCountFolders);

        }
        else
        {
            System.out.println("Directory not exists");
        }
    }

}