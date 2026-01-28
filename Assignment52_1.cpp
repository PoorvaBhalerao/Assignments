// Write a generic program to multiply two numbers

#include<iostream>
using namespace std;

template <class T>
T Multiply(T No1, T No2)
{
    T iMult =0;

    iMult = No1 * No2;

    return iMult;
}

int main()
{
    int iRet = Multiply(10,20);

    cout<<"Multiplication is: "<<iRet<<"\n";

    double dRet = Multiply(10.1234, 20.1234);

    cout<<"Multiplication is: "<<dRet<<"\n";

    return 0;
}