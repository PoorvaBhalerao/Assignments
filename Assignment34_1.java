//Write a program which displays ASCII table. Table contains Symbol, decimal ,Hexadecmal, Octal representation of every member from 0 to 255

public class Assignment34_1
{
    public static void main(String[] args)
    {
        System.out.println("------------------------------------------------------------");
        System.out.println("| Dec | Hex  | Oct   | Char |");
        System.out.println("------------------------------------------------------------");
        
        for (int i = 0; i <= 255; i++)
        {
            // Printable ASCII range
            char ch = (char)i;
            String displayChar;

            if (i >= 32 && i <= 126) {
                displayChar = Character.toString(ch);
            } else {
                displayChar = ".";   // non-printable shown as dot
            }
            
            System.out.printf("| %3d | 0x%02X | %03o  |  %-3s |\n", i, i, i, displayChar);
        }

        System.out.println("------------------------------------------------------------");
    }
}