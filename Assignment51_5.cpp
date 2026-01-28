//Accept N values from user and reverse the contents

// Write a generic program which accept N value and find first occurence of any particular value 

#include<iostream>
using namespace std;

template <class T>
class Display
{
    public:
        T *Arr;
        int iSize;

        Display(int);
        void Accept();
        void DisplayOut();
        void Reverse();
        
};

template <class T>
Display<T> :: Display(int no)
{
    cout<<"Object gets created\n";
    this->iSize = no;
    this->Arr = new T[iSize]; 
}

template <class T>
void Display<T> :: Accept()
{
    
    cout<<"Enter elements: "<<"\n";
    int iCnt = 0;
    for(iCnt = 0; iCnt < this->iSize; iCnt++)
    {
        cin>>this->Arr[iCnt];
    }
    cout<<"\n";

}

template <class T>
void Display<T> :: DisplayOut()
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < this->iSize; iCnt++)
    {
        cout<<this->Arr[iCnt]<<"\t";
    }
    cout<<"\n";
}


template <class T>
void Display<T> :: Reverse()
{
    int iCnt = 0;
    cout<<"Reversed elements are: \n";
    for(iCnt = iSize-1; iCnt >= 0; iCnt--)
    {
        cout<<Arr[iCnt]<<"\t";
    }
    cout<<"\n";
}


int main()
{
    Display<char> *obj = new Display<char>(10);
    obj->Accept();
    obj->DisplayOut();
    obj->Reverse();
    

    return 0;
}