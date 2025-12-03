// Write a recursive program which display below pattern
//Input: 5
//Output:  5    4   3   2   1   

#include<iostream>
using namespace std;

void Display(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    static int i = iNo;

    if(i >= 1)
    {
        cout<<i<<"\t";
        i--;
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