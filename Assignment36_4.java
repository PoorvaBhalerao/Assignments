// Write a program which accepts string and display only digits from that string
import java.util.*;

class Logic
{
    public void ToUpper(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i]>= '0') && (Arr[i] <= '9'))
            {
                System.out.print(Arr[i]);
            }            
        }
    }
}


class Assignment36_4
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        lobj.ToUpper(sobj);

    }
}