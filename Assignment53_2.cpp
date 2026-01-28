// Write a generic program to check whether Array is sorted or not

#include<iostream>
using namespace std;

template <class T>
bool CheckSorted(T *src, int iSize)
{
    int iCnt = 0, i = 0;
    bool bFlag = true;
    for(iCnt = 0; iCnt < iSize-1; iCnt++)
    {
        if(src[i] > src[i+1])
        {
            bFlag = false;
            break;
        }
        i++;
    }

    return bFlag;

}

int main()
{
    int iLength = 0, iCnt = 0;
    int *Arr = NULL;
    
    cout<<"How many elements do you want to enter: "<<"\n";
    cin>>iLength;

    Arr = new int[iLength];

    cout<<"Enter elements: \n";
    for(iCnt = 0;iCnt < iLength; iCnt++)
    {
        cin>>Arr[iCnt];
    }
    
    bool bRet = CheckSorted(Arr, iLength);
    if(bRet == true)
    {
        cout<<"Array is sorted\n";
    }
    else
    {
        cout<<"Array is not sorted\n";
    }

    return 0;
}