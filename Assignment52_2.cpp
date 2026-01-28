// Write a generic program to find Largest number from three numbers

#include<iostream>
using namespace std;

template <class T>
T Largest(T No1, T No2, T No3)
{
    T Larg =0;

    if(No1 > No2 && No1 > No3)
    {
        Larg = No1;
    }
    else if(No2 > No3)
    {
        Larg = No2;
    }
    else
    {
        Larg = No3;
    }

    return Larg;
}

int main()
{
    int iRet = Largest(10,20,30);

    cout<<"Largest number is: "<<iRet<<"\n";

    double dRet = Largest(10.1234, 20.1234, 30.1234);

    cout<<"Largest number is: "<<dRet<<"\n";

    return 0;
}