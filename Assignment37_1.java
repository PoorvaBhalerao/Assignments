// Write a program to accept a string and accept on character and check whether that character is present in string or not
import java.util.*;

class Logic
{
    public boolean CheckCharacter(String str, char ch)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        boolean bFlag = false;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ch)
            {
                bFlag = true;
            }            
        }
        return bFlag;
    }
}


class Assignment37_1
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        System.out.println("Enter a character: ");
        char cValue = scanobj.next().charAt(0);

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckCharacter(sobj, cValue);
        
        if(bRet == true)
        {
            System.out.println(cValue+" is present");
        }
        else
        {
            System.out.println(cValue+" is not present");
        }
    }
}