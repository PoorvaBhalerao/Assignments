// Write a recursive program which display given pattern
//Input: 5
//Ouput: *  *   *   *   *

#include<iostream>
using namespace std;

void Display(int iNo)
{
    static int i = 1;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(i <= iNo)
    {
        cout<<"*\t";
        i++;
        Display(iNo);
    }
}

int main()
{
    int iValue = 0;

    cout<<"Enter a number: "<<"\n";
    cin>>iValue;

    Display(iValue);

    return 0;   
}