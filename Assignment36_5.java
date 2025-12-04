// Write a program which accept string from user and count no of white spaces
import java.util.*;

class Logic
{
    public int CountWhiteSpace(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        int iCount = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }            
        }
        return iCount;
    }
}


class Assignment36_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        int iRet = lobj.CountWhiteSpace(sobj);
        System.out.println("Number of white spaces are: "+iRet);
    }
}