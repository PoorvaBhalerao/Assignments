// Write a program to accept a string and accept on character and return index of last occurence of that character in string

#include<stdio.h>
#include<stdbool.h>

int LastOcc(char *str, char ch)
{
    int iCnt = 0;
    int LastIndex = -1;

    while(str[iCnt] != '\0')
    {
        if(str[iCnt] == ch)
        {
            LastIndex = iCnt;
        }
        iCnt++;
    }
    return LastIndex+1;
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

    iRet = LastOcc(Arr, cValue);
    
    printf("Index of last occurence of %c is %d\n",cValue,iRet);

    return 0;
}