// Write a program which accepts temperature in Fahrenheit and convert it into celcius.
//1 celcius = (Fahrenheit - 32) *(5/9)

import java.util.Scanner;

class Demo
{
    public double Temperature(float temp)
    {
        float fAns1 = 0.0f;
        double dAns = 0.0f;

        
        fAns1 = (temp - 32);
        
        dAns = fAns1 * 0.555;
        

        return dAns;
    }
}


class Assignment10_4
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit:");
    
        float fvalue1 = sobj.nextFloat();

        Demo dobj = new Demo();

        double iRet = dobj.Temperature(fvalue1);

        System.out.println("Temperature in celcius is: "+iRet+" % celcius");
    }
}