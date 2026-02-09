// Write a recursive program which accepts a number from user and return largest digit from that number
//Ip: 895210
//op: 9

#include<iostream>
using namespace std;

int LargeDigit(int iNo)
{
    static int iLarge = 0;

    int iDigit = 0;
    if(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit > iLarge)
        {
            iLarge = iDigit;
        }
        LargeDigit(iNo/10);
    }
    return iLarge;
}


int main()
{
    int iValue = 0;

    cout<<"Enter a number: "<<"\n";
    cin>>iValue;

    cout<<"Largest digit is: "<<LargeDigit(iValue)<<"\n";

    return 0;
}