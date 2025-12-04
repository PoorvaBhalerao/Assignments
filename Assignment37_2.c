// Write a program to accept a string and accept on character and count frequency of  character .

#include<stdio.h>
#include<stdbool.h>

int Frequency(char *str, char ch)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            iCount++;
        }
        str++;
    }
    return iCount;
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

    iRet = Frequency(Arr, cValue);
    
    printf("Frequency of %c is %d\n",cValue,iRet);

    return 0;
}