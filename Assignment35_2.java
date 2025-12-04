// Write a program which accepts string from user and count number of small characters.
import java.util.Scanner;
class Logic
{
    public int CountSmall(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount= 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Assignment35_2
{
    public static void main(String[] args) 
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        int iRet = lobj.CountSmall(sobj);    
        
        System.out.println("Number of small characters are: "+iRet);

    }
}