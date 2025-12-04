// Write a program to copy contents of one string to another converting all small characters into capital characters
import java.util.*;
class Logic
{
    public void Capital(String str)
    {
        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];
        int i = 0, j = 0;
        

        while(i<Arr.length)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
            
            Brr[j] = Arr[i];
            i++;
            j++;           
                                  
        }

        System.out.println("Updated string is: "+new String(Brr));
    }
}


class Assignment38_3
{
    public static void main(String A[])
    {
        String sobj = null;
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        sobj = scanobj.nextLine();


        Logic lobj = new Logic();
        lobj.Capital(sobj);
        
    }
}