// Write a recursive program which accepts number from user and display summation of its digits
//Input: 852
//Output: 15
 
#include<iostream>
using namespace std;

int Summation(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(iNo == 0)
    {
        return 0;
    }

    static int iSum = 0;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iSum = iSum + iDigit;
        iNo = iNo / 10;
        Summation(iNo);
    }
    return iSum;
}

int main()
{
   int iValue = 0, iRet = 0;

    cout<<"Enter a number: "<<"\n";
    cin>>iValue;

    iRet = Summation(iValue);

    cout<<"Summation of digit is: "<<iRet<<"\n";
    return 0;   
}