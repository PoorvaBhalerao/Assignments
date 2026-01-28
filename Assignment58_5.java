//write a java program to accept directory name from user write data of all files from that directory to newly created file "Marvellous.txt"

import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Assignment58_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Directory Name: ");
        String DName = sobj.nextLine();

        File fobj = new File(DName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File[] files = fobj.listFiles();

            try
            {
                FileWriter writer = new FileWriter("Marvellous1.txt");

                for(File f: files)
                {
                    if((f.isFile()) && f.length() > 0)
                    {
                        FileReader reader = new FileReader(f);
                        int ch;

                        writer.write("---------------------------File Name: "+f.getName()+"--"+f.length()+"-------------------------------\n");

                        while((ch = reader.read()) != -1)
                        {
                            writer.write(ch);
                        }

                        writer.write("\n\n");
                        
                    }
                    
                }
                writer.close();
                System.out.println("File names are successfully written to file");
            }
            catch(IOException e)
            {
                System.out.println("Error: Invalid input "+ e);
            }

        }
        else
        {
            System.out.println("Directory does not exits");
        }
    }
}