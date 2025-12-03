// Accept character from user and if it is capital character Display from input character till 'Z', 
//and if it is small character display in reverse order till 'a'.

import java.util.Scanner;
class Logic
{
    public void Display(char ch)
    {
        char ch1 = '\0';
        if((ch >= 'a') && (ch <='z'))
        {
            for(ch1 = ch; ch1 >= 'a'; ch1--)
            {
                System.out.printf("%c\t",ch1);
            }
        }
        else if((ch >= 'A') && (ch <='Z'))
        {
            for(ch1 = ch; ch1 <= 'Z'; ch1++)
            {
                System.out.printf("%c\t",ch1);
            }
        }
        else
        {
            System.out.printf("Invalid Input\n");
            return;
        }
    }
}

class Assignment34_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();
        lobj.Display(cValue);       

    }
}