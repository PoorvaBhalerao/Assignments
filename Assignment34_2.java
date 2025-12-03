// Accept character from user and in case it is small then display its capital character and if it is capital display its small character.


import java.util.Scanner;
class Logic
{
    public void Display(char ch)
    {
        if((ch >= 'a') && (ch <='z'))
    {
        System.out.printf("%c",(ch-32));
    }
    else if((ch >= 'A') && (ch <='Z'))
    {
        System.out.printf("%c",(ch+32));
    }
    else
    {
        System.out.printf("Invalid Input\n");
        return;
    }
    }
}

class Assignment34_2
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