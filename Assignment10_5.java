// Write a program which accepts area in sq.feet and convert it in sq. meter
//1 sq.feet = 0.0929 sq. meter

import java.util.Scanner;

class Demo
{
    public double Area(double area)
    {
        
        double dAns = 0.0;

        dAns = area * (0.0929);       

        return dAns;
    }
}


class Assignment10_5
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Area in Sq.Feet:");
    
        double fvalue1 = sobj.nextDouble();

        Demo dobj = new Demo();

        double iRet = dobj.Area(fvalue1);

        System.out.println("Area in Sq.Meter is: "+iRet);
    }
}