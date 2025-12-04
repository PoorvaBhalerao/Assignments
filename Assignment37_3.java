// Write a program to accept a string and accept on character and return index of first occurence of that character in string
import java.util.*;

class Logic
{
    public int FirstOccurence(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        int iIndex = 1;
        

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                iIndex = i+1;
                break;
            }            
        }
        return iIndex;
    }
}


class Assignment37_3
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        System.out.println("Enter a character: ");
        char cValue = scanobj.next().charAt(0);

        Logic lobj = new Logic();
        int iRet = lobj.FirstOccurence(sobj, cValue);
        
        System.out.println("Index of First occurence character in string is: "+iRet);
    }
}