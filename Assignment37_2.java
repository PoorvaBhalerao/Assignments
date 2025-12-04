//Accept string from user and a character from user and count frequency of that character from string.

import java.util.*;

class Logic
{
    public int CountCharacter(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        int iCount = 0;
        

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                iCount++;
            }            
        }
        return iCount;
    }
}


class Assignment37_2
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        System.out.println("Enter a character: ");
        char cValue = scanobj.next().charAt(0);

        Logic lobj = new Logic();
        int iRet = lobj.CountCharacter(sobj, cValue);
        
        System.out.println("Count of character in string is: "+iRet);
    }
}