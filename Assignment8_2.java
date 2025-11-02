// Accept single digit number from user and print it into word


import java.util.Scanner;

class Demo
{
    public int iNo;

    public Demo()
    {
        iNo = 0;
    }

    public void Display(int iNo)
    {
        if(iNo > 9 || iNo < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        switch (iNo) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
        
            default:
                break;
        }
        
    }
}


class Assignment8_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter a single digit number:");
        int iValue = sobj.nextInt();

        Demo dobj = new Demo();

        dobj.Display(iValue);

    }
}