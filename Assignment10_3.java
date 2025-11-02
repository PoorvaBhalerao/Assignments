// Write a program to accept distance in Kilometer and convert it into meter
//1 Km = 1000 m

import java.util.Scanner;

class Demo
{
    public float Distance(float Distance)
    {
        float fAns = 0.0f;
        
        fAns = Distance * 1000;

        return fAns;
    }
}


class Assignment10_3
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Distance in KiloMeters:");
    
        float fvalue1 = sobj.nextFloat();

        Demo dobj = new Demo();

        float iRet = dobj.Distance(fvalue1);

        System.out.println("Distance in Meter is: "+iRet);
    }
}