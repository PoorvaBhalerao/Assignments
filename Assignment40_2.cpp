// Write a recursive program which display below pattern
//Input: 5
//Output:  1   2   3   4   5

#include<iostream>
using namespace std;

void Display(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }
    
    static int i = 1;

    if(i <= iNo)
    {
        cout<<i<<"\t";
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