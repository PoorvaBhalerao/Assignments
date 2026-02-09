// Write a recursive program which accepts a number from user and return largest digit from that number
//Ip: 895210
//op: 9

#include<iostream>
using namespace std;

void Reverse(int iNo)
{
    int iDigit = 0;
    if(iNo > 0)
    {
        iDigit = iNo % 10;
        cout<<iDigit;
        Reverse(iNo/10);
    }
   
}


int main()
{
    int iValue = 0;

    cout<<"Enter a number: "<<"\n";
    cin>>iValue;

    Reverse(iValue);

    return 0;
}