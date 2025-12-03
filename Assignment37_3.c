// Write a program to accept a string and accept on character and return index of first occurence of that character in string

#include<stdio.h>
#include<stdbool.h>

int FirstOcc(char *str, char ch)
{
    int iCnt = 1;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            break;
        }
        str++;
        iCnt++;
    }
    return iCnt;
}

int main()
{
    char Arr[] = {'\0'};
    int iRet = 0;
    char cValue = '\0';

    printf("Enter a String: \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter a character: \n");
    scanf(" %c",&cValue);

    iRet = FirstOcc(Arr, cValue);
    
    printf("Index of first occurence of %c is %d\n",cValue,iRet);

    return 0;
}