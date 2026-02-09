// Write a recursive program which accepts a string from user and write a recursive program
//Ip: HeL Lo Wror LD
//op: 3

#include<iostream>
using namespace std;

int CountWhiteSpaces(char *str)
{
    if(*str == '\0')
        return 0;

    return (*str == ' ') + CountWhiteSpaces(str + 1);
}


int main()
{
    char Arr[50] = {'\0'};

    cout<<"Enter a string: \n";
    cin.getline(Arr, 50);

    cout<<"Count of white spaces are: "<<CountWhiteSpaces(Arr)<<"\n";

    return 0;
}