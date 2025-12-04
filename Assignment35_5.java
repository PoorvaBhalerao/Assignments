// Write a program which accept string display it in reverse order
import java.util.Scanner;
class Logic
{
    public void Reverse(String str)
    {
        char Arr[] = str.toCharArray();

        int iLength = Arr.length;
        int i = 0;
        for(i = iLength-1; i >= 0; i--)
        {
            System.out.print(Arr[i]);
        }
    }
}

class Assignment35_5
{
    public static void main(String[] args) 
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        lobj.Reverse(sobj);    

    }
}