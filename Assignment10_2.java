// Write a program which accepts Width and height of rectangle and calculate its Area
//Area = width * Height

import java.util.Scanner;

class Demo
{
    public float Area(float Width, float height)
    {
        float fAns = 0.0f;
        

        fAns = Width * height;

        return fAns;
    }
}


class Assignment10_2
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Width:");
    
        float fvalue1 = sobj.nextFloat();

        System.out.println("Enter Height:");
    
        float fValue2 = sobj.nextFloat();


        Demo dobj = new Demo();

        float iRet =dobj.Area(fvalue1,fValue2);

        System.out.println("Area of Rectangle is: "+iRet);
    }
}