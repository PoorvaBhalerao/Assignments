// Write a generic program to accept N values and return addition of that values

#include<iostream>
using namespace std;

template <class T>
T AddN(T *Arr, int iSize)
{
    T Sum =0;
    int iCNt = 0;
    for(iCNt = 0; iCNt < iSize; iCNt++)
    {
        Sum = Sum + Arr[iCNt];
    }
    

    return Sum;
}

int main()
{
    int Arr[] = {10,20,30,40,50};

    int iSum = AddN(Arr,5);
    cout<<"Addition is: "<<iSum<<"\n";

    float Brr[] = {10.05f,20.05f,30.05f,40.05f,50.05f};

    float fSum = AddN(Brr,5);

    cout<<"Addition is: "<<fSum<<"\n";

    return 0;
}