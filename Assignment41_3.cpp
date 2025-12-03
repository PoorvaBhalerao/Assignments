// write a recursive program to accept string from user and count number of characters

#include<iostream>
#include<string>
using namespace std;

int StrlenX(char *str)
{
    static int iCount = 0;
    static int i = 0;

    if(str[i] != '\0')
    {
        iCount++;
        i++;
        StrlenX(str);
    }

    return iCount;
}

int main()
{
    char Arr[] = {'\0'};
    int iRet = 0;

    cout<<"Enter a string: "<<"\n";
    scanf("%[^\n]s",Arr);

    iRet = StrlenX(Arr);

    cout<<"Count of characters in string is: "<<iRet<<"\n";


    return 0;
}