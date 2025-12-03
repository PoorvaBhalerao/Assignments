// Write a recursive program which accepts number from user and display summation of its digits
//Input: 852
//Output: 15
 
#include<iostream>
using namespace std;

int Product(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(iNo == 0)
    {
        return 0;
    }

    static int iProd = 1;
    int iDigit = 0;

    if(iNo != 0)
    {
        iDigit = iNo % 10;
        iProd = iProd *iDigit;
        iNo = iNo / 10;
        Product(iNo);
    }
    return iProd;
}

int main()
{
   int iValue = 0, iRet = 0;

    cout<<"Enter a number: "<<"\n";
    cin>>iValue;

    iRet = Product(iValue);

    cout<<"Product of digit is: "<<iRet<<"\n";
    return 0;   
}