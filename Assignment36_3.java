// Write a program which accept string from user and toggle the string
import java.util.*;

class Logic
{
    public void ToUpper(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i]>= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
            else if((Arr[i]>= 'A') && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char)(Arr[i] + 32);
            }
        }

        String str1 = new String(Arr);

        System.out.println("Updated String is: "+str1);
    }

}


class Assignment36_3
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