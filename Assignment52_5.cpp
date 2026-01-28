// Write a generic program to accept N values and return Smallest of that values

#include<iostream>
using namespace std;

template <class T>
T Smallest(T *Arr, int iSize)
{
    T Small =0;
    int iCNt = 0;
    Small = Arr[0];
    for(iCNt = 0; iCNt < iSize; iCNt++)
    {
        if(Arr[iCNt] < Small)
        {
            Small = Arr[iCNt];
        }
    }
    return Small;
}

int main()
{
    int Arr[] = {10,20,30,40,50};

    int iRet = Smallest(Arr,5);
    cout<<"Smallest is: "<<iRet<<"\n";

    float Brr[] = {10.05f,20.05f,30.05f,40.05f,50.05f};

    float fRet = Smallest(Brr,5);

    cout<<"Smallest is: "<<fRet<<"\n";

    return 0;
}