// Write a program which accepts string from user and copy characters of one string to another string in reverse order
import java.util.*;
class Logic
{
    public void StrcpyX(String str)
    {
        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];
        int i = 0, j = 0;
        

        for(i = Arr.length-1; i >=0; i--, j++)
        {
            Brr[j] = Arr[i];                      
        }

        System.out.println("Updated string is: "+new String(Brr));
    }
}


class Assignment38_1
{
    public static void main(String A[])
    {
        String sobj = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        sobj = scanobj.nextLine();


        Logic lobj = new Logic();
        lobj.StrcpyX(sobj);
        
    }
}