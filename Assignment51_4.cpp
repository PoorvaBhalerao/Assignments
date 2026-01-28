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
        int LastOccurence(T);
        
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
int Display<T> :: LastOccurence(T Num)
{
    int iCnt = 0;
    int iCount = 1;
    for(iCnt = 0; iCnt < this->iSize; iCnt++)
    {
        if(this->Arr[iCnt] == Num)
        {
            iCount = iCnt+1;   
        }
    
    }
    return iCount;
}



int main()
{
    Display<char> *obj = new Display<char>(10);
    int Ret = 0;
    obj->Accept();
    obj->DisplayOut();
    Ret = obj->LastOccurence('p');
    cout<<"Last Occurence is at: "<<Ret<<"\n";

    return 0;
}