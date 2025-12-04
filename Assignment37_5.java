// Write a program to reverse the string in place

import java.util.*;
class Logic
{
    public void Reverse(String str)
    {
        char Arr[] = str.toCharArray();
        int i = 0;
        

        for(i = Arr.length-1; i >=0; i--)
        {
            System.out.print(Arr[i]); 
                      
        }
    }
}


class Assignment37_5
{
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String sobj = scanobj.nextLine();

        Logic lobj = new Logic();
        lobj.Reverse(sobj);
        
    }
}