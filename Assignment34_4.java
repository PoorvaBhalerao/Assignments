// Accept character from user and check it is symbol or not(~,!,@,#,$.%,^,&,*)

import java.util.Scanner;
class Logic
{
    public boolean Display(char ch)
    {
        boolean bFlag = false;
        if((ch == '~') || (ch =='!') || (ch == '@') || (ch =='#') || (ch == '$') || (ch =='%') || (ch == '^') || (ch == '&') || (ch == '*'))
        {
            bFlag = true;
        }
    
        return bFlag;
    }
}

class Assignment34_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char cValue = sobj.next().charAt(0);

        Logic lobj = new Logic();
        boolean bRet =lobj.Display(cValue);   
        
        if(bRet == true)
        {
            System.out.println("It is a Symbol");
        }
        else
        {
            System.out.println("It is not a Symbol");
        }

    }
}