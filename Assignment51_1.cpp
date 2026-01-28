// Write a generic program which accept one value and one number from user and Print that value that number of times on screen.

// Input: M   7
// output: M    M   M    M   M    M   M   

#include<iostream>
using namespace std;

template <class T>
class Display
{
    public:
        T Value;
        int No;

        Display();
        void Accept();
        void DisplayOut();
        
};

template <class T>
Display<T> :: Display()
{
    cout<<"Object gets created\n";
    Value = 0;
    No = 0;
}

template <class T>
void Display<T> :: Accept()
{
    cout<<"Enter a value you want to print: "<<"\n";
    cin>>Value;

    cout<<"Enter a number: \n";
    cin>>No;
}

template <class T>
void Display<T> :: DisplayOut()
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= No; iCnt++)
    {
        cout<<Value<<"\t";
    }
}

int main()
{
    Display<char> *obj = new Display<char>();

    obj->Accept();
    obj->DisplayOut();

    return 0;
}