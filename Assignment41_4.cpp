// Write a recursive program which accepts number from user and display factorial 
//Input: 5
//Output: 120
 
#include<iostream>
using namespace std;

int Factorial(int iNo)
{
    if(iNo < 0)
    {
        iNo = -iNo;
    }

    if(iNo == 0)
    {
        return 0;
    }

    static int iFact = 1;

    if(iNo > 0)
    {
        iFact = iFact * iNo;
        iNo--;        
        Factorial(iNo);
    }
    return iFact;
}

int main()
{
   int iValue = 0, iRet = 0;

    cout<<"Enter a number: "<<"\n";
    cin>>iValue;

    iRet = Factorial(iValue);

    cout<<"Factorial is: "<<iRet<<"\n";
    return 0;   
}