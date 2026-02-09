// Write a recursive program which accepts a string from user and count number of small characters
//Ip:PoorVa
//op: 4

#include<iostream>
using namespace std;

int CountSmall(char *str)
{
    static int iSmall = 0;
    if(*str == '\0')
        return 0;

    if(*str != '\0')
    {
        if((*str >= 'a') & (*str <= 'z'))
        {
            iSmall++;
        }
        CountSmall(str + 1);
    }
    return iSmall;
}


int main()
{
    char Arr[50] = {'\0'};

    cout<<"Enter a string: \n";
    cin.getline(Arr, 50);

    cout<<"Number of small characters are: "<<CountSmall(Arr)<<"\n";

    return 0;
}