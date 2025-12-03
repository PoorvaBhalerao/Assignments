// Accept division of student on the division display time of exam,there are 4 divisions in school
//exam of division A is at 7AM, exam of division B is at 8:30AM, exam of division C is at 9:20AM and exam of division D is at 10:30AM

import java.util.Scanner;
class Logic
{
    public void Display(char ch)
    {
        switch (ch) 
        {
            case 'A':
                System.out.println("Exam time: 7AM");
                break;

            case 'B':
                System.out.println("Exam time: 8:30AM");
                break;

            case 'C':
                System.out.println("Exam time: 9:20AM");
                break;

            case 'D':
                System.out.println("Exam time: 10:30AM");
                break;
        
            default:
                System.out.println("Invalid Division");
                break;
        }
    }
}

class Assignment33_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Division(A/B/C/D): ");
        char cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();
        lobj.Display(cValue);

    }
}