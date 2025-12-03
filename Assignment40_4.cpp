// Write a recursive program which display below pattern
//Input: 5
//Output:  A    B   C   D   E   

#include<iostream>
using namespace std;

void Display(int iNo)
{
    static char ch = 'A';
    static int i = 1;

    if(i <= iNo)
    {
        cout<<ch<<"\t";
        ch++;
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