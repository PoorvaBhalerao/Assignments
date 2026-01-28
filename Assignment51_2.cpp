// Write a generic program which accept N value and find frequency of any particular value
 

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
        int Frequency(T);
        
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
int Display<T> :: Frequency(T Num)
{
    int iCnt = 0;
    int iCount = 0;
    for(iCnt = 0; iCnt < this->iSize; iCnt++)
    {
        if(this->Arr[iCnt] == Num)
        {
            iCount++;
        }
    }
    return iCount;
}



int main()
{
    Display<int> *obj = new Display<int>(10);
    int iRet = 0;
    obj->Accept();
    obj->DisplayOut();
    iRet = obj->Frequency(50);
    cout<<"Frequency is: "<<iRet<<"\n";

    return 0;
}