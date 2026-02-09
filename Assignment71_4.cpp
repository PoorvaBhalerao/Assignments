// Write a recursive program which accepts a number from user and return largest digit from that number
//Ip: 895210
//op: 9

#include<iostream>
using namespace std;

int SmallDigit(int iNo)
{
    static int iSmall = iNo%10;

    int iDigit = 0;
    if(iNo > 0)
    {
        iDigit = iNo % 10;
        if(iDigit < iSmall)
        {
            iSmall = iDigit;
        }
        SmallDigit(iNo/10);
    }
    return iSmall;
}


int main()
{
    int iValue = 0;

    cout<<"Enter a number: "<<"\n";
    cin>>iValue;

    cout<<"Smallest digit is: "<<SmallDigit(iValue)<<"\n";

    return 0;
}