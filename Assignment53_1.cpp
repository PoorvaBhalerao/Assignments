// Write a generic program to copy contents of one array to another

#include<iostream>
using namespace std;

template <class T>
void CopyArray(T *src, T *dest, int iSize)
{
    int iCnt = 0;

    for(iCnt = iSize-1; iCnt>=0; iCnt--)
    {
        dest[iCnt ]= src[iCnt];
    }

    cout<<"Copied contents are: \n";
    for(iCnt = 0;iCnt < iSize; iCnt++)
    {
        cout<<dest[iCnt]<<"\t";
    }

}

int main()
{
    int iLength = 0, iCnt = 0;
    char *Arr = '\0';
    char *Brr = '\0';
    
    cout<<"How many elements do you want to enter: "<<"\n";
    cin>>iLength;

    Arr = new char[iLength];
    Brr = new char[iLength];

    cout<<"Enter elements: \n";
    for(iCnt = 0;iCnt < iLength; iCnt++)
    {
        cin>>Arr[iCnt];
    }
    
    CopyArray(Arr, Brr, iLength);

    return 0;
}