// Accept String from user and return difference between frequency of small characters and frequency of Capital characters
import java.util.Scanner;
class Logic
{
    public int Difference(String str)
    {
        char Arr[] = str.toCharArray();
        int iCount1= 0, iCount2 = 0;

        for(int i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                iCount1++;
            }
            else if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCount2++;
            }
        }
        return iCount1-iCount2;
    }
}

class Assignment35_3
{
    public static void main(String[] args) 
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        int iRet = lobj.Difference(sobj);    
        
        System.out.println("Difference between number of small and capital characters are: "+iRet);

    }
}