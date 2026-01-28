// Write a generic program to accept N values and return Largest of that values

#include<iostream>
using namespace std;

template <class T>
T Largest(T *Arr, int iSize)
{
    T Large =0;
    int iCNt = 0;
    Large = Arr[0];
    for(iCNt = 0; iCNt < iSize; iCNt++)
    {
        if(Arr[iCNt] > Large)
        {
            Large = Arr[iCNt];
        }
    }
    return Large;
}

int main()
{
    int Arr[] = {10,20,30,40,50};

    int iRet = Largest(Arr,5);
    cout<<"Largest is: "<<iRet<<"\n";

    float Brr[] = {10.05f,20.05f,30.05f,40.05f,50.05f};

    float fRet = Largest(Brr,5);

    cout<<"Largest is: "<<fRet<<"\n";

    return 0;
}