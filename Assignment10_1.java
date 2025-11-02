//Write a program which accepts radius of circle and gives Area of Circle
//Consider PI = 3.14
//Area of Circle = PI * radius * radius


import java.util.Scanner;

class Circle
{
    public float Area(float fNo)
    {
        float fAns = 0.0f;
        float PI = 3.14f;

        fAns = PI * iNo * iNo;

        return fAns;
    }
}


class Assignment10_1
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Radius:");
    
        float fValue = sobj.nextFloat();

        Circle dobj = new Circle();

        float iRet =dobj.Area(iValue);

        System.out.println("Area of Circle is: "+iRet);
    }
}