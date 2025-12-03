// Accept character from user and display its ASCII value in decimal, hexadecimal and Octal format
import java.util.Scanner;
class Logic
{
    public void Display(char ch)
    {
        System.out.printf("Decimal     : %d\n", (int)ch);
        System.out.printf("Hexadecimal : 0X%x\n", (int)ch);
        System.out.printf("Octal       : 0%o", (int)ch);
    }
}

class Assignment34_5
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