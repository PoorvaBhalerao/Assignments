// Write a program to copy contents of one string to another removing white spaces
//I/p: Poo   rva P atan kar
//o/p: PoorvaPatankar

import java.util.*;
class Logic
{
    public void StrcpyX(String str)
    {
        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];
        int i = 0, j = 0;
        

        while(i<Arr.length)
        {
            if(Arr[i] == ' ')
            {
                i++;
            }
            else
            {
                Brr[j] = Arr[i];
                i++;
                j++;
            }
                                  
        }

        System.out.println("Updated string is: "+new String(Brr));
    }
}


class Assignment38_2
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