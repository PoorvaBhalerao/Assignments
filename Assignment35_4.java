// Accept String from user and check whether it contains vowels or not

import java.util.Scanner;
class Logic
{
    public boolean CheckVowel(String str)
    {
        char Arr[] = str.toCharArray();
        boolean bFlag = false;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u') ||
            (Arr[i] == 'A') || (Arr[i] == 'E') || (Arr[i] == 'I') || (Arr[i] == 'O') || (Arr[i] == 'U'))
            {
                bFlag = true;            
            }
        }
        return bFlag;
    }
}

class Assignment35_4
{
    public static void main(String[] args) 
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        boolean bRet = lobj.CheckVowel(sobj);    
        
        if(bRet == true)
        {
            System.out.println("Vowel is present");
        }
        else
        {
            System.out.println("Vowel is not present");
        }

    }
}