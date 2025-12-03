// Write a recursive program which display below pattern
//Input: 5
//Output:  a    b   c   d   e   

#include<iostream>
using namespace std;

void Display(int iNo)
{
    static char ch = 'a';
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