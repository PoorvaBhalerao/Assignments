// Write a program which accepts string from user and count number of capital characters.

import java.util.Scanner;
class Logic
{
    public int CountCapital(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount= 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Assignment35_1
{
    public static void main(String[] args) 
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        int iRet = lobj.CountCapital(sobj);    
        
        System.out.println("Number of capital characters are: "+iRet);

    }
}