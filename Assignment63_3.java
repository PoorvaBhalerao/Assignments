// Accept two directory name from user and copy files from source directory to destinattion directory

import java.util.Scanner;
import java.io.*;

class Assignment63_3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter source directory name: ");
        String srcDirName = scan.nextLine();

        System.out.println("Enter destination directory name: ");
        String destDirName = scan.nextLine();

        File srcDir = new File(srcDirName);
        File destDir = new File(destDirName);

        // Check source directory
        if(!srcDir.exists() || !srcDir.isDirectory())
        {
            System.out.println("Source directory does not exist");
            return;
        }

        // Create destination directory if it does not exist
        if(!destDir.exists())
        {
            destDir.mkdir();
        }

        File[] files = srcDir.listFiles();

        if(files == null)
        {
            System.out.println("No files found in source directory");
            return;
        }

        for(File f : files)
        {
            if(f.isFile())
            {
                File destFile = new File(destDir, f.getName());

                try
                {
                    FileInputStream fiobj = new FileInputStream(f);
                    FileOutputStream foobj = new FileOutputStream(destFile);

                    byte[] buffer = new byte[1024];
                    int iRet = 0;

                    while((iRet = fiobj.read(buffer)) != -1)
                    {
                        foobj.write(buffer, 0, iRet);
                    }

                    fiobj.close();
                    foobj.close();
                }
                catch(IOException e)
                {
                    System.out.println("Error copying file: " + f.getName());
                }
            }
        }

        System.out.println("All files copied successfully.");
    }
}
